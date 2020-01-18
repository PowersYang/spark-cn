---
layout: global
title: RDD编程指南
description: Spark SPARK_VERSION_SHORT 编程指南
---

* This will become a table of contents (this text will be scraped).
{:toc}


# 概述

在较高级别上，每个Spark应用程序都包含一个*驱动程序*，该*程序*运行用户的`main`函数并在集群上执行各种*并行操作*。Spark提供的主要抽象是*弹性分布式数据集*（RDD），它是跨集群节点划分的元素的集合，可以并行操作。通过从Hadoop文件系统（或任何其它Hadoop支持的文件系统）中的文件或驱动程序中现有的Scala集合开始并进行转换来创建RDD。用户还可以要求Spark将RDD *保留*在内存中，以使其能够在并行操作中有效地重用。最后，RDD自动从节点故障中恢复。

Spark中的第二个抽象是可以在并行操作中使用的*共享变量*。默认情况下，当Spark作为一组任务在不同节点上并行运行一个函数时，它会将函数中使用的每个变量的副本传送给每个任务。因为有时候需要在任务之间或任务与驱动程序之间共享变量。Spark支持两种类型的共享变量：*广播变量*（可用于在所有节点上的内存中缓存值）和累加器（只能做“添加”操作，例如计数器和求和）。

本指南将会使用Spark支持的各种语言来进行。如果启动Spark的交互式shell也很简单，Scala用户可以使用`bin/spark-shell`，Python用户可以使用`bin/pyspark` 。

# 与Spark建立连接

<div class="codetabs">

<div data-lang="scala"  markdown="1">
默认情况下，Spark {{site.SPARK_VERSION}} 已经构建好并与 Scala {{site.SCALA_BINARY_VERSION}}一起使用。 （也可以构建Spark和其它版本的Scala一起使用。）要在Scala中编写应用程序，你将需要使用兼容的Scala版本（例如 {{site.SCALA_BINARY_VERSION}}.X）。

要编写Spark应用程序，你需要在Spark上添加Maven依赖项。可通过Maven Central在以下位置获得Spark：

    groupId = org.apache.spark
    artifactId = spark-core_{{site.SCALA_BINARY_VERSION}}
    version = {{site.SPARK_VERSION}}

另外，如果你想访问HDFS群集，则需要添加`hadoop-client`依赖项 。

    groupId = org.apache.hadoop
    artifactId = hadoop-client
    version = <your-hdfs-version>

最后，你需要将一些Spark类导入到程序中。添加以下行：

{% highlight scala %}
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
{% endhighlight %}

（在Spark 1.3.0之前，你需要显式`import org.apache.spark.SparkContext._`启用必要的隐式转换。）

</div>

<div data-lang="java"  markdown="1">

