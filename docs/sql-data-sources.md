---
layout: global
title: 数据源
displayTitle: 数据源
---

Spark SQL支持通过DataFrame接口对各种数据源进行操作。DataFrame可以使用关系转换进行操作，也可以用于创建临时视图。将DataFrame注册为临时视图使你可以对其数据运行SQL查询。本节介绍了使用Spark数据源加载和保存数据的一般方法，然后介绍了可用于内置数据源的特定选项。


* [通用 Load/Save 方法](sql-data-sources-load-save-functions.html)
  * [手动指定选项](sql-data-sources-load-save-functions.html#manually-specifying-options)
  * [Run SQL on files directly](sql-data-sources-load-save-functions.html#run-sql-on-files-directly)
  * [Save Modes](sql-data-sources-load-save-functions.html#save-modes)
  * [Saving to Persistent Tables](sql-data-sources-load-save-functions.html#saving-to-persistent-tables)
  * [Bucketing, Sorting and Partitioning](sql-data-sources-load-save-functions.html#bucketing-sorting-and-partitioning)
* [Parquet Files](sql-data-sources-parquet.html)
  * [Loading Data Programmatically](sql-data-sources-parquet.html#loading-data-programmatically)
  * [Partition Discovery](sql-data-sources-parquet.html#partition-discovery)
  * [Schema Merging](sql-data-sources-parquet.html#schema-merging)
  * [Hive metastore Parquet table conversion](sql-data-sources-parquet.html#hive-metastore-parquet-table-conversion)
  * [Configuration](sql-data-sources-parquet.html#configuration)
* [ORC Files](sql-data-sources-orc.html)
* [JSON Files](sql-data-sources-json.html)
* [Hive Tables](sql-data-sources-hive-tables.html)
  * [Specifying storage format for Hive tables](sql-data-sources-hive-tables.html#specifying-storage-format-for-hive-tables)
  * [Interacting with Different Versions of Hive Metastore](sql-data-sources-hive-tables.html#interacting-with-different-versions-of-hive-metastore)
* [JDBC To Other Databases](sql-data-sources-jdbc.html)
* [Avro Files](sql-data-sources-avro.html)
  * [Deploying](sql-data-sources-avro.html#deploying)
  * [Load and Save Functions](sql-data-sources-avro.html#load-and-save-functions)
  * [to_avro() and from_avro()](sql-data-sources-avro.html#to_avro-and-from_avro)
  * [Data Source Option](sql-data-sources-avro.html#data-source-option)
  * [Configuration](sql-data-sources-avro.html#configuration)
  * [Compatibility with Databricks spark-avro](sql-data-sources-avro.html#compatibility-with-databricks-spark-avro)
  * [Supported types for Avro -> Spark SQL conversion](sql-data-sources-avro.html#supported-types-for-avro---spark-sql-conversion)
  * [Supported types for Spark SQL -> Avro conversion](sql-data-sources-avro.html#supported-types-for-spark-sql---avro-conversion)
* [Whole Binary Files](sql-data-sources-binaryFile.html)
* [Troubleshooting](sql-data-sources-troubleshooting.html)
