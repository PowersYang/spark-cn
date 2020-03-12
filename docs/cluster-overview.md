---
layout: global
title: 集群模式概述
---

本文档简要概述了Spark如何在集群上运行，以使你更容易理解所涉及的组件。通读[应用程序提交指南，](submitting-applications.html) 以了解有关在集群上启动应用程序的信息。

# 组件

Spark应用程序在集群上作为独立的进程集运行，由main程序中的`SparkContext`对象（称为*driver program*）协调。

具体来说，要在集群上运行，SparkContext可以连接到几种类型的*集群管理器* （Spark自己的standalone管理器，Mesos和YARN），它们可以在应用程序之间分配资源。连接后，Spark会在集群中的节点上访问*executors*，executors是为你的application运行计算并提供数据存储的进程。接下来，Spark将你的application代码（由传递给SparkContext的JAR或Python文件定义）发送给executors。最后，SparkContext将*tasks*发送给executors以运行。

<p style="text-align: center;">
  <img src="img/cluster-overview.png" title="Spark cluster components" alt="Spark cluster components" />
</p>

关于此体系结构，有几点有用的注意事项：

1. 每个application都有其自己的executor进程，该进程在整个应用程序期间保持不变，并在多个线程中运行任务。这样的好处是可以在调度方面（每个driver调度自己的tasks）和执行者方面（来自不同application的tasks在不同JVM中运行）彼此隔离application。但是，这也意味着，如果不将数据写入外部存储系统，则无法在不同的Spark applications（SparkContext实例）之间共享数据。
2. Spark与集群管理器是没有关系的。只要它可以获取executor进程，并且进程间可以彼此通信，那么即使在Spark还支持的其它集群管理器（（例如Mesos / YARN））上运行它也是相对容易的。
3. Driver程序在其整个生命周期中必须侦听并接受其executor程序的传入连接（例如，请参见[网络配置部分中的spark.driver.port](configuration.html#networking)）。也就是说，driver程序必须可以从worker节点访问网络。
4. 由于driver程序在集群上调度task，所以最好在同一局域网中的就近worker节点运行。如果你想将请求远程发送到集群，最好是打开RPC到driver程序的通道，并让它就近提交操作，而不是在远离worker节点运行driver程序。

# 集群管理器类型

该系统当前支持几个集群管理器

* [Standalone](spark-standalone.html) -- Spark附带的简单集群管理器，可轻松设置集群
* [Apache Mesos](running-on-mesos.html) -- 通用集群管理器，也可以运行Hadoop MapReduce和服务应用程序。
* [Hadoop YARN](running-on-yarn.html) -- Hadoop 2中的资源管理器。
* [Kubernetes](running-on-kubernetes.html) -- 一个开源系统，用于自动化容器化应用程序的部署，扩展和管理。

关于Spark不支持的第三方集群管理器可以添加到[Nomad](https://github.com/hashicorp/nomad-spark) 。

# 提交应用程序

可以使用`spark-submit`脚本将应用程序提交到任何类型的集群。在[提交申请指南](submitting-applications.html)介绍了如何做到这一点。

# 监控方式

每个driver程序都有一个Web UI，通常在4040端口上，该Web UI显示有关正在运行的task，executor程序和存储使用情况的信息。只需在Web浏览器中转到`http://<driver-node>:4040`即可访问此UI。该[监控指南](monitoring.html)还介绍了其它的监控选项。

# 作业调度

Spark可以控制*跨*应用程序（在集群管理器级别）以及*在application*内*（如果在同一SparkContext上进行了多次计算）资源分配。该[作业调度概述](job-scheduling.html)描述得更详细。

# 术语表

下表总结了集群概念相关的的术语：

<table class="table">
  <thead>
    <tr><th style="width: 130px;">术语</th><th>含义</th></tr>
  </thead>
  <tbody>
    <tr>
      <td>Application</td>
      <td>基于Spark的用户程序。由集群上的<em>driver program</em>和<em>executor</em>组成。
</td>
    </tr>
    <tr>
      <td>Application jar</td>
      <td>
一个包含用户的Spark应用程序的jar。在某些情况下，用户希望创建一个包含其应用程序及其依赖项的“uber jar”。用户的jar绝不应该包含Hadoop或Spark库，因为这些库将在运行时添加。      </td>
    </tr>
    <tr>
      <td>Driver program</td>
      <td>运行驱动程序总mian()方法和创建SparkContext的进程</td>
    </tr>
    <tr>
      <td>Cluster manager</td>
      <td>用于在集群上获取资源的外部服务（例如，standalone管理器，Mesos，YARN）</td>
    </tr>
    <tr>
      <td>Deploy mode</td>
      <td>表示驱动driver进程的运行位置。在“集群”模式下，框架在集群内部启动驱动程序。在“客户端”模式下，提交者在集群外部启动驱动程序。</td>
    </tr>
    <tr>
      <td>Worker node</td>
      <td>可以在集群中运行application代码的任何节点</td>
    </tr>
    <tr>
      <td>Executor</td>
      <td>为工作节点上的application启动的进程，该进程运行task并将数据跨task存储在内存或磁盘存储中。每个application都有自己的executor。</td>
    </tr>
    <tr>
      <td>Task</td>
      <td>一种工作单元，将发送给一个executor</td>
    </tr>
    <tr>
      <td>Job</td>
      <td>一个由多个task组成的并行计算，并且能从Spark action中获取响应（例如 <code>save</code>，<code>collect</code>）; 你将在driver的日志中看到这个术语。</td>
    </tr>
    <tr>
      <td>Stage</td>
      <td>每个job被划分为更小的<em>stage</em>单元，该stage由多个task组成的，并且stage彼此之间存在依赖关系。（与 MapReduce 中的 map 和 reduce stage 相似）。你将在 driver 的日志中看到这个术语。</td>
    </tr>
  </tbody>
</table>