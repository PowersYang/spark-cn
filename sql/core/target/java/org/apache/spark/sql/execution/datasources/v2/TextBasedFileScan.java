package org.apache.spark.sql.execution.datasources.v2;
public abstract class TextBasedFileScan extends org.apache.spark.sql.execution.datasources.v2.FileScan {
  public   TextBasedFileScan (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex fileIndex, org.apache.spark.sql.types.StructType readDataSchema, org.apache.spark.sql.types.StructType readPartitionSchema, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  java.lang.String getFileUnSplittableReason (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  boolean isSplitable (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
}
