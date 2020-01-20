---
layout: global
title: 入门
displayTitle: 入门
---

* Table of contents
{:toc}

## 起始点：SparkSession

<div class="codetabs">
<div data-lang="scala"  markdown="1">
[`SparkSession`](http://spark-cn.cn/api/scala/index.html#org.apache.spark.sql.SparkSession)类是Spark中所有功能的入口点。要创建一个基本的`SparkSession`，只需使用`SparkSession.builder()`：
{% include_example init_session scala/org/apache/spark/examples/sql/SparkSQLExample.scala %}
</div>

<div data-lang="java" markdown="1">
[`SparkSession`](http://spark-cn.cn/api/java/index.html#org.apache.spark.sql.SparkSession)类是Spark中所有功能的入口点。要创建一个基本的`SparkSession`，只需使用`SparkSession.builder()`：
{% include_example init_session java/org/apache/spark/examples/sql/JavaSparkSQLExample.java %}
</div>

<div data-lang="python"  markdown="1">
[`SparkSession`](http://spark-cn.cn/api/python/pyspark.sql.html#pyspark.sql.SparkSession)类是Spark中所有功能的入口点。要创建一个基本的`SparkSession`，只需使用`SparkSession.builder`：
{% include_example init_session python/sql/basic.py %}
</div>

<div data-lang="r"  markdown="1">
[`SparkSession`](http://spark-cn.cn/api/python/pyspark.sql.html#pyspark.sql.SparkSession)类是Spark中所有功能的入口点。要创建一个基本的`SparkSession`，只需使用`SparkSession.builder`：

{% include_example init_session r/RSparkSQLExample.R %}

请注意，首次调用时，`sparkR.session()`会初始化全局`SparkSession`单实例，并始终为连续调用返回对此实例的引用。这样，用户只需初始化`SparkSession`一次，然后SparkR之类的函数`read.df`就可以隐式访问此全局实例，并且用户无需传递该`SparkSession`实例。

</div>
</div>

Spark 2.0中的`SparkSession`提供了对Hive的内置支持，包括使用HiveQL编写查询，访问Hive UDF以及从Hive表读取数据。要使用这些功能，你不需要安装Hive。

## 创建DataFrame

<div class="codetabs">
<div data-lang="scala"  markdown="1">
要使用 `SparkSession`，应用程序可以从[现有的`RDD`](sql-getting-started.html#interoperating-with-rdds)，Hive表或[Spark数据源](sql-data-sources.html)创建DataFrame 。


例如，以下内容基于JSON文件的内容创建一个DataFrame：

{% include_example create_df scala/org/apache/spark/examples/sql/SparkSQLExample.scala %}
</div>

<div data-lang="java" markdown="1">
要使用 `SparkSession`，应用程序可以从[现有的`RDD`](sql-getting-started.html#interoperating-with-rdds)，Hive表或[Spark数据源](sql-data-sources.html)创建DataFrame 。


例如，以下内容基于JSON文件的内容创建一个DataFrame：

{% include_example create_df java/org/apache/spark/examples/sql/JavaSparkSQLExample.java %}
</div>

<div data-lang="python"  markdown="1">
要使用 `SparkSession`，应用程序可以从[现有的`RDD`](sql-getting-started.html#interoperating-with-rdds)，Hive表或[Spark数据源](sql-data-sources.html)创建DataFrame 。


例如，以下内容基于JSON文件的内容创建一个DataFrame：

{% include_example create_df python/sql/basic.py %}
</div>

<div data-lang="r"  markdown="1">
要使用 `SparkSession`，应用程序可以从[现有的`RDD`](sql-getting-started.html#interoperating-with-rdds)，Hive表或[Spark数据源](sql-data-sources.html)创建DataFrame 。


例如，以下内容基于JSON文件的内容创建一个DataFrame：

{% include_example create_df r/RSparkSQLExample.R %}

</div>
</div>

## 无类型的DataSet操作（又名DataFrame操作）

DataFrames为[Scala](api/scala/index.html#org.apache.spark.sql.Dataset)，[Java](api/java/index.html?org/apache/spark/sql/Dataset.html)，[Python](api/python/pyspark.sql.html#pyspark.sql.DataFrame)和[R中的](api/R/SparkDataFrame.html)结构化数据操作提供了一种domain-specific的语言。

正如前面所说的，Spark 2.0 中DataFrames 在 Scala 和 Java API 中，仅仅是多个 `Row 对象的 Dataset。这些操作也参考了与强类型的 Scala/Java Datasets 中的 “类型转换” 对应的 “无类型转换”。

这里我们包括一些使用数据集进行结构化数据处理的基本示例：

<div class="codetabs">
<div data-lang="scala"  markdown="1">
{% include_example untyped_ops scala/org/apache/spark/examples/sql/SparkSQLExample.scala %}

有关可对数据集执行的操作类型的完整列表，请参阅[API文档](api/scala/index.html#org.apache.spark.sql.Dataset)。

除了简单的列引用和表达式外，数据集还具有丰富的函数库，包括字符串处理，日期计算，通用数学运算等。完整列表可在[DataFrame Function Reference中找到](api/scala/index.html#org.apache.spark.sql.functions$)。

</div>

<div data-lang="java" markdown="1">

{% include_example untyped_ops java/org/apache/spark/examples/sql/JavaSparkSQLExample.java %}

有关可对数据集执行的操作类型的完整列表，请参阅[API文档](api/java/org/apache/spark/sql/Dataset.html)。

除了简单的列引用和表达式外，数据集还具有丰富的函数库，包括字符串处理，日期计算，通用数学运算等。完整列表可在[DataFrame Function Reference中找到](api/java/org/apache/spark/sql/functions.html)。

</div>

<div data-lang="python"  markdown="1">
在Python中，可以通过属性（`df.age`）或通过索引（`df['age']`）访问DataFrame的列。尽管前者便于交互式数据操作，但强烈建议用户使用后者形式，这样不会破坏DataFrame的列名。

{% include_example untyped_ops python/sql/basic.py %}
有关可在DataFrame上执行的操作类型的完整列表，请参阅[API文档](api/python/pyspark.sql.html#pyspark.sql.DataFrame)。

除了简单的列引用和表达式外，DataFrames还具有丰富的函数库，包括字符串处理，日期计算，常用数学运算等。完整列表可在[DataFrame Function Reference中找到](api/python/pyspark.sql.html#module-pyspark.sql.functions)。

</div>

<div data-lang="r"  markdown="1">

{% include_example untyped_ops r/RSparkSQLExample.R %}

有关可在DataFrame上执行的操作类型的完整列表，请参阅[API文档](api/python/pyspark.sql.html#pyspark.sql.DataFrame)。

除了简单的列引用和表达式外，DataFrames还具有丰富的函数库，包括字符串处理，日期计算，常用数学运算等。完整列表可在[DataFrame Function Reference中找到](api/python/pyspark.sql.html#module-pyspark.sql.functions)。

</div>

</div>

## **以编程方式运行SQL查询**

<div class="codetabs">
<div data-lang="scala"  markdown="1">
`SparkSession`中的`sql`函数可以让应用程序以编程的方式运行SQL查询，并将结果作为一个`DataFrame`返回。

{% include_example run_sql scala/org/apache/spark/examples/sql/SparkSQLExample.scala %}
</div>

<div data-lang="java" markdown="1">
`SparkSession`中的`sql`函数可以让应用程序以编程的方式运行SQL查询，并将结果作为一个`Dataset<Row>`返回。


{% include_example run_sql java/org/apache/spark/examples/sql/JavaSparkSQLExample.java %}
</div>

<div data-lang="python"  markdown="1">
`SparkSession`中的`sql`函数可以让应用程序以编程的方式运行SQL查询，并将结果作为一个`DataFrame`返回。


{% include_example run_sql python/sql/basic.py %}
</div>

<div data-lang="r"  markdown="1">
`SparkSession`中的`sql`函数可以让应用程序以编程的方式运行SQL查询，并将结果作为一个`SparkDataFrame`返回。


{% include_example run_sql r/RSparkSQLExample.R %}

</div>
</div>

## 全局临时视图

Spark SQL中的临时视图是session作用域的，如果创建它的session终止了，临时表也就消失了。如果要在Spark应用程序终止之前让所有session之间共享一个临时视图并保持活跃状态，可以创建一个全局临时视图。全局临时视图是和系统保留数据库`global_temp`绑定的，我们在引用的时候必须加上`global_temp`，如： `SELECT * FROM global_temp.view1`。

<div class="codetabs">
<div data-lang="scala"  markdown="1">
{% include_example global_temp_view scala/org/apache/spark/examples/sql/SparkSQLExample.scala %}
</div>

<div data-lang="java" markdown="1">
{% include_example global_temp_view java/org/apache/spark/examples/sql/JavaSparkSQLExample.java %}
</div>

<div data-lang="python"  markdown="1">
{% include_example global_temp_view python/sql/basic.py %}
</div>

<div data-lang="sql"  markdown="1">

{% highlight sql %}

CREATE GLOBAL TEMPORARY VIEW temp_view AS SELECT a + 1, b * 2 FROM tbl

SELECT * FROM global_temp.temp_view

{% endhighlight %}

</div>
</div>

## 创建Dataset

Dataset与RDD相似，但是它们不是使用Java序列化或Kryo，而是使用专用的[Encoder](api/scala/index.html#org.apache.spark.sql.Encoder)对对象进行序列化以进行网络处理或传输。虽然编码器和标准序列化都负责将对象转换为字节，但是编码器是动态生成的代码，并使用一种格式，该格式允许Spark执行许多操作，例如过滤，排序和哈希处理，而无需将字节反序列化为对象。

<div class="codetabs">
<div data-lang="scala"  markdown="1">
{% include_example create_ds scala/org/apache/spark/examples/sql/SparkSQLExample.scala %}
</div>

<div data-lang="java" markdown="1">
{% include_example create_ds java/org/apache/spark/examples/sql/JavaSparkSQLExample.java %}
</div>
</div>

## RDD的互操作

Spark SQL支持两种将现有RDD转换为Dataset的方法。第一种方法使用反射来推断包含特定对象类型的RDD的Schema（结构）。这种基于反射的方法可以使代码更简洁，并且当你在编写Spark应用程序时已经了解Schema（结构）的话，可以很好地工作。

创建Dataset的第二种方法是通过编程接口，该接口允许你构造一个Schema（结构），然后将其应用于现有的RDD。尽管此方法较为冗长，但可以让你在运行前知道列及其类型并构造Dataset。

### 使用反射推断结构
<div class="codetabs">

<div data-lang="scala"  markdown="1">
Spark SQL 的 Scala 接口支持自动转换一个包含 case classes 的 RDD 为 DataFrame。Case class 定义了表的 Schema。Case class 的参数名使用反射读取并且成为了列名。Case class 也可以是嵌套的或者包含像 `Seq` 或者 `Array` 这样的复杂类型。这个 RDD 能够被隐式转换成一个 DataFrame 然后被注册为一个表。表可以用于后续的 SQL 语句。

{% include_example schema_inferring scala/org/apache/spark/examples/sql/SparkSQLExample.scala %}
</div>

<div data-lang="java"  markdown="1">
Spark SQL支持将[JavaBean](http://stackoverflow.com/questions/3295496/what-is-a-javabean-exactly)的RDD自动转换为DataFrame。`BeanInfo`通过反射创建并定义了表的结构（Schema）。当前，Spark SQL不支持包含`Map`的JavaBean 。 不过支持嵌套JavaBean和`List`或`Array`。你可以通过一个实现Serializable，并具有其所有字段getter和setter方法的类来创建JavaBean。

{% include_example schema_inferring java/org/apache/spark/examples/sql/JavaSparkSQLExample.java %}
</div>

<div data-lang="python"  markdown="1">
Spark SQL可以将Row对象的RDD转换为DataFrame，从而推断数据类型。通过将key/value对的list作为kwargs传递给Row类来构造Row对象。key定义表的列名，并且通过对整个数据集进行采样来推断类型，类似于对JSON文件执行的推断。

{% include_example schema_inferring python/sql/basic.py %}
</div>

</div>

### 以编程方式指定Schema（结构）

<div class="codetabs">

<div data-lang="scala"  markdown="1">
如果 case class 不能够在执行之前被定义（例如，records 记录的结构在一个 string 字符串中被编码了，或者一个 text 文本 dataset 为不同用户解析的结果不一样），那么可以通过下面三步创建`DataFrame`：

1. 从原始RDD创建 `Row`  组成的RDD； 
2. 创建一个匹配了用`StructType` 表示的schema，`StructType`和在步骤1中创建的RDD的`Row`相匹配。
3. 通过 `SparkSession` 提供的 `createDataFrame` 方法将 Schema 应用到 RDD 的 RowS（行）。

如：

{% include_example programmatic_schema scala/org/apache/spark/examples/sql/SparkSQLExample.scala %}
</div>

<div data-lang="java"  markdown="1">
当无法提前定义JavaBean类时（例如，records 记录的结构在一个 string 字符串中被编码了，或者一个 text 文本 dataset 为不同用户解析的结果不一样），那么可以通过下面三步创建 `Dataset<Row>` ：

1. 从原始RDD创建 `Row`  组成的RDD； 
2. 创建一个匹配了用`StructType` 表示的schema，`StructType`和在步骤1中创建的RDD的`Row`相匹配。
3. 通过 `SparkSession` 提供的 `createDataFrame` 方法将 Schema 应用到 RDD 的 RowS（行）。

如：

{% include_example programmatic_schema java/org/apache/spark/examples/sql/JavaSparkSQLExample.java %}
</div>

<div data-lang="python"  markdown="1">
当无法提前定义字典的kwargs 时（例如，records 记录的结构在一个 string 字符串中被编码了，或者一个 text 文本 dataset 为不同用户解析的结果不一样），那么可以通过下面三步创建 `Dataset<Row>` ：

1. 从原始RDD创建 `Row`  组成的RDD； 
2. 创建一个匹配了用`StructType` 表示的schema，`StructType`和在步骤1中创建的RDD的`Row`相匹配。
3. 通过 `SparkSession` 提供的 `createDataFrame` 方法将 Schema 应用到 RDD 的 RowS（行）。

如：

{% include_example programmatic_schema python/sql/basic.py %}
</div>

</div>

## 标量函数
(to be filled soon)

## 聚合

Spark提供了一些 [内置的 DataFrames 函数](api/scala/index.html#org.apache.spark.sql.functions$) 如 `count()`, `countDistinct()`, `avg()`, `max()`, `min()
等。虽然这些函数是为DataFrame设计的，但Spark SQL在[Scala](api/scala/index.html#org.apache.spark.sql.expressions.scalalang.typed$)和[Java](api/java/org/apache/spark/sql/expressions/javalang/typed.html)中也提供了这些函数type-safe的版本，可以使其通过强类型的Dataset工作。此外，除了内置的函数，用户还可以自定义相关函数。

### 未类型化的用户定义的聚合函数

用户必须继承[UserDefinedAggregateFunction](api/scala/index.html#org.apache.spark.sql.expressions.UserDefinedAggregateFunction) 抽象类以实现自定义无类型的聚合函数。例如，用户定义的平均值如下所示：

<div class="codetabs">
<div data-lang="scala"  markdown="1">
{% include_example untyped_custom_aggregation scala/org/apache/spark/examples/sql/UserDefinedUntypedAggregation.scala%}
</div>
<div data-lang="java"  markdown="1">
{% include_example untyped_custom_aggregation java/org/apache/spark/examples/sql/JavaUserDefinedUntypedAggregation.java%}
</div>
</div>

### 类型安全的用户定义的聚合函数

用户定义的强类型Dataset的[聚合](api/scala/index.html#org.apache.spark.sql.expressions.Aggregator)围绕[Aggregator](api/scala/index.html#org.apache.spark.sql.expressions.Aggregator)抽象类展开。例如，类型安全的用户定义的平均值如下所示：

<div class="codetabs">
<div data-lang="scala"  markdown="1">
{% include_example typed_custom_aggregation scala/org/apache/spark/examples/sql/UserDefinedTypedAggregation.scala%}
</div>
<div data-lang="java"  markdown="1">
{% include_example typed_custom_aggregation java/org/apache/spark/examples/sql/JavaUserDefinedTypedAggregation.java%}
</div>
</div>
