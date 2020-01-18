---
layout: global
displayTitle: Spark概述 
title: 概述
description: Apache Spark SPARK_VERSION_SHORT documentation homepage
---

Apache Spark是用于大规模数据处理的统一分析引擎。它提供Java，Scala，Python和R中的高级API，以及支持常规执行图的优化引擎。它还支持一组丰富的更高级别的工具，包括用于SQL和结构化数据的处理的 [Spark SQL](sql-programming-guide.html), 用于机器学习的[MLlib](ml-guide.html), 用于图像处理的[GraphX](graphx-programming-guide.html), 以及的增量计算和流处理的[Structured Streaming](structured-streaming-programming-guide.html)。

# 安全

默认情况下，Spark中的安全性处于关闭状态。这可能意味着您默认情况下容易受到攻击。下载并运行Spark之前，请参阅[Spark Security](security.html)。

# 下载

从项目网站的[下载页面](https://spark.apache.org/downloads.html)获取Spark。本文档适用于Spark版本3.0.0-SNAPSHOT。Spark将Hadoop的客户端库用于HDFS和YARN。下载已预先打包为少数流行的Hadoop版本。用户还可以下载“免费的Hadoop”二进制文件，并[通过扩展Spark的classpath](hadoop-provided.html)在任何Hadoop版本上运行Spark 。Scala和Java用户可以使用其Maven坐标将Spark包含在他们的项目中，而Python用户可以从PyPI安装Spark。

如果您想从源代码构建Spark，请访问[Building Spark](building-spark.html)。

Spark可在Windows和类UNIX的系统（例如Linux，Mac OS）上运行。在一台机器上本地运行很容易-你所需要的只是环境变量`PATH`中添加`java`或配置 `JAVA_HOME`指向Java安装目录。

Spark在Java 8，Python 2.7 + / 3.4 +和R 3.1+上运行。对于Scala API，Spark 2.4.4使用Scala 2.12。您将需要使用兼容的Scala版本（2.12.x）。

请注意，自Spark 2.2.0起已删除了对Java 7，Python 2.6和2.6.5之前的旧Hadoop版本的支持。从2.3.0版本开始，不再支持Scala 2.10。从Spark 2.4.1开始不支持Scala 2.11，它将在Spark 3.0中删除。

# 运行示例以及Shell

Spark在目录`examples/src/main` 中附带了几个Scala，Java，Python和R的示例程序。要运行Java或者Scala示例程序，请在Spark的顶级目录使用`bin/run-example <class> [params]` 。在后台，这将调用更通用的 [`spark-submit`脚本](submitting-applications.html)来启动应用程序）。例如，

    ./bin/run-example SparkPi 10

您还可以通过调整后的Scala shell版本以交互方式运行Spark。这是学习框架的好方法。

    ./bin/spark-shell --master local[2]

 `--master` 选项指定[分布式集群主节点的URL](submitting-applications.html#master-urls), 或使用 `local`参数在本地使用单线程运行, 或使用 `local[N]` 参数来指定在本地启动N个线程运行。 测试的话可以使用
`local` 。关于完成的Spark Shell选型请使用 `--help` 参数查看。

Spark还提供了Python API。要在Python解释器中交互式运行Spark，请使用 `bin/pyspark`：

    ./bin/pyspark --master local[2]

Python中还提供了示例应用程序。例如，

    ./bin/spark-submit examples/src/main/python/pi.py 10

从1.4开始，Spark还提供了[R API](sparkr.html)（仅包含DataFrames API）。要在R解释器中交互式运行Spark，请使用`bin/sparkR`：

    ./bin/sparkR --master local[2]

R中还提供了示例应用程序。例如，

    ./bin/spark-submit examples/src/main/r/dataframe.R

# 在集群上启动

Spark [集群模式概述](cluster-overview.html)介绍了在集群上运行的关键概念。Spark既可以单独运行，也可以在多个现有集群管理器上运行。当前，它提供了几种部署选项

* [独立部署模式](spark-standalone.html)：在私有集群上部署Spark的最简单方法[Apache Mesos](running-on-mesos.html)
* [Hadoop YARN](running-on-yarn.html)
* [Kubernetes](running-on-kubernetes.html)

# 下一步做什么

**编程指南：**

- [快速入门](quick-start.html)：Spark API快速入门；从这里开始！
- [RDD编程指南](rdd-programming-guide.html)：Spark基础概述-RDD（核心但旧的API），累加器和广播变量
- [Spark SQL，数据集和数据框架](sql-programming-guide.html)：通过关系查询（比RDD更新的API）处理结构化数据
- [结构化流](structured-streaming-programming-guide.html)：使用关系查询处理结构化数据流（使用数据集和数据帧，比DStreams更新的API）
- [Spark Streaming](streaming-programming-guide.html)：使用DStreams处理数据流（旧API）
- [MLlib](ml-guide.html)：应用机器学习算法
- [GraphX](graphx-programming-guide.html)：处理图形 

**API 文档：**

- [Spark Scala API（Scaladoc）](api/scala/index.html#org.apache.spark.package)
- [Spark Java API（Javadoc）](api/java/index.html)
- [Spark Python API（Sphinx）](api/python/index.html)
- [Spark R API（Roxygen2）](api/R/index.html)
- [Spark SQL，内置函数（MkDocs）](api/sql/index.html)

**部署指南：**

- [集群概述](cluster-overview.html)：在集群上运行时的概念和组件概述
- [提交应用程序](submitting-applications.html)：打包和部署应用程序
- 部署方式：
  - [Amazon EC2](https://github.com/amplab/spark-ec2)：可使您在大约5分钟内在EC2上启动集群的脚本
  - [独立部署模式](spark-standalone.html)：无需第三方集群管理器即可快速启动独立集群
  - [Mesos](running-on-mesos.html)：使用[Apache Mesos](https://mesos.apache.org/)部署私有集群
  - [YARN](running-on-yarn.html)：在Hadoop NextGen（YARN）之上部署Spark
  - [Kubernetes](running-on-kubernetes.html)：在[Kubernetes之上](running-on-kubernetes.html)部署Spark

**其他文件：**

- [配置](configuration.html)：通过其配置系统自定义Spark
- [监视](monitoring.html)：跟踪应用程序的行为
- [调优指南](tuning.html)：优化性能和内存使用的最佳做法
- [作业调度](job-scheduling.html)：在Spark应用程序之间和内部调度资源
- [安全性](security.html)：Spark安全性支持
- [硬件配置](hardware-provisioning.html)：有关群集硬件的建议
- 与其他存储系统集成：
  - [云基础架构](cloud-integration.html)
  - [OpenStack迅捷](storage-openstack-swift.html)
- [迁移指南](migration-guide.html)：Spark组件的迁移指南
- [构建Spark](building-spark.html)：使用Maven系统构建Spark
- [为Spark贡献](https://spark.apache.org/contributing.html)
- [第三方项目](https://spark.apache.org/third-party-projects.html)：相关的第三方Spark项目

**外部资源：**

- [Spark主页](https://spark.apache.org/)
- [Spark社区](https://spark.apache.org/community.html)资源，包括本地聚会
- [StackOverflow标签 `apache-spark`](http://stackoverflow.com/questions/tagged/apache-spark)
- [邮件列表](https://spark.apache.org/mailing-lists.html)：在此处询问有关Spark的问题
- [AMP营地](http://ampcamp.berkeley.edu/)：加州大学伯克利分校的一系列训练营，其中包含有关Spark，Spark Streaming，Mesos等的讲座和练习。[视频](http://ampcamp.berkeley.edu/6/)， [幻灯片](http://ampcamp.berkeley.edu/6/)和[练习](http://ampcamp.berkeley.edu/6/exercises/)可在线免费获得。
- [代码示例](https://spark.apache.org/examples.html)：`examples`Spark 的子文件夹（[Scala](https://github.com/apache/spark/tree/master/examples/src/main/scala/org/apache/spark/examples)， [Java](https://github.com/apache/spark/tree/master/examples/src/main/java/org/apache/spark/examples)， [Python](https://github.com/apache/spark/tree/master/examples/src/main/python)， [R](https://github.com/apache/spark/tree/master/examples/src/main/r)）中也提供更多[示例](https://spark.apache.org/examples.html)