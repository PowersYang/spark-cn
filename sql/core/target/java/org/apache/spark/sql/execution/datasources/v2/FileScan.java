package org.apache.spark.sql.execution.datasources.v2;
public abstract class FileScan implements org.apache.spark.sql.connector.read.Scan, org.apache.spark.sql.connector.read.Batch, org.apache.spark.sql.connector.read.SupportsReportStatistics, org.apache.spark.internal.Logging {
  public   FileScan (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex fileIndex, org.apache.spark.sql.types.StructType readDataSchema, org.apache.spark.sql.types.StructType readPartitionSchema)  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  protected  boolean equivalentFilters (org.apache.spark.sql.sources.Filter[] a, org.apache.spark.sql.sources.Filter[] b)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.Statistics estimateStatistics ()  { throw new RuntimeException(); }
  /**
   * If a file with <code>path</code> is unsplittable, return the unsplittable reason,
   * otherwise return <code>None</code>.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getFileUnSplittableReason (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Returns whether a file with <code>path</code> could be split or not.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  boolean isSplitable (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.execution.datasources.FilePartition> partitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.Batch toBatch ()  { throw new RuntimeException(); }
}
