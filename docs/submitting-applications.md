---
layout: global
title: 提交应用程序
---

Spark `bin`目录中的`spark-submit`脚本用于在集群上启动应用程序。它可以通过统一的界面使用Spark所有受支持的[集群管理器](http://spark-cn.cn/cluster-overview.html#cluster-manager-types)，因此您不必为每个应用程序做特殊配置。

# 打包应用程序依赖

如果您的代码依赖于其他项目，则需要将它们打包在您的应用程序中，以便将代码分发到Spark集群。为此，请创建一个包含您的代码及其依赖项的assembly jar包（或“uber” jar）。无论 [SBT](https://github.com/sbt/sbt-assembly)和 [Maven的](http://maven.apache.org/plugins/maven-shade-plugin/) 有assembly插件。创建assembly jar时，将Spark和Hadoop列出为`provided`依赖项；这些不需要打包，因为它们是由集群管理器在运行时提供的。打包好jar后，可以传调用`bin/spark-submit`来分发jar包。

对于 Python 来说，您可以使用 `spark-submit` 的 `--py-files` 参数来添加 `.py`，`.zip` 和 `.egg` 文件以与您的应用程序一起分发。如果您依赖了多个 Python 文件我们推荐将它们打包成一个 `.zip` 或者 `.egg` 文件。

# 用spark-submit启动应用程序

打包应用程序后，可以使用`bin/spark-submit`脚本启动它。该脚本负责使用Spark及其依赖项设置类路径，并且可以支持不同的集群管理器和Spark支持的部署模式：

{% highlight bash %}
./bin/spark-submit \
  --class <main-class> \
  --master <master-url> \
  --deploy-mode <deploy-mode> \
  --conf <key>=<value> \
  ... # other options
  <application-jar> \
  [application-arguments]
{% endhighlight %}

一些常见的选项

* `--class`：您的应用程序的入口（例如`org.apache.spark.examples.SparkPi`）
* `--master`: 集群的[master URL](#master-urls)（如 `spark://23.195.26.187:7077`）
* `--deploy-mode`：将你的程序在 worker 节点 部署（`cluster` ）还是将本地 （`client`机）器作为外部客户端部署 （默认： `client` ）<b> &#8224; </b>
* `--conf`：key=value 格式的 Spark 配置属性。对于包含空格的值，将“ key = value”用引号引起来。多个配置应作为单独的参数传递。（例如`--conf <key>=<value> --conf <key2>=<value2>`）
* `application-jar`：jar包的路径，包括您的应用程序和所有依赖项。URL必须在群集内部全局可见，例如，`hdfs://`路径或所有节点上都存在的`file://`路径。
* `application-arguments`：传递给mian()方法的参数（如果有）

**†**常见的部署策略是从与worker机器位于同一物理网关计算机（例如，standalone EC2群集中的主节点）提交应用程序。在此设置中，`client`模式是合适的。在`client`模式下，driver直接在`spark-submit`进程中启动，该进程充当集群的*客户端*。应用程序的输入和输出直接在控制台进行。因此，此模式特别适用于涉及REPL的应用程序（例如Spark Shell）。

或者，如果您的应用程序是从距离worker机器比较远的计算机（例如本地笔记本电脑）提交的，则通常使用`cluster`模式来最大程度地减少driver和executor之间的网络延迟。当前，standalone模式不支持Python应用程序的集群模式。

对于Python应用程序，在`<application-jar>` 的位置传递一个`.py`文件而不是JAR包，并且可以用 `--py-files` 添加 Python `.zip`，`.egg` 或者 `.py` 文件到 search path（搜索路径）。

有一些特定的[集群管理器的](http://spark-cn.cn/cluster-overview.html#cluster-manager-types)可用选项 。例如，对于具有部署模式的[Spark standalone cluster](http://spark-cn.cn/spark-standalone.html)`cluster`，您还可以指定`--supervise`以确保驱动程序在非零退出代码失败的情况下自动重新启动。要枚举所有可用的此类选项，请运行`spark-submit`的`--help`参数。以下是一些常见选项的示例：

{% highlight bash %}
# Run application locally on 8 cores
./bin/spark-submit \
  --class org.apache.spark.examples.SparkPi \
  --master local[8] \
  /path/to/examples.jar \
  100

# Run on a Spark standalone cluster in client deploy mode
./bin/spark-submit \
  --class org.apache.spark.examples.SparkPi \
  --master spark://207.184.161.138:7077 \
  --executor-memory 20G \
  --total-executor-cores 100 \
  /path/to/examples.jar \
  1000

# Run on a Spark standalone cluster in cluster deploy mode with supervise
./bin/spark-submit \
  --class org.apache.spark.examples.SparkPi \
  --master spark://207.184.161.138:7077 \
  --deploy-mode cluster \
  --supervise \
  --executor-memory 20G \
  --total-executor-cores 100 \
  /path/to/examples.jar \
  1000

# Run on a YARN cluster
export HADOOP_CONF_DIR=XXX
./bin/spark-submit \
  --class org.apache.spark.examples.SparkPi \
  --master yarn \
  --deploy-mode cluster \  # can be client for client mode
  --executor-memory 20G \
  --num-executors 50 \
  /path/to/examples.jar \
  1000

# Run a Python application on a Spark standalone cluster
./bin/spark-submit \
  --master spark://207.184.161.138:7077 \
  examples/src/main/python/pi.py \
  1000

# Run on a Mesos cluster in cluster deploy mode with supervise
./bin/spark-submit \
  --class org.apache.spark.examples.SparkPi \
  --master mesos://207.184.161.138:7077 \
  --deploy-mode cluster \
  --supervise \
  --executor-memory 20G \
  --total-executor-cores 100 \
  http://path/to/examples.jar \
  1000

# Run on a Kubernetes cluster in cluster deploy mode
./bin/spark-submit \
  --class org.apache.spark.examples.SparkPi \
  --master k8s://xx.yy.zz.ww:443 \
  --deploy-mode cluster \
  --executor-memory 20G \
  --num-executors 50 \
  http://path/to/examples.jar \
  1000

{% endhighlight %}

# Master URLs

传递给Spark的主URL可以采用以下格式之一：

<table class="table">
<tr><th>Master URL</th><th>含义</th></tr>
<tr><td> <code>local</code> </td><td> 使用一个工作线程在本地运行Spark（即完全没有并行性）。 </td></tr>
<tr><td> <code>local[K]</code> </td><td> 使用K个工作线程在本地运行Spark（最好将其设置为计算机上的内核数）。 </td></tr>
<tr><td> <code>local[K,F]</code> </td><td> 
  使用K个工作线程和F个maxFailures在本地运行Spark（有关此变量的说明，请参见<a href="configuration.html#scheduling">spark.task.maxFailures</a>） </td></tr>
<tr><td> <code>local[*]</code> </td><td> Run Spark locally with as many worker threads as logical cores on your machine.</td></tr>
<tr><td> <code>local[*,F]</code> </td><td> Run Spark locally with as many worker threads as logical cores on your machine and F maxFailures.</td></tr>
<tr><td> <code>spark://HOST:PORT</code> </td><td> Connect to the given <a href="spark-standalone.html">Spark standalone
        cluster</a> master. The port must be whichever one your master is configured to use, which is 7077 by default.
</td></tr>
<tr><td> <code>spark://HOST1:PORT1,HOST2:PORT2</code> </td><td> Connect to the given <a href="spark-standalone.html#standby-masters-with-zookeeper">Spark standalone
        cluster with standby masters with Zookeeper</a>. The list must have all the master hosts in the high availability cluster set up with Zookeeper. The port must be whichever each master is configured to use, which is 7077 by default.
</td></tr>
<tr><td> <code>mesos://HOST:PORT</code> </td><td> Connect to the given <a href="running-on-mesos.html">Mesos</a> cluster.
        The port must be whichever one your is configured to use, which is 5050 by default.
        Or, for a Mesos cluster using ZooKeeper, use <code>mesos://zk://...</code>.
        To submit with <code>--deploy-mode cluster</code>, the HOST:PORT should be configured to connect to the <a href="running-on-mesos.html#cluster-mode">MesosClusterDispatcher</a>.
</td></tr>
<tr><td> <code>yarn</code> </td><td> Connect to a <a href="running-on-yarn.html"> YARN </a> cluster in
        <code>client</code> or <code>cluster</code> mode depending on the value of <code>--deploy-mode</code>.
        The cluster location will be found based on the <code>HADOOP_CONF_DIR</code> or <code>YARN_CONF_DIR</code> variable.
</td></tr>
<tr><td> <code>k8s://HOST:PORT</code> </td><td> Connect to a <a href="running-on-kubernetes.html">Kubernetes</a> cluster in
        <code>cluster</code> mode. Client mode is currently unsupported and will be supported in future releases.
        The <code>HOST</code> and <code>PORT</code> refer to the <a href="https://kubernetes.io/docs/reference/generated/kube-apiserver/">Kubernetes API Server</a>.
        It connects using TLS by default. In order to force it to use an unsecured connection, you can use
        <code>k8s://http://HOST:PORT</code>.
</td></tr>
</table>


# Loading Configuration from a File

The `spark-submit` script can load default [Spark configuration values](configuration.html) from a
properties file and pass them on to your application. By default, it will read options
from `conf/spark-defaults.conf` in the Spark directory. For more detail, see the section on
[loading default configurations](configuration.html#loading-default-configurations).

Loading default Spark configurations this way can obviate the need for certain flags to
`spark-submit`. For instance, if the `spark.master` property is set, you can safely omit the
`--master` flag from `spark-submit`. In general, configuration values explicitly set on a
`SparkConf` take the highest precedence, then flags passed to `spark-submit`, then values in the
defaults file.

If you are ever unclear where configuration options are coming from, you can print out fine-grained
debugging information by running `spark-submit` with the `--verbose` option.

# Advanced Dependency Management
When using `spark-submit`, the application jar along with any jars included with the `--jars` option
will be automatically transferred to the cluster. URLs supplied after `--jars` must be separated by commas. That list is included in the driver and executor classpaths. Directory expansion does not work with `--jars`.

Spark uses the following URL scheme to allow different strategies for disseminating jars:

- **file:** - Absolute paths and `file:/` URIs are served by the driver's HTTP file server, and
  every executor pulls the file from the driver HTTP server.
- **hdfs:**, **http:**, **https:**, **ftp:** - these pull down files and JARs from the URI as expected
- **local:** - a URI starting with local:/ is expected to exist as a local file on each worker node.  This
  means that no network IO will be incurred, and works well for large files/JARs that are pushed to each worker,
  or shared via NFS, GlusterFS, etc.

Note that JARs and files are copied to the working directory for each SparkContext on the executor nodes.
This can use up a significant amount of space over time and will need to be cleaned up. With YARN, cleanup
is handled automatically, and with Spark standalone, automatic cleanup can be configured with the
`spark.worker.cleanup.appDataTtl` property.

Users may also include any other dependencies by supplying a comma-delimited list of Maven coordinates
with `--packages`. All transitive dependencies will be handled when using this command. Additional
repositories (or resolvers in SBT) can be added in a comma-delimited fashion with the flag `--repositories`.
(Note that credentials for password-protected repositories can be supplied in some cases in the repository URI,
such as in `https://user:password@host/...`. Be careful when supplying credentials this way.)
These commands can be used with `pyspark`, `spark-shell`, and `spark-submit` to include Spark Packages.

For Python, the equivalent `--py-files` option can be used to distribute `.egg`, `.zip` and `.py` libraries
to executors.

# More Information

Once you have deployed your application, the [cluster mode overview](cluster-overview.html) describes
the components involved in distributed execution, and how to monitor and debug applications.
