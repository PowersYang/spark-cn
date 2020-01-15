package org.apache.spark.sql.avro;
public  class AvroUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AvroUtils$ MODULE$ = null;
  public   AvroUtils$ ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession spark, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
  public  boolean supportsDataType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
}
