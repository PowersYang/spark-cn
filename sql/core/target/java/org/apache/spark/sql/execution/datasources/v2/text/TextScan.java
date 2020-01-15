package org.apache.spark.sql.execution.datasources.v2.text;
public  class TextScan extends org.apache.spark.sql.execution.datasources.v2.TextBasedFileScan implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex fileIndex ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readDataSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readPartitionSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap options ()  { throw new RuntimeException(); }
  // not preceding
  public   TextScan (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex fileIndex, org.apache.spark.sql.types.StructType readDataSchema, org.apache.spark.sql.types.StructType readPartitionSchema, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  boolean isSplitable (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  java.lang.String getFileUnSplittableReason (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
}
