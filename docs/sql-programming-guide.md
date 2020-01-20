---
layout: global
displayTitle: Spark SQL，DataFrames和Datasets指南
title: Spark SQL和DataFrame
---

Spark SQL是用于结构化数据处理的Spark模块。与基础的Spark RDD API不同，Spark SQL提供的接口为Spark提供了有关数据结构和执行计算的更多信息。在内部，Spark SQL使用这些额外的信息来执行额外的优化。与Spark SQL交互的方法有多种，包括SQL和Dataset API。计算结果时，将使用相同的执行引擎，而与要用来表达计算的API或语言无关。这种统一意味着开发人员可以轻松地在不同的API之间来回切换，从而提供最自然的方式来表达给定的转换。

此页面上的所有示例均使用Spark发行版中包含的示例数据，并且可以在`spark-shell`，`pyspark shell`或`sparkR shell`中运行。

## SQL

Spark SQL的一种用途是执行SQL查询。Spark SQL还可以用于从现有的Hive中读取数据。有关如何配置此功能的更多信息，请参考[Hive Tables](sql-data-sources-hive-tables.html)部分。当从另一种编程语言中运行SQL时，结果将作为[Dataset / DataFrame](sql-programming-guide.html#datasets-and-dataframes)返回。你还可以使用[命令行](sql-distributed-sql-engine.html#running-the-spark-sql-cli) 或通过[JDBC / ODBC](sql-distributed-sql-engine.html#running-the-thrift-jdbcodbc-server)与SQL接口进行交互。

## Datasets 和 DataFrame

Dataset 是数据的分布式集合。Dataset是Spark 1.6中添加的新接口，它具有RDD的优点（强类型输入，使用强大的Lambda函数的能力）和Spark SQL的优化执行引擎的优点。Dataset可以被从JVM对象中[构造](sql-getting-started.html#creating-datasets)，然后使用函数转换（`map`，`flatMap`，`filter`等等）。Dataset API在[Scala](api/scala/index.html#org.apache.spark.sql.Dataset)和 [Java中](api/java/index.html?org/apache/spark/sql/Dataset.html)可用。Python不支持Dataset API。但是由于Python的动态特性，Dataset API的许多优点已经可用（即，你可以自然地通过名称访问行字段 `row.columnName`）。R的情况类似。

一个 DataFrame 是组织命名列的 *Dataset* 。从概念上讲，它等效于关系数据库中的表或R / Python中的data frame，但是在后台进行了更丰富的优化。可以从多种[来源](sql-data-sources.html)构造DataFrame，例如：结构化数据文件，Hive中的表，外部数据库或现有RDD。DataFrame API在Scala，Java，[Python](api/python/pyspark.sql.html#pyspark.sql.DataFrame)和[R中](api/R/index.html)可用。在Scala和Java中，DataFrame 是由Dataset的`Row` 来表示。在[Scala API中](api/scala/index.html#org.apache.spark.sql.Dataset)，`DataFrame`只是类型`Dataset[Row]`的别名。而在[Java API中](api/java/index.html?org/apache/spark/sql/Dataset.html)，用户需要使用`Dataset<Row>`来表示`DataFrame`。

在整个文档中，我们通常将的Scala / Java数据集`Row`称为DataFrames。