Spark {{site.SPARK_VERSION}} 支持 [lambda表达式](http://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html) 以简洁地编写函数，或者，你可以使用[org.apache.spark.api.java.function](api/java/index.html?org/apache/spark/api/java/function/package-summary.html)包中的类 。

请注意，在Spark 2.2.0中已删除了对Java 7的支持。

要使用Java编写Spark应用程序，你需要添加对Spark的依赖。可通过Maven Central在以下位置获得Spark：

    groupId = org.apache.spark
    artifactId = spark-core_{{site.SCALA_BINARY_VERSION}}
    version = {{site.SPARK_VERSION}}

另外，如果你想访问HDFS群集，则需要添加`hadoop-client`依赖项。

    groupId = org.apache.hadoop
    artifactId = hadoop-client
    version = <your-hdfs-version>

最后，你需要将一些Spark类导入到程序中。添加以下行：

{% highlight java %}
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.SparkConf;
{% endhighlight %}

</div>

<div data-lang="python"  markdown="1">
Spark {{site.SPARK_VERSION}} 适用于Python 2.7+或Python 3.4+。它可以使用标准的CPython解释器，因此可以使用NumPy之类的C库。它还适用于PyPy 2.3+。

请注意，自Spark 3.0.0起不推荐使用Python 2。

Python中的Spark应用程序既可以使用`bin/spark-submit` 运行包含Spark 的脚本，也可以通过将其包含在setup.py中的方式运行为：

{% highlight python %}
    install_requires=[
        'pyspark=={site.SPARK_VERSION}'
    ]
{% endhighlight %}


要在Python中运行Spark应用程序而无需pip安装PySpark，请使用Spark目录中的`bin/spark-submit`脚本。该脚本将加载Spark的Java / Scala库，并允许你将应用程序提交到集群。你还可以`bin/pyspark`用来启动交互式Python Shell。

如果你想访问HDFS数据，则需要使用构建好的PySpark链接到你相应版本的HDFS。 对于常用的HDFS版本，Spark主页上也提供了[预构建的软件包](https://spark.apache.org/downloads.html)。

最后，你需要将一些Spark类导入到程序中。添加以下行：

{% highlight python %}
from pyspark import SparkContext, SparkConf
{% endhighlight %}

PySpark要求driver和workes使用相同的Python版本。默认情况下使用的是PATH中的python版本。你可以通过 `PYSPARK_PYTHON`指定相应的python版本，如：

{% highlight bash %}
$ PYSPARK_PYTHON=python3.4 bin/pyspark
$ PYSPARK_PYTHON=/opt/pypy-2.5/bin/pypy bin/spark-submit examples/src/main/python/pi.py
{% endhighlight %}

</div>

</div>


# 初始化 Spark

<div class="codetabs">

<div data-lang="scala"  markdown="1">
Spark程序必须做的第一件事是创建一个[SparkContext](api/scala/index.html#org.apache.spark.SparkContext)对象，该对象告诉Spark如何访问集群。要创建一个`SparkContext`你首先需要构建一个[SparkConf](api/scala/index.html#org.apache.spark.SparkConf)对象，其中包含有关你的应用程序的信息。

每个JVM只能激活一个SparkContext。在创建新的SparkContext之前，你必须先`stop()`已经激活的SparkContext。

{% highlight scala %}
val conf = new SparkConf().setAppName(appName).setMaster(master)
new SparkContext(conf)
{% endhighlight %}

</div>

<div data-lang="java"  markdown="1">

Spark程序必须做的第一件事是创建一个[JavaSparkContext](api/java/index.html?org/apache/spark/api/java/JavaSparkContext.html)对象，该对象告诉Spark如何访问集群。要创建一个`SparkContext`你首先需要构建一个[SparkConf](api/java/index.html?org/apache/spark/SparkConf.html)对象，其中包含有关你的应用程序的信息。

{% highlight java %}
SparkConf conf = new SparkConf().setAppName(appName).setMaster(master);
JavaSparkContext sc = new JavaSparkContext(conf);
{% endhighlight %}

</div>

<div data-lang="python"  markdown="1">
Spark程序必须做的第一件事是创建一个[SparkContext](api/python/pyspark.html#pyspark.SparkContext)对象，该对象告诉Spark如何访问集群。要创建一个`SparkContext`你首先需要构建一个[SparkConf](api/python/pyspark.html#pyspark.SparkConf)对象，其中包含有关你的应用程序的信息。

{% highlight python %}
conf = SparkConf().setAppName(appName).setMaster(master)
sc = SparkContext(conf=conf)
{% endhighlight %}

</div>

</div>

该`appName`参数是你的应用程序显示在集群UI上的名称。 `master`是[Spark，Mesos或YARN群集URL](submitting-applications.html#master-urls)或特殊的“local”字符串以本地模式运行。实际上，当在集群上运行时，你将不希望`master`在程序中进行硬编码，而是在[启动应用程序`spark-submit`](submitting-applications.html)时通过参数接收。但是，对于本地测试和单元测试，你可以传递“ local”以在内部运行Spark。


## 使用 Shell

<div class="codetabs">

<div data-lang="scala"  markdown="1">
在Spark Shell中，已经在名为`sc`的变量中为你创建了一个特殊的可识别解释器的SparkContext对象。你自己创建的SparkContext对象不会起作用。你可以通过 `--master` 参数指定要连接的主机，可以通过将逗号分隔的列表传递给参数`--jars` 来将JAR添加到类路径。你还可以通过在`--packages`参数中提供逗号分隔的Maven坐标列表，从而将依赖项（例如Spark Packages）添加到Shell会话中。可能存在依赖项的任何其它repository（例如Sonatype）都可以传递给`--repositories`参数。例如，要`bin/spark-shell`在四个内核上运行，请使用：

{% highlight bash %}
$ ./bin/spark-shell --master local[4]
{% endhighlight %}

或者，也可以添加`code.jar`到其类路径中，使用：

{% highlight bash %}
$ ./bin/spark-shell --master local[4] --jars code.jar
{% endhighlight %}

要使用Maven坐标包含依赖项，请执行以下操作：

{% highlight bash %}
$ ./bin/spark-shell --master local[4] --packages "org.example:example:0.1"
{% endhighlight %}

有关选项的完整列表，请运行`spark-shell --help`。 `spark-shell`会在后台调用更通用的[`spark-submit`脚本](submitting-applications.html)。

</div>

<div data-lang="python"  markdown="1">
在Spark Shell中，已经在名为`sc`的变量中为你创建了一个特殊的可识别解释器的SparkContext对象。你自己创建的SparkContext对象不会起作用。你可以通过 `--master` 参数指定要连接的主机，也可以通过将逗号分隔的列表传递到来将Python .zip，.egg或.py文件添加到运行时路径中的`--py-files`参数。你还可以通过在`--packages`参数中提供逗号分隔的Maven坐标列表，从而将依赖项（例如Spark Packages）添加到Shell会话中。可能存在依赖项的任何其它repository（例如Sonatype）都可以传递给`--repositories`参数。Spark软件包具有的所有Python依赖项（在该软件包的requirements.txt中列出）都必须`pip`在必要时使用手动安装。例如在四个内核上运行`bin/pyspark` ，使用：

{% highlight bash %}
$ ./bin/pyspark --master local[4]
{% endhighlight %}

或者，也可以添加`code.py`到搜索路径中（以便以后`import code`使用），请使用：

{% highlight bash %}
$ ./bin/pyspark --master local[4] --py-files code.py
{% endhighlight %}

有关选项的完整列表，请运行`pyspark --help`。 `pyspark`会在后台调用更通用的[`spark-submit`脚本](submitting-applications.html)。

也可以在增强的Python解释器[IPython中](http://ipython.org/)启动PySpark Shell 。PySpark可与IPython 1.0.0及更高版本一起使用。要使用IPython，请在运行时将`PYSPARK_DRIVER_PYTHON`变量设置为：`ipython``bin/pyspark`

{% highlight bash %}
$ PYSPARK_DRIVER_PYTHON=ipython ./bin/pyspark
{% endhighlight %}

要使用Jupyter笔记本（以前称为IPython笔记本），

{% highlight bash %}
$ PYSPARK_DRIVER_PYTHON=jupyter PYSPARK_DRIVER_PYTHON_OPTS=notebook ./bin/pyspark
{% endhighlight %}

你可以通过设置来自定义`ipython`或`jupyter`命令`PYSPARK_DRIVER_PYTHON_OPTS`。

启动Jupyter Notebook服务器后，你可以从“Files”中创建一个新的“ Python 2”notebook。在notebook内部，你可以在尝试Spark之前输入`%pylab inline`命令。

</div>

</div>

# 弹性分布式数据集（RDD）

Spark围绕*弹性分布式数据集*（RDD）的概念展开，RDD是可并行操作的元素的容错集合。创建RDD的方法有两种：*并行化* 驱动程序中的现有集合，或引用外部存储系统（例如共享文件系统，HDFS，HBase或提供Hadoop InputFormat的任何数据源）中的数据集。

##  并行集合

<div class="codetabs">

<div data-lang="scala"  markdown="1">
通过在驱动程序（Scala ）中的现有集合上调用`SparkContext`的`parallelize`方法来创建并行集合`Seq`。复制集合的元素以形成可以并行操作的分布式数据集。例如，以下是创建包含数字1到5的并行化集合的方法：

{% highlight scala %}
val data = Array(1, 2, 3, 4, 5)
val distData = sc.parallelize(data)
{% endhighlight %}

创建后，分布式数据集（`distData`）可以并行操作。例如，我们可能会调用`distData.reduce((a, b) => a + b)`以对数组中的的元素求和。我们稍后将描述对分布式数据集的操作。

</div>

<div data-lang="java"  markdown="1">

通过在驱动程序中现有的上调用`JavaSparkContext`的`parallelize`方法来创建并行集合`Collection`。复制集合的元素以形成可以并行操作的分布式数据集。例如，以下是创建包含数字1到5的并行化集合的方法：

{% highlight java %}
List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
JavaRDD<Integer> distData = sc.parallelize(data);
{% endhighlight %}

创建后，分布式数据集（`distData`）可以并行操作。例如，我们可能会调用`distData.reduce((a, b) -> a + b)`以对列表中的元素求和。我们稍后将描述对分布式数据集的操作。

</div>

<div data-lang="python"  markdown="1">

通过在驱动程序中现有的可迭代对象或集合上调用`SparkContext`的`parallelize`方法来创建并行集合。复制集合的元素以形成可以并行操作的分布式数据集。例如，以下是创建包含数字1到5的并行化集合的方法：

{% highlight python %}
data = [1, 2, 3, 4, 5]
distData = sc.parallelize(data)
{% endhighlight %}

创建后，分布式数据集（`distData`）可以并行操作。例如，我们可以调用`distData.reduce(lambda a, b: a + b)`来对列表中的元素求和。我们稍后将描述对分布式数据集的操作。

</div>

</div>

并行集合的一个重要参数是数据集的*分区*数。Spark将为集群的每个分区运行一个任务。通常，集群中的每个CPU都可以分配2-4个分区。不过Spark也会尝试根据你的集群自动设置分区数。但是你也可以通过将其作为第二个参数传递给`parallelize`（例如`sc.parallelize(data, 10)`）来手动设置它。注意：代码中的某些位置使用术语“切片”（分区的同义词）来保持向后兼容性。

## 外部数据集

<div class="codetabs">

<div data-lang="scala"  markdown="1">
Spark可以从Hadoop支持的任何存储源创建分布式数据集，包括你的本地文件系统，HDFS，Cassandra，HBase，[Amazon S3](http://wiki.apache.org/hadoop/AmazonS3)等。Spark支持文本文件，[SequenceFiles](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/mapred/SequenceFileInputFormat.html)和任何其它Hadoop [InputFormat](http://hadoop.apache.org/docs/stable/api/org/apache/hadoop/mapred/InputFormat.html)。

可以使用`SparkContext`的`textFile`方法创建文本文件RDD 。此方法需要一个文件的URI（本地路径，或`hdfs://`，`s3a://`等），并读取其作为文件中每一行的集合。如：

{% highlight scala %}
scala> val distFile = sc.textFile("data.txt")
distFile: org.apache.spark.rdd.RDD[String] = data.txt MapPartitionsRDD[10] at textFile at <console>:26
{% endhighlight %}

一旦创建，`distFile`就可以对数据集进行操作。例如，我们可以使用`map`和`reduce`操作将所有行的长度相加，如下所示：`distFile.map(s => s.length).reduce((a, b) => a + b)`。

关于使用Spark读取文件的一些注意事项：

* 如果使用本地文件系统，则需要每个worker节点都可以访问到该文件。将文件复制到所有worker服务器，或者使用网络安装的共享文件系统。
* Spark的所有基于文件的输入方法（包括`textFile`）都支持在目录，压缩文件和通配符上运行。例如，你可以使用`textFile("/my/directory")`，`textFile("/my/directory/*.txt")`和`textFile("/my/directory/*.gz")`。
* 该`textFile`方法还采用可选的第二个参数来控制文件的分区数。默认情况下，Spark为文件的每个块创建一个分区（HDFS中的块默认为128MB），但是你也可以通过传递更大的值来请求更大数量的分区。请注意，分区数不能比块数量少。

除了文本文件，Spark的Scala API还支持其它几种数据格式：

* `SparkContext.wholeTextFiles`使你可以读取包含多个小文本文件的目录，并将每个小文本文件作为 (filename, content) 对返回。相比于`textFile`方法，该方法会在每个文件的每一行返回一条记录。分区由数据局部性决定，在某些情况下，数据局部性可能导致分区太少。对于这些情况，`wholeTextFiles`提供一个可选的第二个参数来控制最小数量的分区。
* 对于[SequenceFiles](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/mapred/SequenceFileInputFormat.html)，请使用SparkContext的`sequenceFile[K, V]`方法，其中`K`和`V`是文件中键和值的类型。这些应该是Hadoop的[Writable](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/io/Writable.html)接口的子类，例如[IntWritable](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/io/IntWritable.html)和[Text](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/io/Text.html)。此外，Spark允许你为一些常见的可写对象指定本机类型。例如，`sequenceFile[Int, String]`将自动读取IntWritables和Texts。
* 对于其它Hadoop InputFormat，可以使用该`SparkContext.hadoopRDD`方法，该方法采用任意`JobConf`input format类，键类和值类。可以使用和Hadoop作业相同的输入源。你还可以使用基于新MapReduce API（`org.apache.hadoop.mapreduce`）的`SparkContext.newAPIHadoopRDD`并将其用于InputFormats 。
* `RDD.saveAsObjectFile` 和 `SparkContext.objectFile` 支持将RDD保存在一个简单的Java序列化对象中。尽管它不如Avro这样的专用格式有效，但它提供了一种保存任何RDD的简便方法。

</div>

<div data-lang="java"  markdown="1">

Spark可以从Hadoop支持的任何存储源创建分布式数据集，包括你的本地文件系统，HDFS，Cassandra，HBase，[Amazon S3](http://wiki.apache.org/hadoop/AmazonS3)等。Spark支持文本文件，[SequenceFiles](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/mapred/SequenceFileInputFormat.html)和任何其它Hadoop [InputFormat](http://hadoop.apache.org/docs/stable/api/org/apache/hadoop/mapred/InputFormat.html)。

可以使用`SparkContext`的`textFile`方法创建文本文件RDD 。此方法需要一个文件的URI（本地路径，或`hdfs://`，`s3a://`等），并读取其作为行的集合。如：

{% highlight java %}
JavaRDD<String> distFile = sc.textFile("data.txt");
{% endhighlight %}

一旦创建，`distFile`就可以对数据集操作。例如，我们可以使用`map`和`reduce`操作将所有行的长度相加，如下所示：`distFile.map(s -> s.length()).reduce((a, b) -> a + b)`。

关于使用Spark读取文件的一些注意事项：

* 如果使用本地文件系统，则需要每个worker节点都可以访问到该文件。将文件复制到所有worker服务器，或者使用网络安装的共享文件系统。

* Spark的所有基于文件的输入方法（包括`textFile`）都支持在目录，压缩文件和通配符上运行。例如，你可以使用`textFile("/my/directory")`，`textFile("/my/directory/*.txt")`和`textFile("/my/directory/*.gz")`。

* 该`textFile`方法还采用可选的第二个参数来控制文件的分区数。默认情况下，Spark为文件的每个块创建一个分区（HDFS中的块默认为128MB），但是你也可以通过传递更大的值来请求更大数量的分区。分区数不能比块数量少。

除了文本文件，Spark的Java API还支持其它几种数据格式：

* `JavaSparkContext.wholeTextFiles`使你可以读取包含多个小文本文件的目录，并将每个小文本文件作为 (filename, content)对返回。与相比`textFile`，该方法会在每个文件的每一行返回一条记录。
* 对于[SequenceFiles](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/mapred/SequenceFileInputFormat.html)，请使用SparkContext的`sequenceFile[K, V]`方法，其中`K`和`V`是文件中键和值的类型。这些是Hadoop的[Writable](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/io/Writable.html)接口的子类，例如[IntWritable](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/io/IntWritable.html)和[Text](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/io/Text.html)。
* 对于其它Hadoop InputFormat，可以使用该`JavaSparkContext.hadoopRDD`方法，该方法采用任意`JobConf`input format类，键类和值类。可以使用和Hadoop作业相同的输入源。你还可以使用基于新MapReduce API（`org.apache.hadoop.mapreduce`）的`JavaSparkContext.newAPIHadoopRDD`并将其用于InputFormats 。
* `JavaRDD.saveAsObjectFile`和`JavaSparkContext.objectFile`支持以包含序列化Java对象的格式保存RDD。尽管它不如Avro这样的专用格式有效，但它提供了一种保存任何RDD的简便方法。

</div>

<div data-lang="python"  markdown="1">

PySpark可以从Hadoop支持的任何存储源创建分布式数据集，包括你的本地文件系统，HDFS，Cassandra，HBase，[Amazon S3](http://wiki.apache.org/hadoop/AmazonS3)等。Spark支持文本文件，[SequenceFiles](https://hadoop.apache.org/docs/stable/api/org/apache/hadoop/mapred/SequenceFileInputFormat.html)和任何其它Hadoop [InputFormat](http://hadoop.apache.org/docs/stable/api/org/apache/hadoop/mapred/InputFormat.html)。

可以使用`SparkContext`的`textFile`方法创建文本文件RDD 。此方法需要一个文件URI（本地路径，或`hdfs://`，`s3a://`等），并读取其作为行的集合。如：

{% highlight python %}
>>> distFile = sc.textFile("data.txt")
{% endhighlight %}

一旦创建，`distFile`就可以通过数据集操作对其进行操作。例如，我们可以使用`map`和`reduce`操作将所有行的长度相加，如下所示：`distFile.map(lambda s: len(s)).reduce(lambda a, b: a + b)`。

关于使用Spark读取文件的一些注意事项：

* 如果使用本地文件系统，则需要每个worker节点都可以访问到该文件。将文件复制到所有worker服务器，或者使用网络安装的共享文件系统。
* Spark的所有基于文件的输入方法（包括`textFile`）都支持在目录，压缩文件和通配符上运行。例如，你可以使用`textFile("/my/directory")`，`textFile("/my/directory/*.txt")`和`textFile("/my/directory/*.gz")`。

* 该`textFile`方法还采用可选的第二个参数来控制文件的分区数。默认情况下，Spark为文件的每个块创建一个分区（HDFS中的块默认为128MB），但是你也可以通过传递更大的值来请求更大数量的分区。分区数不能比块数量少。

除了文本文件，Spark的Java API还支持其它几种数据格式：

* `JavaSparkContext.wholeTextFiles`使你可以读取包含多个小文本文件的目录，并将每个小文本文件作为 (filename, content)对返回。与相比`textFile`，该方法会在每个文件的每一行返回一条记录。
* `RDD.saveAsPickleFile`并`SparkContext.pickleFile`支持以包含pickled Python对象的简单格式保存RDD。批处理用于pickled 序列化，默认批处理大小为10。

* SequenceFile 和 Hadoop Input/Output 格式

**请注意，**此功能当前已标记`Experimental`，仅供高级用户使用。将来可能会替换为基于Spark SQL的读/写支持，在这种情况下，Spark SQL是首选方法。

**可写支持**

PySpark SequenceFile支持在Java内加载键-值对的RDD，将Writables转换为基本Java类型，并使用[Pyrolite pickled所得的Java对象。将键/值对的RDD保存到SequenceFile时，PySpark会执行相反的操作。它将Python对象分解为Java对象，然后将它们转换为Writables。以下可写对象将自动转换：

<table class="table">
<tr><th>可写类型</th><th>Python类型</th></tr>
<tr><td>Text</td><td>unicode str</td></tr>
<tr><td>IntWritable</td><td>int</td></tr>
<tr><td>FloatWritable</td><td>float</td></tr>
<tr><td>DoubleWritable</td><td>float</td></tr>
<tr><td>BooleanWritable</td><td>bool</td></tr>
<tr><td>BytesWritable</td><td>bytearray</td></tr>
<tr><td>NullWritable</td><td>None</td></tr>
<tr><td>MapWritable</td><td>dict</td></tr>
</table>

Arrays不是开箱即用的，用户在读取或写入时需要自定义`ArrayWritable`的子类。写入时，用户还需要指定将数组转换为自定义`ArrayWritable`子类型的自定义转换器。读取时，默认转换器会将自定义`ArrayWritable`子类型转换为Java `Object[]`，然后将其pickled为Python元组。要获取`array.array`用于基本类型数组的Python ，用户需要指定自定义转换器。

**保存和加载SequenceFile**

与文本文件类似，可以通过指定路径来保存和加载SequenceFiles。可以指定键和值类，但对于标准可写对象则不需要。

{% highlight python %}
>>> rdd = sc.parallelize(range(1, 4)).map(lambda x: (x, "a" * x))
>>> rdd.saveAsSequenceFile("path/to/file")
>>> sorted(sc.sequenceFile("path/to/file").collect())
[(1, u'a'), (2, u'aa'), (3, u'aaa')]
{% endhighlight %}

**保存和加载其它Hadoop输入/输出格式**

对于“新”和“旧” Hadoop MapReduce API，PySpark都可以读任何Hadoop InputFormat或写任何Hadoop OutputFormat。如果需要，可以将Hadoop配置信息作为Python字典传递。这是使用Elasticsearch ESInputFormat的示例：

{% highlight python %}
$ ./bin/pyspark --jars /path/to/elasticsearch-hadoop.jar
>>> conf = {"es.resource" : "index/type"}  # assume Elasticsearch is running on localhost defaults
>>> rdd = sc.newAPIHadoopRDD("org.elasticsearch.hadoop.mr.EsInputFormat",
                             "org.apache.hadoop.io.NullWritable",
                             "org.elasticsearch.hadoop.mr.LinkedMapWritable",
                             conf=conf)
>>> rdd.first()  # the result is a MapWritable that is converted to a Python dict
(u'Elasticsearch ID',
 {u'field1': True,
  u'field2': u'Some Text',
  u'field3': 12345})
{% endhighlight %}

请注意，如果InputFormat仅取决于Hadoop配置和/或输入路径，并且可以根据上表轻松地转换键和值类，则这种方法在这种情况下应该很好用。

如果你具有自定义的序列化二进制数据（例如从Cassandra / HBase加载数据），则首先需要将Scala / Java端上的数据转换为可由Pyrolite的picker处理的数据。一个[转换器](api/scala/index.html#org.apache.spark.api.python.Converter)特性提供了这一点。只需扩展此特征并在该`convert` 方法中实现你的转换代码即可。请记住，确保将此类以及访问所需的任何依赖项`InputFormat`打包到Spark作业jar中，并包含在PySpark类路径中。

有关 使用Cassandra / HBase 和自定义转换[器的示例](https://github.com/apache/spark/tree/master/examples/src/main/scala/org/apache/spark/examples/pythonconverters)，请参见[Python示例](https://github.com/apache/spark/tree/master/examples/src/main/python)和[Converter示例](https://github.com/apache/spark/tree/master/examples/src/main/scala/org/apache/spark/examples/pythonconverters)。`InputFormat``OutputFormat`

</div>
</div>

## RDD操作

RDD支持两种类型的操作：*transformations*（从现有操作中创建新数据集）和*actions*，在对数据集执行计算后，将值返回给驱动程序。例如，`map`是一个transformation，该transformation将每个数据集元素都传递给一个函数，并返回代表结果的新RDD。`reduce`是一个使用某些函数聚合RDD的所有元素并将最终结果返回到驱动程序的操作（有并行操作的reduceByKey`也可以返回分布式数据集）。

Spark中的所有转换都是*惰性的*，因为它们不会立即计算出结果。相反，他们只记得应用于某些基本数据集（例如文件）的转换。仅当actions要求将结果返回给驱动程序时才计算转换。这种设计使Spark可以更高效地运行。例如，我们可以了解到，`map` 所创建的数据集将被用在 `reduce` 中，并且只有 `reduce` 的计算结果返回给驱动程序，而不是映射一个更大的数据集。

默认情况下，每次你在 RDD 运行一个 action 时，每个 transformed RDD 都会被重新计算。但是，你也可用 `persist`（或 `cache`）方法将 RDD persist（持久化）到内存中；在这种情况下，Spark 为了下次查询时可以更快地访问，会把数据保存在集群上。此外，还支持持续持久化 RDDs 到磁盘，或复制到多个结点。

### 基础

<div class="codetabs">

<div data-lang="scala" markdown="1">

为了说明 RDD 基础，请思考下面这个的简单程序：

{% highlight scala %}
val lines = sc.textFile("data.txt")
val lineLengths = lines.map(s => s.length)
val totalLength = lineLengths.reduce((a, b) => a + b)
{% endhighlight %}

第一行从外部文件定义基本RDD。该数据集未加载到内存中或执行其它action：`lines`仅是文件的指针。第二行定义`lineLengths`为`map`转换的结果。再次，由于懒加载，`lineLengths` *不是*马上计算。最后，我们运行`reduce`，这是一个动作。此时，Spark将计算分解为任务，以在不同的机器上运行，并且每台机器都运行其map的一部分和reduce任务，最后仅将其答案返回给驱动程序。

如果我们也希望以后再次使用 `lineLengths`，我们还可以添加：

{% highlight scala %}
lineLengths.persist()
{% endhighlight %}

在 `reduce` 之前，这会使得 `lineLengths` 在第一次计算之后就被保存在内存中。

</div>

<div data-lang="java" markdown="1">

为了说明 RDD 基础，请思考下面这个的简单程序：

{% highlight java %}
JavaRDD<String> lines = sc.textFile("data.txt");
JavaRDD<Integer> lineLengths = lines.map(s -> s.length());
int totalLength = lineLengths.reduce((a, b) -> a + b);
{% endhighlight %}

第一行从外部文件定义基本RDD。该数据集未加载到内存中或执行其它action：`lines`仅是文件的指针。第二行定义`lineLengths`为`map`转换的结果。再次，由于懒加载，`lineLengths` *不是*马上计算。最后，我们运行`reduce`，这是一个动作。此时，Spark将计算分解为任务，以在不同的机器上运行，并且每台机器都运行其map的一部分和reduce任务，最后仅将其答案返回给驱动程序。

如果我们`lineLengths`以后还想使用，可以添加：

{% highlight java %}
lineLengths.persist(StorageLevel.MEMORY_ONLY());
{% endhighlight %}

在 `reduce`之前，这会使得`lineLengths`在第一次计算后将其保存在内存中。

</div>

<div data-lang="python" markdown="1">

为了说明RDD基础知识，请考虑以下简单程序：

{% highlight python %}
lines = sc.textFile("data.txt")
lineLengths = lines.map(lambda s: len(s))
totalLength = lineLengths.reduce(lambda a, b: a + b)
{% endhighlight %}

第一行从外部文件定义基本RDD。该数据集未加载到内存中或执行其它action：`lines`仅是文件的指针。第二行定义`lineLengths`为`map`转换的结果。再次，由于懒加载，`lineLengths` *不是*马上计算。最后，我们运行`reduce`，这是一个动作。此时，Spark将计算分解为任务，以在不同的机器上运行，并且每台机器都运行其map的一部分和reduce任务，最后仅将其答案返回给驱动程序。

如果我们`lineLengths`以后还想使用，可以添加：

{% highlight python %}
lineLengths.persist()
{% endhighlight %}

在 `reduce`之前，这会使得`lineLengths`在第一次计算后将其保存在内存中。

</div>

</div>

###  给Spark传递函数

<div class="codetabs">

<div data-lang="scala" markdown="1">

Spark的API在很大程度上依赖于在驱动程序中传递函数以在集群上运行。有两种推荐的方法可以做到这一点：

* [匿名函数语法](http://docs.scala-lang.org/tour/basics.html#functions)，可用于简短的代码段。
* 全局单例对象中的静态方法。例如，你可以如下定义`object MyFunctions`并传递`MyFunctions.func1`：

{% highlight scala %}
object MyFunctions {
  def func1(s: String): String = { ... }
}

myRdd.map(MyFunctions.func1)
{% endhighlight %}

请注意，虽然也可以在类实例中传递对方法的引用（与单例对象相对），但需要将包含该类的对象与方法一起发送。例如：

{% highlight scala %}
class MyClass {
  def func1(s: String): String = { ... }
  def doStuff(rdd: RDD[String]): RDD[String] = { rdd.map(func1) }
}
{% endhighlight %}

在这里，如果我们创建一个`MyClass`实例，并调用`doStuff`，`map`里面引用的 `func1`方法*是`MyClass`实例*，所以整个对象需要被发送到集群。类似于`rdd.map(x => this.func1(x))`。

以类似的方式，访问外部对象的字段将引用整个对象：

{% highlight scala %}
class MyClass {
  val field = "Hello"
  def doStuff(rdd: RDD[String]): RDD[String] = { rdd.map(x => field + x) }
}
{% endhighlight %}

等同于写作`rdd.map(x => this.field + x)`，这样就会引用`this`对象。为避免此问题，最简单的方法是将其复制`field`到局部变量中，而不是从外部访问它：

{% highlight scala %}
def doStuff(rdd: RDD[String]): RDD[String] = {
  val field_ = this.field
  rdd.map(x => field_ + x)
}
{% endhighlight %}

</div>

<div data-lang="java"  markdown="1">
Spark的API在很大程度上依赖于在驱动程序中传递函数以在群集上运行。在Java中，函数由实现[org.apache.spark.api.java.function](api/java/index.html?org/apache/spark/api/java/function/package-summary.html)包中的接口类表示 。有两种创建此类函数的方法：

* 在你自己的类中（作为匿名内部类或命名类）实现Function接口，并将其实例传递给Spark。
* 使用[lambda表达式](http://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html) 来简洁地定义一个实现。

尽管本指南中的大部分内容都使用lambda语法来简化，但使用较为啰嗦的长格式API实现相同功能还是很容易的。例如，我们可以将上面的代码编写如下：

{% highlight java %}
JavaRDD<String> lines = sc.textFile("data.txt");
JavaRDD<Integer> lineLengths = lines.map(new Function<String, Integer>() {
  public Integer call(String s) { return s.length(); }
});
int totalLength = lineLengths.reduce(new Function2<Integer, Integer, Integer>() {
  public Integer call(Integer a, Integer b) { return a + b; }
});
{% endhighlight %}

如果你觉得写内部类比较麻烦的话可以这样做：

{% highlight java %}
class GetLength implements Function<String, Integer> {
  public Integer call(String s) { return s.length(); }
}
class Sum implements Function2<Integer, Integer, Integer> {
  public Integer call(Integer a, Integer b) { return a + b; }
}

JavaRDD<String> lines = sc.textFile("data.txt");
JavaRDD<Integer> lineLengths = lines.map(new GetLength());
int totalLength = lineLengths.reduce(new Sum());
{% endhighlight %}

请注意，Java中的匿名内部类也可以访问封闭范围内的变量，只要它们被标记为`final`即可。与其它语言一样，Spark会将这些变量的副本发送到每个工作程序节点。

</div>

<div data-lang="python"  markdown="1">

Spark的API在很大程度上依赖于在驱动程序中传递函数以在群集上运行。建议使用三种方法来执行此操作：

* [Lambda表达式](https://docs.python.org/2/tutorial/controlflow.html#lambda-expressions)，用于可以作为表达式编写的简单函数。（Lambda不支持多语句函数和没有返回值的语句。）
* 对比较长的代码段，可以在Spark中调用`def`定义的函数。
* Local `def`s inside the function calling into Spark, for longer code.
* 模块中的顶级函数。

For example, to pass a longer function than can be supported using a `lambda`, consider
the code below:

如，要传递比lambda表达式所支持的更长的函数，可以使用下面这种方式：

{% highlight python %}
"""MyScript.py"""
if __name__ == "__main__":
    def myFunc(s):
        words = s.split(" ")
        return len(words)

    sc = SparkContext(...)
    sc.textFile("file.txt").map(myFunc)
{% endhighlight %}

请注意，虽然也可以在类实例中传递对方法的引用（与单例对象相对），但需要将包含该类的对象与方法一起发送。例如，考虑：

{% highlight python %}
class MyClass(object):
    def func(self, s):
        return s
    def doStuff(self, rdd):
        return rdd.map(self.func)
{% endhighlight %}

在这里，如果我们创建了一个`MyClass`并调用`doStuff`，`map`里面有引用的 `func`方法*是的`MyClass`实例*，所以整个对象需要被发送到群集。

以类似的方式，访问外部对象的字段将引用整个对象：

{% highlight python %}
class MyClass(object):
    def __init__(self):
        self.field = "Hello"
    def doStuff(self, rdd):
        return rdd.map(lambda s: self.field + s)
{% endhighlight %}

为避免此问题，最简单的方法是将其复制`field`到局部变量中，而不是从外部访问它：

{% highlight python %}
def doStuff(self, rdd):
    field = self.field
    return rdd.map(lambda s: field + s)
{% endhighlight %}

</div>

</div>

### 了解闭包

关于Spark的难点之一是在跨集群执行代码时了解变量和方法的执行范围和生命周期。修改超出其范围的变量的RDD操作可能经常引起混乱。在下面的示例中，我们将查看使用`foreach()`实现计数器的代码，但是其它操作也会发生类似的问题。

#### 例子

考虑一个简单的 RDD 元素求和，以下行为可能不同，具体取决于是否在同一个 JVM 中执行。一个常见的例子是当 Spark 运行在 `local` 本地模式（`--master = local[n]`）时，与部署 Spark 应用到群集（例如，通过 spark-submit 到 YARN）:

<div class="codetabs">

<div data-lang="scala"  markdown="1">
{% highlight scala %}
var counter = 0
var rdd = sc.parallelize(data)
// Wrong: Don't do this!!
rdd.foreach(x => counter += x)

println("Counter value: " + counter)
{% endhighlight %}
</div>

<div data-lang="java"  markdown="1">
{% highlight java %}
int counter = 0;
JavaRDD<Integer> rdd = sc.parallelize(data);

// Wrong: Don't do this!!
rdd.foreach(x -> counter += x);

println("Counter value: " + counter);
{% endhighlight %}
</div>

<div data-lang="python"  markdown="1">
{% highlight python %}
counter = 0
rdd = sc.parallelize(data)

# Wrong: Don't do this!!
def increment_counter(x):
    global counter
    counter += x
rdd.foreach(increment_counter)

print("Counter value: ", counter)
{% endhighlight %}
</div>

</div>

#### 本地模式与集群模式

上面的代码行为是不确定的，并且可能无法按预期正常工作。执行作业时，Spark 会分解 RDD 操作到每个 executor 中的 task 里。在执行之前，Spark 计算任务的 **closure**（闭包）。闭包是指 executor 要在RDD上进行计算时必须对执行节点可见的那些变量和方法（在这里是foreach()）。闭包被序列化并被发送到每个 executor。

发送给每个executor的闭包中的变量是driver中的副本，因此，在`foreach`中引用的**counter**不是executor节点上的**counter**。driver节点的内存中也存在一个**counter**，但是executor看不到该**counter**！executor仅从序列化闭包中看到一个副本。因此，**counter**的所有操作都引用了序列化闭包内的值，所以**counter**的最终值仍将为零。

本地模式在某些情况下，该`foreach`函数实际上是在与driver相同的JVM中执行，并且将引用相同的原始**counter**，所以可能会对其进行更新。

为确保在此类情况下行为明确，应使用[`Accumulator`](rdd-programming-guide.html#accumulators)（累加器）。Spark中的累加器专门用于提供一种机制，用于在集群中的各个工作节点之间拆分执行时安全地更新变量。本指南的“累加器”部分将详细讨论这些内容。

通常，闭包以及像循环或局部定义的方法之类的结构，不应用于某些全局状态。Spark不能定义或保证从闭包外部引用的对象的突变行为。某些执行此操作的代码可能会在本地模式下工作，但这只是偶然的情况，此类代码在分布式模式下将无法正常运行。如果需要一些全局聚合，请使用累加器。

#### 打印RDD中的元素

还有两个常见的打印RDD中元素的方法是`rdd.foreach(println)` 和 `rdd.map(println)`。在单台机器上，这将产生预期的输出并打印 RDD 的所有元素。但是在集群 `cluster` 模式下，driver中的`stdout`会被executor中的`stdout`给代替。要打印 `driver` 程序的所有元素，可以使用 `collect()` 方法首先把RDD中所有元素放到driver程序节点上：`rdd.collect().foreach(println)`。但是这种操作可能会导致driver的内存不足。因为`collect()`会将整个RDD提取到一台计算机上。如果只需要打印RDD的一些元素，则更安全的方法是使用`take()`：`rdd.take(100).foreach(println)`。

### 使用键值对

<div class="codetabs">

<div data-lang="scala" markdown="1">
大多数Spark操作可在包含任何类型的RDD对象上运行，但一些特殊操作仅可用于键-值对的RDD。最常见的是分布式“shuffle”操作，例如通过键对元素进行分组或聚合。

在Scala中，这些操作在包含[Tuple2](http://www.scala-lang.org/api/2.12.10/index.html#scala.Tuple2)对象（该语言的内置元组，只需编写`(a, b)`即可创建）的[RDD](http://www.scala-lang.org/api/2.12.10/index.html#scala.Tuple2)上自动可用 。[PairRDDFunctions](api/scala/index.html#org.apache.spark.rdd.PairRDDFunctions)类中提供键值对操作， 该类会自动包装RDD元组。

例如，以下代码对键值对使用`reduceByKey`运算来计算文件中每一行文本出现的次数：

{% highlight scala %}
val lines = sc.textFile("data.txt")
val pairs = lines.map(s => (s, 1))
val counts = pairs.reduceByKey((a, b) => a + b)
{% endhighlight %}

我们也可以使用`counts.sortByKey()`按字母顺序对键值对排序，最后使用 `counts.collect()`将它们作为数组对象带到driver中。

**注意：**在键-值对操作中使用自定义对象作为键时，必须确保自定义`equals()`方法与`hashCode()`方法一起使用。有关完整的详细信息，请参见[Object.hashCode（）文档中](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--)的概述。

</div>

<div data-lang="java" markdown="1">
大多数Spark操作可在包含任何类型的RDD对象上运行，但一些特殊操作仅可用于键-值对的RDD。最常见的是分布式“shuffle”操作，例如通过键对元素进行分组或聚合。

在Java中，键值对使用Scala标准库中的[scala.Tuple2](http://www.scala-lang.org/api/2.12.10/index.html#scala.Tuple2)类表示 。你可以简单的调用`new Tuple2(a, b)`来创建一个元组，然后使用`tuple._1()`和`tuple._2()`来访问它的字段。

键值对的[RDD](api/java/index.html?org/apache/spark/api/java/JavaPairRDD.html)由[JavaPairRDD](api/java/index.html?org/apache/spark/api/java/JavaPairRDD.html)类表示 。你可以使用特殊的`map`操作（例如 `mapToPair`和`flatMapToPair`）从JavaRDD来构造JavaPairRDD 。JavaPairRDD将同时具有标准的RDD功能和特殊的键值对功能。

例如，以下代码对键值对使用`reduceByKey`运算来计算文件中每一行文本出现的次数：

{% highlight scala %}
JavaRDD<String> lines = sc.textFile("data.txt");
JavaPairRDD<String, Integer> pairs = lines.mapToPair(s -> new Tuple2(s, 1));
JavaPairRDD<String, Integer> counts = pairs.reduceByKey((a, b) -> a + b);
{% endhighlight %}

我们也可以使用`couns.sortByKey()`按字母顺序对键值对排序，最后使用 `counts.collect()`将它们作为数组对象带到driver中。

**注意：**在键-值对操作中使用自定义对象作为键时，必须确保自定义`equals()`方法与hashCode()`方法一起使用。有关完整的详细信息，请参见[Object.hashCode（）文档中](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--)概述的。

</div>

<div data-lang="python" markdown="1">
大多数Spark操作可在包含任何类型的RDD对象上运行，但一些特殊操作仅可用于键-值对的RDD。最常见的是分布式“shuffle”操作，例如通过键对元素进行分组或聚合。

在Python中，这些操作适用于包含内置Python元组（如`(1, 2)`）的RDD 。只需创建这样的元组，然后调用所需的操作即可。

例如，以下代码`reduceByKey`对键值对使用运算来计算文件中每一行文本出现的次数：

{% highlight python %}
lines = sc.textFile("data.txt")
pairs = lines.map(lambda s: (s, 1))
counts = pairs.reduceByKey(lambda a, b: a + b)
{% endhighlight %}

我们也可以使用`couns.sortByKey()`按字母顺序对键值对排序，最后使用 `counts.collect()`将它们作为数组对象带到driver中。
</div>
</div>


### Transformations（转换）
下表列出了Spark支持的一些常见转换。有关详细信息，请参考RDD API文档（[Scala](api/scala/index.html#org.apache.spark.rdd.RDD)， [Java](api/java/index.html?org/apache/spark/api/java/JavaRDD.html)， [Python](api/python/pyspark.html#pyspark.RDD)， [R](api/R/index.html)）和RDD函数对doc（[Scala](api/scala/index.html#org.apache.spark.rdd.PairRDDFunctions)， [Java](api/java/index.html?org/apache/spark/api/java/JavaPairRDD.html)）。

<table class="table">
<tr><th style="width:25%">Transformation</th><th>含义</th></tr>
<tr>
  <td> <b>map</b>(<i>func</i>) </td>
  <td> 返回一个新的分布式数据集，该数据集是通过将源数据的每个元素传递给
 <i>func</i>函数形成的 </td>
</tr>
<tr>
  <td> <b>filter</b>(<i>func</i>) </td>
  <td> 返回一个新的分布式数据集，它由每个源数据中应用一个函数<i>func</i>且返回值为true的元素组成。</td>
</tr>
<tr>
  <td> <b>flatMap</b>(<i>func</i>) </td>
  <td> 与map相似，但是每个输入项都可以映射到0个或多个输出项（因此<i>func</i>应该返回Seq而不是单个项）。</td>
</tr>
<tr>
  <td> <b>mapPartitions</b>(<i>func</i>) <a name="MapPartLink"></a> </td>
  <td> 与map相似，但是分别在RDD的每个分区（块）上运行，因此<i>func</i>在类型T的RDD上运行时必须为Iterator&lt;T&gt; => Iterator&lt;U&gt; </td>
</tr>
<tr>
  <td> <b>mapPartitionsWithIndex</b>(<i>func</i>) </td>
  <td> 
    与mapPartitions类似，但它还为func提供表示分区索引的整数值，因此当在类型T的RDD上运行时，<i>func</i>必须为(Int, Iterator&lt;T&gt;) => Iterator&lt;U&gt;类型。
  </td>
</tr>
<tr>
  <td> <b>sample</b>(<i>withReplacement</i>, <i>fraction</i>, <i>seed</i>) </td>
  <td> 样本数据，设置是否放回（withReplacement），采样的百分比（_fraction_）、使用指定的随机数生成器的种子（seed）。</td>
</tr>
<tr>
  <td> <b>union</b>(<i>otherDataset</i>) </td>
  <td> 返回一个新的数据集，其中包含源数据集中的元素和参数的并集。 </td>
</tr>
<tr>
  <td> <b>intersection</b>(<i>otherDataset</i>) </td>
  <td> 返回一个新的RDD，其中包含源数据集中的元素与参数的交集。 </td>
</tr>
<tr>
  <td> <b>distinct</b>([<i>numPartitions</i>])) </td>
  <td> 返回一个新的数据集，其中包含源数据集去重后的元素。</td>
</tr>
<tr>
  <td> <b>groupByKey</b>([<i>numPartitions</i>]) <a name="GroupByLink"></a> </td>
  <td> 
    在(K, V)对型的dataset上调用，返回一个(K, Iterable&lt;V&gt;)型的dataset<br />
    <b>注意：</b> 如果你想在每个key上执行sum或average这样的操作，使用<code>reduceByKey</code>或者<code>aggregateByKey</code>性能会更好。
    <br />
    <b>注意：</b> 默认情况下, 输出的并行度取决于父RDD的分区数。你可以通过可选参数<code>numPartitions</code>设置不同的task数量。
  </td>
</tr>
<tr>
  <td> <b>reduceByKey</b>(<i>func</i>, [<i>numPartitions</i>]) <a name="ReduceByLink"></a> </td>
  <td> 在(K, V)对型的dataset上调用，返回一个(K, V)对型的dataset，该dataset的值是传入的reduce函数<i>func</i>在每一个K上聚合的结果。该函数的类型为(V,V) => V。跟<code>groupByKey</code>一样，task的数量是可以通过第二个可选参数设置的。</td>
</tr>
<tr>
  <td> <b>aggregateByKey</b>(<i>zeroValue</i>)(<i>seqOp</i>, <i>combOp</i>, [<i>numPartitions</i>]) <a name="AggregateByLink"></a> </td>
  <td> 在(K, V)对的dataset上调用，返回一个(K, U)对的dataset，该值是使用给定的combine函数和“零”值汇总每个键的结果。允许聚合值的类型与输入值的类型不一样，同时避免不必要的配置。像<code>groupByKey</code>一样，reduce tasks的数量是可以通过第二个可选的参数来配置的。</td>
</tr>
<tr>
  <td> <b>sortByKey</b>([<i>ascending</i>], [<i>numPartitions</i>]) <a name="SortByLink"></a> </td>
  <td>在一个(K, V)对的dataset上调用，其中的K实现了Ordered，返回一个按key升序或降序的 (K, V)对的dataset，由boolean型的<code>ascending</code>参数来指定。</td>
</tr>
<tr>
  <td> <b>join</b>(<i>otherDataset</i>, [<i>numPartitions</i>]) <a name="JoinLink"></a> </td>
  <td>在(K, V)型和(K, W)型的dataset上调用，返回一个(K, (V, W))型的dataset，该dataset中包含了所有key中的元素。可以通过<code>leftOuterJoin</code>, <code>rightOuterJoin</code>以及 <code>fullOuterJoin</code>实现外连接。</td>
</tr>
<tr>
  <td> <b>cogroup</b>(<i>otherDataset</i>, [<i>numPartitions</i>]) <a name="CogroupLink"></a> </td>
  <td> 在(K, V)型和(K, W)型的dataset上调用, 返回一个(K, (Iterable&lt;V&gt;, Iterable&lt;W&gt;))型的元组dataset。该操作调用了<code>groupWith</code>。</td>
</tr>
<tr>
  <td> <b>cartesian</b>(<i>otherDataset</i>) </td>
  <td>在T和U型的dataset上调用，返回(T, U)对型的dataset。（实际上就是求笛卡尔积）。</td>
</tr>
<tr>
  <td> <b>pipe</b>(<i>command</i>, <i>[envVars]</i>) </td>
  <td>通过shell命令（例如Perl或bash脚本）对RDD的每个分区进行管道传输。RDD元素被写入
进程的标准输入和输出到其标准输出的行作为字符串的RDD返回。</td>
</tr>
<tr>
  <td> <b>coalesce</b>(<i>numPartitions</i>) <a name="CoalesceLink"></a> </td>
  <td> 将RDD中的分区数减少到numPartitions。在筛选大型数据集后，。 </td>
</tr>
<tr>
  <td> <b>repartition</b>(<i>numPartitions</i>) <a name="RepartitionLink"></a></td>
  <td> 在RDD中随机shuffle数据以创建更多或更少的分区，并在整个分区之间保持平衡。这个操作会通过网络重新整理所有数据。 </td>
</tr>
<tr>
  <td> <b>repartitionAndSortWithinPartitions</b>(<i>partitioner</i>) <a name="Repartition2Link"></a></td>
  <td>根据给定的分区程序对RDD重新分区，并在每个结果分区中，按其键对记录进行排序。这比调用<code> repartition </code>然后在每个分区中进行排序更高效，因为它可以直接将排序结果push到shuffle machinery中。</td>
</tr>
</table>


### Actions（动作）

下表列出了Spark支持的一些常见action。请参考RDD API文档（[Scala](api/scala/index.html#org.apache.spark.rdd.RDD)， [Java](api/java/index.html?org/apache/spark/api/java/JavaRDD.html)， [Python](api/python/pyspark.html#pyspark.RDD)， [R](api/R/index.html)）

和RDD对函数文档（[Scala](api/scala/index.html#org.apache.spark.rdd.PairRDDFunctions)和 [Java](api/java/index.html?org/apache/spark/api/java/JavaPairRDD.html)）以获取详细信息。

<table class="table">
<tr><th>Action</th><th>含义</th></tr>
<tr>
  <td> <b>reduce</b>(<i>func</i>) </td>
  <td>使用函数<code>func</code>聚合dataset中的元素，该函数输入两个参数，但是返回一个值。这个函数应该是可交换（commutative）和关联（associative）的，这样才能保证它可以被并行地正确计算。</td>
</tr>
<tr>
  <td> <b>collect</b>() </td>
  <td> 在driver中将数据集的所有元素作为数组返回。这在返回足够小的数据子集的过滤器或其它操作之后很有用。</td>
</tr>
<tr>
  <td> <b>count</b>() </td>
  <td> 返回dataset中元素的数量 </td>
</tr>
<tr>
  <td> <b>first</b>() </td>
  <td> 返回dataset中的第一个元素（类似于take(1)） </td>
</tr>
<tr>
  <td> <b>take</b>(<i>n</i>) </td>
  <td> 将dataset中的前<i>n</i>个元素作为数组返回 </td>
</tr>
<tr>
  <td> <b>takeSample</b>(<i>withReplacement</i>, <i>num</i>, [<i>seed</i>]) </td>
  <td> 对一个dataset进行随机抽样，返回一个包含<i>num</i>个随机抽样元素的数组，参数 withReplacement指定是否有放回抽样，参数seed指定生成随机数的种子。 </td>
</tr>
<tr>
  <td> <b>takeOrdered</b>(<i>n</i>, <i>[ordering]</i>) </td>
  <td> 返回RDD按自然顺序或自定义比较器排序后的前<i>n</i>个元素。 </td>
</tr>
<tr>
  <td> <b>saveAsTextFile</b>(<i>path</i>) </td>
  <td> 将dataset中的元素以文本文件（或文本文件集合）的形式写入本地文件系统、HDFS或其它Hadoop支持的文件系统中。Spark将对每个元素调用toString方法，将数据元素转换为文本文件中的一行记录。 </td>
</tr>
<tr>
  <td> <b>saveAsSequenceFile</b>(<i>path</i>) <br /> (Java and Scala) </td>
  <td>将dataset中的元素以Hadoop SequenceFile的形式写入到本地文件系统、HDFS或其它 Hadoop支持的文件系统中。该操作可以在实现了Hadoop Writable接口的键值对RDD上使用。在Scala中，它还可以隐式转换为Writable的类型（Spark包括了基本类型的转换，如Int，Double，String 等)。</td>
</tr>
<tr>
  <td> <b>saveAsObjectFile</b>(<i>path</i>) <br /> (Java and Scala) </td>
  <td> 使用Java序列化以简单的格式写数据集的元素，然后使用<code>SparkContext.objectFile()</code>进行加载。 </td>
</tr>
<tr>
  <td> <b>countByKey</b>() <a name="CountByLink"></a> </td>
  <td> 仅适用于(K, V)类型的RDD。返回具有每个key计数的(K, Int)型的hashmap。</td>
</tr>
<tr>
  <td> <b>foreach</b>(<i>func</i>) </td>
  <td>对dataset中的每个元素运行<i>func</i>函数。通常这样做是出于它的副作用，例如更新<a href="#accumulators">累加器</a>或与外部存储系统进行交互。<br /> 
    <b>注意</b>：在<code> foreach() </code>之外修改除累加器以外的变量可能会导致不确定的行为。有关更多详细信息，请参见<a href="#understanding-closures-a-nameclosureslinka">了解闭包</a>。</td>
</tr>
</table>

Spark RDD API还公开了某些操作的异步版本，例如`foreach`对应的`foreachAsync`，它会立即返回一个`FutureAction`给调用方，而不是在action完成后返回。这可用于管理或等待动作的异步执行。

### Shuffle操作

Spark中的某些操作会触发一个称为Shuffle的事件。Shuffle是Spark的一种用于重新分配数据的机制，以便在分区之间对数据进行不同的分组。这通常涉及跨机器执行程序和复制数据，从而使Shuffle成为复杂且昂贵的操作。

#### 幕后

要理解shuffle期间发生的情况，可以思考一下[`reduceByKey`](#ReduceByLink)。该`reduceByKey`操作将生成一个新的RDD，其中将单个键的所有值组合成一个元组——键以及针对与该键关联的所有值执行reduce函数的结果。挑战在于，并非单个键的所有值都位于同一分区，甚至同一台机器上，但是必须将它们放在同一位置才能计算结果。

在 Spark 里，某些特定的操作需要数据不跨分区分布。在计算期间，一个任务在一个分区上执行，为了所有数据都在单 `reduceByKey`的reduce任务上运行，我们需要执行一个all-to-all操作。它必须从所有分区读取所有的 key 和 key对应的所有的值，并且跨分区聚集去计算每个key的结果——这个过程就叫做 **shuffle**

尽管每个分区中shuffle后的元素集都是确定的，分区本身的顺序也是确定的，但这些元素的顺序不是确定性的。如果希望在shuffle后能有规律地排序数据，那么可以使用：



* 使用`mapPartitions`对每个分区排序，如： `.sorted`。
* `repartitionAndSortWithinPartitions` 在分区的同时对分区进行高效的排序。
* `sortBy` 对 RDD 进行全局的排序。

可以触发shuffle的操作包包括像[`repartition`](#RepartitionLink) 和 [`coalesce`](#CoalesceLink)的**repartition**操作，像 [`groupByKey`](#GroupByLink) 和 [`reduceByKey`](#ReduceByLink)这样的**'ByKey**操作，以及像 [`cogroup`](#CogroupLink) 和 [`join`](#JoinLink)这样的**join**操作。

#### 性能影响
该 **Shuffle** 是一个代价比较高的操作，它涉及磁盘I/O、数据序列化、网络 I/O。为了准备shuffle操作的数据，Spark启动了一系列的任务，*map*任务组织数据，*reduce*完成数据的聚合。这两个map和spark术语来自 MapReduce，跟 Spark 的 `map` 操作和 `reduce` 操作没有关系。

在内部，一个map任务的所有结果数据会保存在内存，直到内存不能全部存储为止。然后，这些数据将基于目标分区进行排序并写入一个单独的文件中。在reduce时，任务将读取相关的已排序的数据块。

某些shuffle操作会大量消耗堆内存空间，因为shuffle操作在数据转换前后，需要在使用内存中的数据结构对数据进行组织。需要特别说明的是，`reduceByKey` 和 `aggregateByKey` 在map时会创建这些数据结构，`'ByKey` 操作在 reduce 时创建这些数据结构。当内存满的时候，Spark 会把溢出的数据存到磁盘上，这将导致额外的磁盘 I/O 开销和垃圾回收开销的增加。

shuffle 操作还会在磁盘上生成大量的中间文件。在 Spark 1.3 中，这些文件将会保留至对应的 RDD 不在使用并被垃圾回收为止。这么做的好处是，如果在 Spark 重新计算 RDD 的血统关系（lineage）时，shuffle 操作产生的这些中间文件不需要重新创建。如果 Spark 应用长期保持对 RDD 的引用，或者垃圾回收不频繁，这将导致垃圾回收的周期比较长。这意味着，长期运行 Spark 任务可能会消耗大量的磁盘空间。临时数据存储路径可以通过 SparkContext 中设置参数 `spark.local.dir` 进行配置。

可以通过调整各种配置参数来调整shuffle行为。请参阅《[Spark配置指南](configuration.html)》中的“shuffle行为”部分。

## RDD持久化

Spark中最重要的功能之一是跨操作将数据集*持久化*（或*缓存*）在内存中。当你保留RDD时，每个节点都会将其计算的所有分区存储在内存中，并在该数据集（或从该数据集派生的数据集）上的其它操作中重用它们。这样可以使以后的操作更快（通常快10倍以上）。缓存是用于迭代算法和快速交互使用的关键工具。

你可以使用`persist()`或`cache()`将RDD持久化。数据会在第一次action操作时进行计算，并缓存在节点的内存中。Spark的缓存具有容错机制，如果一个缓存的RDD的某个分区丢失了，Spark 将按照原来的计算过程，自动重新计算并进行缓存。

此外，每个持久化的RDD可以使用不同的*存储级别*进行存储，例如，允许你将数据集持久化在磁盘上，持久化在内存中，作为序列化的Java对象（以节省空间）在节点之间复制。通过将一个`StorageLevel`对象（[Scala](api/scala/index.html#org.apache.spark.storage.StorageLevel)， [Java](api/java/index.html?org/apache/spark/storage/StorageLevel.html)， [Python](api/python/pyspark.html#pyspark.StorageLevel)）传递给来设置这些级别 `persist()`。该`cache()`方法是使用默认存储级别`StorageLevel.MEMORY_ONLY`（将反序列化的对象存储在内存中）的简写。完整的存储级别集是：

<table class="table">
<tr><th style="width:23%">存储级别</th><th>含义</th></tr>
<tr>
  <td> MEMORY_ONLY </td>
  <td> 将RDD作为反序列化的Java对象存储在JVM中。如果内存不够，则某些分区将不会被缓存，并且每次需要时都会即时重新计算。这是默认级别。 </td>
</tr>
<tr>
  <td> MEMORY_AND_DISK </td>
  <td> 将RDD以反序列化的Java对象的形式存储在JVM中。如果内存不够，将未缓存的数据分区存储到磁盘，在需要使用这些分区时从磁盘读取。
 </td>
</tr>
<tr>
  <td> MEMORY_ONLY_SER <br /> (Java and Scala) </td>
  <td> 将RDD以序列化的Java对象的形式进行存储（每个分区为一个byte数组）。这种方式会比反序列化对象的方式节省很多空间，尤其是在使用<a href="tuning.html">fast serializer</a>时会节省更多的空间，但是在读取时会增加CPU的负担。
  </td>
</tr>
<tr>
  <td> MEMORY_AND_DISK_SER <br /> (Java and Scala) </td>
  <td> 类似于 MEMORY_ONLY_SER，但是溢出的分区会存储到磁盘，而不是在用到它们时重新计算。 </td>
</tr>
<tr>
  <td> DISK_ONLY </td>
  <td> 仅将RDD分区存储在磁盘上。 </td>
</tr>
<tr>
  <td> MEMORY_ONLY_2, MEMORY_AND_DISK_2, etc.  </td>
  <td> 与上面的级别功能相同，只不过每个分区在集群中两个节点上建立副本。 </td>
</tr>
<tr>
  <td> OFF_HEAP (experimental) </td>
  <td> 与MEMORY_ONLY_SER类似，但是将数据存储在<a href="configuration.html#memory-management">off-heap memory</a>。这需要启用off-heap memory。 
  </td>
</tr>
</table>

**注意：** *在Python中，存储的对象始终使用[Pickle](https://docs.python.org/2/library/pickle.html)库进行序列化，因此，是否选择序列化级别都无关紧要。Python中的可用存储级别包括`MEMORY_ONLY`，`MEMORY_ONLY_2`， `MEMORY_AND_DISK`，`MEMORY_AND_DISK_2`，`DISK_ONLY`，和`DISK_ONLY_2`。*

在shuffle操作中（例如 `reduceByKey`），即便是用户没有调用 `persist` 方法，Spark也会自动缓存部分中间数据。这么做的目的是在shuffle的过程中某个节点运行失败时，不需要重新计算所有的输入数据。如果用户想多次使用某个RDD，强烈推荐在该RDD上调用persist方法.

### 如何选择存储级别？

Spark的存储级别旨在在内存使用率和CPU效率之间提供不同的权衡。我们建议通过以下选择一个：

* 如果你的RDD是默认的存储级别（`MEMORY_ONLY`），请保持这种状态。这是CPU效率最高的方式，允许RDD上的操作尽可能快地运行。
  
* 如果不是，请尝试使用`MEMORY_ONLY_SER`并[选择一个快速的序列化库，](http://spark.apache.org/docs/latest/tuning.html)以使对象更加节省空间，但仍可以快速访问。（Java和Scala）
* 除了在计算该数据集的代价特别高，或者在需要过滤大量数据的情况下，尽量不要将溢出的数据存储到磁盘。因为，重新计算这个数据分区的耗时与从磁盘读取这些数据的耗时差不多。
* 如果想快速还原故障，建议使用多副本存储级别（例如，使用 **Spark** 作为 **web** 应用的后台服务，在服务出故障时需要快速恢复的场景下）。所有的存储级别都通过重新计算丢失的数据的方式，提供了完全容错机制。但是多副本级别在发生数据丢失时，不需要重新计算对应的数据库，可以让任务继续运行。


### 删除数据

Spark自动监视每个节点上的缓存使用情况，并以最近最少使用（LRU）的方式丢弃旧的数据分区。如果要手动删除RDD而不是等待它脱离缓存，请使用该`RDD.unpersist()`方法。

# 共享变量

通常情况下，一个传递给Spark操作（例如 `map` 或 `reduce`）的函数是在远程的集群节点上执行的。该函数在多个节点执行过程中使用的变量，是同一个变量的多个副本。这些变量的以副本的方式拷贝到每台机器上，并且各个远程机器上变量的更新并不会传播回driver。在各个任务之间支持通用的读写共享变量将效率很低。但是，Spark确实为两种常用用法模式提供了两种有限类型的*共享变量*：广播变量和累加器。

## 广播变量

广播变量使程序员可以在每台计算机上保留一个只读变量，而不用随任务一起发送它的副本。例如，可以使用它们以高效的方式为每个节点提供大型输入数据集的副本。Spark还尝试使用有效的广播算法分配广播变量，以降低通信成本。

Spark的action操作是通过一系列的stage（阶段）进行执行的，这些 stage是通过分布式的 “shuffle” 操作进行拆分的。Spark会自动广播每个stage中任务所需的通用数据。这种情况下广播的数据使用序列化的形式进行缓存，并在每个任务运行前进行反序列化。这也就意味着，只有在跨越多个stage的多个任务会使用相同的数据，或者在使用反序列化形式的数据特别重要的情况下，使用广播变量会有比较好的效果。

广播变量通过在一个变量`v`上调用`SparkContext.broadcast(v)`方法进行创建。广播变量是`v`的一个包装器，可以通过调用`value`方法来访问它的值。代码示例如下:

<div class="codetabs">

<div data-lang="scala"  markdown="1">
{% highlight scala %}
scala> val broadcastVar = sc.broadcast(Array(1, 2, 3))
broadcastVar: org.apache.spark.broadcast.Broadcast[Array[Int]] = Broadcast(0)

scala> broadcastVar.value
res0: Array[Int] = Array(1, 2, 3)
{% endhighlight %}

</div>

<div data-lang="java"  markdown="1">

{% highlight java %}
Broadcast<int[]> broadcastVar = sc.broadcast(new int[] {1, 2, 3});

broadcastVar.value();
// returns [1, 2, 3]
{% endhighlight %}

</div>

<div data-lang="python"  markdown="1">

{% highlight python %}
>>> broadcastVar = sc.broadcast([1, 2, 3])
<pyspark.broadcast.Broadcast object at 0x102789f10>

>>> broadcastVar.value
[1, 2, 3]
{% endhighlight %}

</div>

</div>

在创建广播变量之后，在集群上执行的所有的函数中，应该使用该广播变量代替原来的`v`值，所以节点上的`v`最多分发一次。另外，对象`v`在广播后不应该再被修改，以保证分发到所有的节点上的广播变量具有同样的值（例如，如果以后该变量会被传递到一个新的节点）。

如果要释放拷贝到executor中的广播变量，请调用 `.unpersist()`方法。如果此后需要再次使用广播，将会重新广播。要永久释放广播变量使用的所有资源，请调用`.destroy()`。在此之后广播变量将不能再使用。请注意，这些方法默认是不阻塞的，若要在释放资源之前使其阻塞，请在调用时加上参数`blocking=true`。

## 累加器

累加器是仅通过关联和交换操作“添加”的变量，因此可以有效地并行。它们可用于实现计数器（如MapReduce中的计数器）或求和。Spark本身仅支持数值类型的累加器，程序员可以自定义其它类型的累加器。

作为用户，你可以创建命名或未命名的累加器。如下图所示，一个已命名的累加器（这个例子中是`counter`）将在Web UI中显示修改该累加器的阶段。Spark在“Tasks”列表中显示由任务修改的每个累加器的值。

<p style="text-align: center;">
  <img src="img/spark-webui-accumulators.png" title="Accumulators in the Spark UI" alt="Accumulators in the Spark UI" />
</p>

UI中的跟踪累加器对于了解运行阶段的进度很有用（注意：Python尚不支持此功能）。

<div class="codetabs">

<div data-lang="scala"  markdown="1">

可以通过调用 `SparkContext.longAccumulator()` 或 `SparkContext.doubleAccumulator()` 方法创建数值类型的 `accumulator`以分别累加 Long 或 Double 类型的值。集群上正在运行的任务就可以使用 `add` 方法来累计数值。但是它们不能够读取它的值。只有 driver 才可以使用 `value` 方法读取累加器的值。

下面的代码展示了使用累加器对数组元素求和：

{% highlight scala %}
scala> val accum = sc.longAccumulator("My Accumulator")
accum: org.apache.spark.util.LongAccumulator = LongAccumulator(id: 0, name: Some(My Accumulator), value: 0)

scala> sc.parallelize(Array(1, 2, 3, 4)).foreach(x => accum.add(x))
...
10/09/29 18:41:08 INFO SparkContext: Tasks finished in 0.317106 s

scala> accum.value
res2: Long = 10
{% endhighlight %}

尽管此代码使用了对Long类型的累加器的内置支持，但程序员也可以通过实现[AccumulatorV2](http://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.util.AccumulatorV2)来创建自己的累加器类型。AccumulatorV2抽象类具有几个必须重写的方法：`reset`将累加器重置为零，`add`将另一个值添加到累加器，`merge`将另一个相同类型的累加器合并到该累加器中 。[API文档](http://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.util.AccumulatorV2)中包含其它必须重写的方法。例如，假设我们有一个`MyVector`代表数学向量的类，我们可以这样写：

{% highlight scala %}
class VectorAccumulatorV2 extends AccumulatorV2[MyVector, MyVector] {

  private val myVector: MyVector = MyVector.createZeroVector

  def reset(): Unit = {
    myVector.reset()
  }

  def add(v: MyVector): Unit = {
    myVector.add(v)
  }
  ...
}

// Then, create an Accumulator of this type:
val myVectorAcc = new VectorAccumulatorV2
// Then, register it into spark context:
sc.register(myVectorAcc, "MyVectorAcc1")
{% endhighlight %}

注意，当程序员定义自己的AccumulatorV2类型时，结果类型可能与所添加元素的类型不同。

</div>

<div data-lang="java"  markdown="1">
可以通过调用 `SparkContext.longAccumulator()` 或 `SparkContext.doubleAccumulator()` 方法创建数值类型的 `accumulator`以分别累加 Long 或 Double 类型的值。集群上正在运行的任务就可以使用 `add` 方法来累计数值。但是它们不能够读取它的值。只有 driver 才可以使用 `value` 方法读取累加器的值。

下面的代码展示了使用累加器对数组元素求和：

{% highlight java %}
LongAccumulator accum = jsc.sc().longAccumulator();

sc.parallelize(Arrays.asList(1, 2, 3, 4)).foreach(x -> accum.add(x));
// ...
// 10/09/29 18:41:08 INFO SparkContext: Tasks finished in 0.317106 s

accum.value();
// returns 10
{% endhighlight %}

尽管此代码使用了对Long类型的累加器的内置支持，但程序员也可以通过实现[AccumulatorV2](http://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.util.AccumulatorV2)来创建自己的累加器类型。AccumulatorV2抽象类具有几个必须重写的方法：`reset`将累加器重置为零，`add`将另一个值添加到累加器，`merge`将另一个相同类型的累加器合并到该累加器中 。[API文档](http://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.util.AccumulatorV2)中包含其它必须重写的方法。例如，假设我们有一个`MyVector`代表数学向量的类，我们可以这样写：

{% highlight java %}
class VectorAccumulatorV2 implements AccumulatorV2<MyVector, MyVector> {

  private MyVector myVector = MyVector.createZeroVector();

  public void reset() {
    myVector.reset();
  }

  public void add(MyVector v) {
    myVector.add(v);
  }
  ...
}

// Then, create an Accumulator of this type:
VectorAccumulatorV2 myVectorAcc = new VectorAccumulatorV2();
// Then, register it into spark context:
jsc.sc().register(myVectorAcc, "MyVectorAcc1");
{% endhighlight %}

请注意，当程序员定义自己的AccumulatorV2类型时，结果类型可能与所添加元素的类型不同。

*警告*：Spark任务完成时，Spark将尝试将此任务中累积的更新合并到累加器。如果失败，Spark将忽略该失败，并仍将任务标记为成功并继续运行其它任务。因此，失败的累加器不会影响Spark作业，但是尽管Spark作业成功，它可能无法正确更新。

</div>

<div data-lang="python"  markdown="1">
可以调用`SparkContext.accumulator(v)` 从一个初始值`v`创建一个累加器。集群上正在运行的任务就可以使用 `add` 方法或`+=` 操作符来累计数值。但是它们不能够读取它的值。只有 driver 才可以使用 `value` 方法读取累加器的值。

下面的代码展示了使用累加器对数组元素求和：

{% highlight python %}
>>> accum = sc.accumulator(0)
>>> accum
Accumulator<id=0, value=0>

>>> sc.parallelize([1, 2, 3, 4]).foreach(lambda x: accum.add(x))
...
10/09/29 18:41:08 INFO SparkContext: Tasks finished in 0.317106 s

>>> accum.value
10
{% endhighlight %}

尽管此代码使用了Spark内置的Int类型的累加器，但程序员也可以通过实现[AccumulatorParam](http://spark.apache.org/docs/latest/api/python/pyspark.html#pyspark.AccumulatorParam)来创建自定义类型的累加器。AccumulatorParam接口有两个方法：`zero`为你的数据类型提供“初始值”，以及`addInPlace`将两个值相加。例如，假设我们有一个`Vector`代表数学向量的类，我们可以这样写：

{% highlight python %}
class VectorAccumulatorParam(AccumulatorParam):
    def zero(self, initialValue):
        return Vector.zeros(initialValue.size)

    def addInPlace(self, v1, v2):
        v1 += v2
        return v1

# Then, create an Accumulator of this type:
vecAccum = sc.accumulator(Vector(...), VectorAccumulatorParam())
{% endhighlight %}

</div>

</div>

累加器的更新只发生在 **action** 操作中，Spark 保证每个任务只更新一次累加器，例如，重启任务不会更新值。在 transformations中，用户需要注意的是如果 task或 job stages重新执行，每个任务的更新操作可能会执行多次。

累加器不会更改Spark的懒加载特性。如果在RDD上的操作中对其进行更新，则仅当RDD执行action操作时才更新它们的值。因此，在一个像 `map()` 这样的transformation时，累加器的更新并没有执行。下面的代码片段证明了这个特性:

<div class="codetabs">

<div data-lang="scala" markdown="1">
{% highlight scala %}
val accum = sc.longAccumulator
data.map { x => accum.add(x); x }
// Here, accum is still 0 because no actions have caused the map operation to be computed.
{% endhighlight %}
</div>

<div data-lang="java"  markdown="1">
{% highlight java %}
LongAccumulator accum = jsc.sc().longAccumulator();
data.map(x -> { accum.add(x); return f(x); });
// Here, accum is still 0 because no actions have caused the `map` to be computed.
{% endhighlight %}
</div>

<div data-lang="python"  markdown="1">
{% highlight python %}
accum = sc.accumulator(0)
def g(x):
    accum.add(x)
    return f(x)
data.map(g)
# Here, accum is still 0 because no actions have caused the `map` to be computed.
{% endhighlight %}
</div>

</div>

# 部署到集群

在[提交应用指南](http://spark.apache.org/docs/latest/submitting-applications.html)介绍了如何提交申请到集群。简而言之，一旦将应用程序打包到JAR（对于Java / Scala）或一组`.py`或`.zip`文件（对于Python）中，该`bin/spark-submit`脚本便可以将其提交给任何受支持的集群管理器。

# 从Java / Scala启动Spark Job

[org.apache.spark.launcher](api/java/index.html?org/apache/spark/launcher/package-summary.html) 包提供的类用以使用一个简单的Java API作为子进程启动Spark Jobs。

# 单元测试

Spark非常适合使用任何流行的单元测试框架进行单元测试。在将 master URL 设置为 `local` 来测试时会简单的创建一个 `SparkContext`，运行你的操作，然后调用 `SparkContext.stop()` 将该作业停止。因为Spark不支持在同一程序中同时运行的两个context，所以你需要确保在`finally`块或测试框架的`tearDown`方法中停止context。

# 下一步做什么

你可以在Spark网站上看到一些[示例Spark程序](https://spark.apache.org/examples.html)。此外，Spark在`examples`目录（[Scala](https://github.com/apache/spark/tree/master/examples/src/main/scala/org/apache/spark/examples)， [Java](https://github.com/apache/spark/tree/master/examples/src/main/java/org/apache/spark/examples)， [Python](https://github.com/apache/spark/tree/master/examples/src/main/python)， [R](https://github.com/apache/spark/tree/master/examples/src/main/r)）中包含几个示例。你可以通过将类名称传递给Spark的`bin/run-example`脚本来运行Java和Scala示例。例如：

    ./bin/run-example SparkPi

对于Python示例，请使用`spark-submit`：

    ./bin/spark-submit examples/src/main/python/pi.py

对于R示例，请使用`spark-submit`：

    ./bin/spark-submit examples/src/main/r/dataframe.R

为了帮助你优化程序，[配置](configuration.html)和 [调优](tuning.html)指南提供了有关最佳实践的信息。它们对于确保你的数据以有效格式存储在内存中尤其重要。为了获得部署方面的帮助，[集群模式概述](cluster-overview.html)描述了分布式操作和支持的集群管理器中涉及的组件。

最后，[Scala](api/scala/#org.apache.spark.package)，[Java](api/java/)，[Python](api/python/)和[R中](api/R/)提供了完整的API文档 。