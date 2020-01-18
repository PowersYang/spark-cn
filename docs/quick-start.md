---
layout: global
title: 快速开始
description: Spark快速入门教程
---

* This will become a table of contents (this text will be scraped).
{:toc}
本教程提供了使用Spark的快速介绍。我们将首先通过Spark的交互式Shell（在Python或Scala中）介绍API，然后展示如何用Java，Scala和Python编写应用程序。

要学习本指南，请首先从[Spark网站](https://spark.apache.org/downloads.html)下载Spark的package版本 。由于我们不会使用HDFS，因此你可以下载任何版本的Hadoop。

请注意，在Spark 2.0之前，Spark的主要编程接口是弹性分布式数据集（RDD）。在Spark 2.0之后，RDD被Dataset取代，Dataset的类型像RDD一样强，但具有更丰富的优化功能。仍支持RDD界面，你可以在[RDD编程指南中](rdd-programming-guide.html)获得更详细的参考。但是，我们强烈建议你切换到使用数据集，该数据集的性能比RDD更好。请参阅《[SQL编程指南》](sql-programming-guide.html)以获取有关数据集的更多信息。

# 安全

默认情况下，Spark中的安全性处于关闭状态。这可能意味着你默认情况下容易受到攻击。运行Spark之前，请参阅[Spark Security](security.html)。

# 使用Spark Shell进行交互式分析

## 基础

Spark shell提供了学习API的简单方法，以及强大的工具来交互式地分析数据。它可以在Scala（可在Java VM上运行，因此是使用现有Java库的好方法）或Python中提供。通过在Spark目录中运行以下命令来启动它：

<div class="codetabs">
<div data-lang="scala" markdown="1">

    ./bin/spark-shell

Spark的主要抽象是称为Dataset的分布式集合。可以从Hadoop InputFormats（例如HDFS文件）或通过转换其他数据集来创建DataSet。让我们从Spark源目录中的README文件的文本中创建一个新的数据集：

{% highlight scala %}
scala> val textFile = spark.read.textFile("README.md")
textFile: org.apache.spark.sql.Dataset[String] = [value: string]
{% endhighlight %}

你可以通过调用某些操作直接从数据集中获取值，或转换数据集以获取新值。有关更多详细信息，请阅读*[API文档](api/scala/index.html#org.apache.spark.sql.Dataset)*。

{% highlight scala %}
scala> textFile.count() // Number of items in this Dataset
res0: Long = 126 // May be different from yours as README.md will change over time, similar to other outputs

scala> textFile.first() // First item in this Dataset
res1: String = # Apache Spark
{% endhighlight %}

现在，让我们将此数据集转换为新的数据集。我们调用`filter`返回一个新的数据集，其中包含文件中项的子集。

{% highlight scala %}
scala> val linesWithSpark = textFile.filter(line => line.contains("Spark"))
linesWithSpark: org.apache.spark.sql.Dataset[String] = [value: string]
{% endhighlight %}

我们可以将转换和动作链接在一起：

{% highlight scala %}
scala> textFile.filter(line => line.contains("Spark")).count() // How many lines contain "Spark"?
res3: Long = 15
{% endhighlight %}

</div>
<div data-lang="python" markdown="1">

    ./bin/pyspark


或者在当前环境中使用pip安装PySpark的包：

    pyspark

Spark的主要抽象是称为数据集的项目的分布式集合。可以从Hadoop InputFormats（例如HDFS文件）或通过转换其他数据集来创建数据集。由于Python的动态性质，我们不需要在Python中对数据集进行强类型化。Python中的所有数据集都是Dataset [Row]，我们称其`DataFrame`与Pandas和R中的数据框概念一致。让我们从Spark源目录中的README文件的文本中创建一个新的DataFrame：

{% highlight python %}

>>> textFile = spark.read.text("README.md")
{% endhighlight %}

你可以通过调用一些操作直接从DataFrame中获取值，或转换DataFrame以获取新的值。有关更多详细信息，请阅读*[API文档](api/python/index.html#pyspark.sql.DataFrame)*。

{% highlight python %}

>>> textFile.count()  # Number of rows in this DataFrame
126

>>> textFile.first()  # First row in this DataFrame
Row(value=u'# Apache Spark')
{% endhighlight %}

现在，让我们将此DataFrame转换为一个新的。我们调用`filter`返回一个新的DataFrame，其中包含文件中各行的子集。

{% highlight python %}
>>> linesWithSpark = textFile.filter(textFile.value.contains("Spark"))
{% endhighlight %}

我们可以将转换和动作链接在一起：

{% highlight python %}
>>> textFile.filter(textFile.value.contains("Spark")).count()  # How many lines contain "Spark"?
15
{% endhighlight %}

</div>
</div>

## 有关数据集操作的更多信息

DataSet动作和转换可用于更复杂的计算。假设我们要查找包含最多单词的行：

<div class="codetabs">
<div data-lang="scala" markdown="1">
{% highlight scala %}
scala> textFile.map(line => line.split(" ").size).reduce((a, b) => if (a > b) a else b)
res4: Long = 15
{% endhighlight %}

首先，将一行内容映射到一个整数值以创建一个新的DataSet。`reduce`在该数据集上调用，以找到最大的字数。传给`map`和`reduce`的参数是Scala的闭包函数，同时也可以使用Scala和Java的库函数。例如，我们可以轻松地在其他地方调用声明的函数。我们将使用`Math.max()`函数使此代码更易于理解：

{% highlight scala %}
scala> import java.lang.Math
import java.lang.Math

scala> textFile.map(line => line.split(" ").size).reduce((a, b) => Math.max(a, b))
res5: Int = 15
{% endhighlight %}

一种常见的数据流模式是Hadoop流行的MapReduce。Spark可以轻松实现MapReduce流：

{% highlight scala %}
scala> val wordCounts = textFile.flatMap(line => line.split(" ")).groupByKey(identity).count()
wordCounts: org.apache.spark.sql.Dataset[(String, Long)] = [value: string, count(1): bigint]
{% endhighlight %}

在这里，我们调用`flatMap`将行的数据集转换为单词的数据集，然后组合`groupByKey`并使用`count`来计算文件中每个单词的计数，最后返回（String, Long）类型的数据对。要收集shell中的数据，可以调用`collect`：

{% highlight scala %}
scala> wordCounts.collect()
res6: Array[(String, Int)] = Array((means,1), (under,2), (this,3), (Because,1), (Python,2), (agree,1), (cluster.,1), ...)
{% endhighlight %}

</div>
<div data-lang="python" markdown="1">

{% highlight python %}
>>> from pyspark.sql.functions import *
>>> textFile.select(size(split(textFile.value, "\s+")).name("numWords")).agg(max(col("numWords"))).collect()
[Row(max(numWords)=15)]
{% endhighlight %}

首先，将一行内容映射到一个整数值，并将其取名为“ numWords”，从而创建一个新的DataFrame。在该DataFrame上调用`agg`以找到最大的字数。传给`select`和`agg`的参数都是*[Column对象](api/python/index.html#pyspark.sql.Column)*，我们可以使用`df.colName`从DataFrame中获得一列。我们还可以导入pyspark.sql.functions，它提供了许多从旧的列构建新列的函数。

一种常见的数据流模式是Hadoop流行的MapReduce。Spark可以轻松实现MapReduce流

{% highlight python %}

>>> wordCounts = textFile.select(explode(split(textFile.value, "\s+")).alias("word")).groupBy("word").count()
{% endhighlight %}

这里我们在 `select`中使用了 `explode` 函数将行的数据集转换为单词的数据集，然后结合 `groupBy` 和 `count` 来计算每一个单词在文件中出现的次数，最后输出一个包含两个Column（"word" and "count"）的DataFrame。 可以使用 `collect`函数收集计算结果：

{% highlight python %}
>>> wordCounts.collect()
[Row(word=u'online', count=1), Row(word=u'graphs', count=1), ...]
{% endhighlight %}

</div>
</div>

## 缓存

Spark还支持将数据集提取到集群范围的内存缓存中。当重复访问比较小的数据集或运行迭代算法（如PageRank）时，这非常有用。举一个简单的例子，让我们标记`linesWithSpark`要缓存的数据集：

<div class="codetabs">
<div data-lang="scala" markdown="1">
{% highlight scala %}
scala> linesWithSpark.cache()
res7: linesWithSpark.type = [value: string]

scala> linesWithSpark.count()
res8: Long = 15

scala> linesWithSpark.count()
res9: Long = 15
{% endhighlight %}

使用Spark计算和缓存100行文本文件似乎很愚蠢。有趣的是，即使在数十或数百个节点上，这些相同的函数也可以用于非常大的数据集。你也可以`bin/spark-shell`按照[RDD编程指南](rdd-programming-guide.html#using-the-shell)中的说明，通过连接到计算以交互的方式进行操作。

</div>

<div data-lang="python" markdown="1">

{% highlight python %}
>>> linesWithSpark.cache()

>>> linesWithSpark.count()
15

>>> linesWithSpark.count()
15
{% endhighlight %}

使用Spark计算和缓存100行文本文件似乎很愚蠢。有趣的是，即使在数十或数百个节点上，这些相同的函数也可以用于非常大的数据集。你也可以`bin/pyspark`按照[RDD编程指南](rdd-programming-guide.html#using-the-shell)中的说明，通过连接到计算以交互的方式进行操作。

</div>
</div>

# 独立的应用
假设我们希望使用Spark API编写一个独立的应用程序。我们将逐步介绍一个Scala（带有sbt），Java（带有Maven）和Python（pip）的简单应用程序。

<div class="codetabs">
<div data-lang="scala" markdown="1">
我们将在Scala中创建一个非常简单的Spark应用程序，名为`SimpleApp.scala`：

{% highlight scala %}
/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "YOUR_SPARK_HOME/README.md" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }
}
{% endhighlight %}

注意，这个应用程序我们应该定义一个 `main()` 方法而不是去继承scala.App`。使用 `scala.App` 的子类可能不会正常运行。

该程序只计算Spark README文件中包含“ a”的行数和包含“ b”的行数。请注意，你需要将YOUR_SPARK_HOME替换为你自己电脑中Spark的安装路径。与前面带有Spark shell的示例（其初始化其自己的SparkSession）不同，我们将SparkSession初始化为程序的一部分。

我们调用`SparkSession.builder`构造一个[[SparkSession]]，然后设置应用程序名称，最后调用`getOrCreate`以获得[[SparkSession]]实例。

我们的应用依赖了 Spark API，所以我们将包含一个名为 `build.sbt` 的 sbt 配置文件，它描述了 Spark 的依赖。该文件也会添加一个 Spark 依赖的 repository:

{% highlight scala %}
name := "Simple Project"

version := "1.0"

scalaVersion := "{{site.SCALA_VERSION}}"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "{{site.SPARK_VERSION}}"
{% endhighlight %}

为了让 sbt 正常运行，我们需要根据经典的目录结构来布局 `SimpleApp.scala` 和 `build.sbt` 文件。在成功后，我们可以创建一个包含应用程序代码的 JAR 包，然后使用 `spark-submit` 脚本来运行我们的程序。

{% highlight bash %}

# 你的目录结构应该是这样子的
$ find .
.
./build.sbt
./src
./src/main
./src/main/scala
./src/main/scala/SimpleApp.scala

# 将你的程序打包
$ sbt package
...
[info] Packaging {..}/{..}/target/scala-{{site.SCALA_BINARY_VERSION}}/simple-project_{{site.SCALA_BINARY_VERSION}}-1.0.jar

# 使用spark-submit运行你的程序
$ YOUR_SPARK_HOME/bin/spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/scala-{{site.SCALA_BINARY_VERSION}}/simple-project_{{site.SCALA_BINARY_VERSION}}-1.0.jar
...
Lines with a: 46, Lines with b: 23
{% endhighlight %}

</div>

<div data-lang="java" markdown="1">
本示例将使用Maven编译应用程序的JAR包，但是类似的构建工具都可以使用。

我们将创建一个非常简单的Spark应用程序`SimpleApp.java`：

{% highlight java %}
/* SimpleApp.java */
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class SimpleApp {
  public static void main(String[] args) {
    String logFile = "YOUR_SPARK_HOME/README.md"; // Should be some file on your system
    SparkSession spark = SparkSession.builder().appName("Simple Application").getOrCreate();
    Dataset<String> logData = spark.read().textFile(logFile).cache();

    long numAs = logData.filter(s -> s.contains("a")).count();
    long numBs = logData.filter(s -> s.contains("b")).count();
    
    System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);
    
    spark.stop();
  }
}
{% endhighlight %}

该程序只计算SparkREADME文件中包含“ a”的行数和包含“ b”的行数。请注意，你需要将YOUR_SPARK_HOME替换为自己电脑中Spark的安装路径。与前面带有Spark shell的示例（其初始化其自己的SparkSession）不同，我们将SparkSession初始化为程序的一部分。

为了构建程序，我们还编写了一个Maven `pom.xml`文件，其中将Spark作为依赖项。请注意，Spark artifacts中带有Scala版本信息。

{% highlight xml %}
<project>
  <groupId>edu.berkeley</groupId>
  <artifactId>simple-project</artifactId>
  <modelVersion>4.0.0</modelVersion>
  <name>Simple Project</name>
  <packaging>jar</packaging>
  <version>1.0</version>
  <dependencies>
    <dependency> <!-- Spark dependency -->
      <groupId>org.apache.spark</groupId>
      <artifactId>spark-sql_{{site.SCALA_BINARY_VERSION}}</artifactId>
      <version>{{site.SPARK_VERSION}}</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>
</project>
{% endhighlight %}

我们根据规范的Maven目录结构对这些文件进行布局：
{% highlight bash %}
$ find .
./pom.xml
./src
./src/main
./src/main/java
./src/main/java/SimpleApp.java
{% endhighlight %}

现在，我们可以使用Maven打包应用程序并使用`./bin/spark-submit`来执行它。

{% highlight bash %}

# 将你的应用程序打成jar包
$ mvn package
...
[INFO] Building jar: {..}/{..}/target/simple-project-1.0.jar

# 使用spark-submit运行你的程序
$ YOUR_SPARK_HOME/bin/spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/simple-project-1.0.jar
...
Lines with a: 46, Lines with b: 23
{% endhighlight %}

</div>
<div data-lang="python" markdown="1">
现在，我们将展示如何使用Python API（PySpark）编写应用程序。

如果要构建打包的PySpark应用程序或库，则可以按以下方式将其添加到setup.py文件中：

{% highlight python %}
    install_requires=[
        'pyspark=={site.SPARK_VERSION}'
    ]
{% endhighlight %}


作为示例，我们将创建一个简单的Spark应用程序`SimpleApp.py`：

{% highlight python %}
"""SimpleApp.py"""
from pyspark.sql import SparkSession

logFile = "YOUR_SPARK_HOME/README.md"  # Should be some file on your system
spark = SparkSession.builder.appName("SimpleApp").getOrCreate()
logData = spark.read.text(logFile).cache()

numAs = logData.filter(logData.value.contains('a')).count()
numBs = logData.filter(logData.value.contains('b')).count()

print("Lines with a: %i, lines with b: %i" % (numAs, numBs))

spark.stop()
{% endhighlight %}

该程序只计算文本文件中包含“ a”的行数和包含“ b”的行数。请注意，你需要将YOUR_SPARK_HOME替换为自己电脑Spark的安装路径。与Scala和Java示例一样，我们使用SparkSession创建DataSet。对于使用自定义类或第三方库的应用程序，我们还可以使用`spark-submit`将其打包到.zip文件中，同时使用参数`--py-files`指定代码。有关详细信息，请参见`spark-submit --help`。 `SimpleApp`非常简单，我们不需要指定任何代码依赖项。

我们可以使用以下`bin/spark-submit`脚本运行此应用程序：

{% highlight bash %}
# 使用spark-submit运行你的程序
$ YOUR_SPARK_HOME/bin/spark-submit \
  --master local[4] \
  SimpleApp.py
...
Lines with a: 46, Lines with b: 23
{% endhighlight %}

If you have PySpark pip installed into your environment (e.g., `pip install pyspark`), you can run your application with the regular Python interpreter or use the provided 'spark-submit' as you prefer.

{% highlight bash %}
# 使用Python解释器运行你的程序
$ python SimpleApp.py
...
Lines with a: 46, Lines with b: 23
{% endhighlight %}

</div>
</div>

# 下一步做什么
祝贺你运行了第一个Spark应用程序！

* 有关API的深入概述，请从[RDD编程指南](rdd-programming-guide.html)和[SQL编程指南](sql-programming-guide.html)开始，或参阅“编程指南”菜单以获取其他组件。
* 要在集群上运行应用程序，请转至[部署概述](cluster-overview.html)。
* 最后，Spark在`examples`目录（[Scala](https://github.com/apache/spark/tree/master/examples/src/main/scala/org/apache/spark/examples)， [Java](https://github.com/apache/spark/tree/master/examples/src/main/java/org/apache/spark/examples)， [Python](https://github.com/apache/spark/tree/master/examples/src/main/python)， [R](https://github.com/apache/spark/tree/master/examples/src/main/r)）中包含几个示例。你可以按下面的方式运行它们：

{% highlight bash %}
# 对于Scala和Java的示例，使用run-example：
./bin/run-example SparkPi

# 对于Python的示例，直接使用 spark-submit：
./bin/spark-submit examples/src/main/python/pi.py

# 对于R语言的示例，直接使用 spark-submit：

./bin/spark-submit examples/src/main/r/dataframe.R
{% endhighlight %}