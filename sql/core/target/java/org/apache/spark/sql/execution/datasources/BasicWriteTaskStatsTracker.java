package org.apache.spark.sql.execution.datasources;
/**
 * Simple {@link WriteTaskStatsTracker} implementation that produces {@link BasicWriteTaskStats}.
 */
public  class BasicWriteTaskStatsTracker implements org.apache.spark.sql.execution.datasources.WriteTaskStatsTracker, org.apache.spark.internal.Logging {
  public   BasicWriteTaskStatsTracker (org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.WriteTaskStats getFinalStats ()  { throw new RuntimeException(); }
  public  void newBucket (int bucketId)  { throw new RuntimeException(); }
  public  void newFile (java.lang.String filePath)  { throw new RuntimeException(); }
  public  void newPartition (org.apache.spark.sql.catalyst.InternalRow partitionValues)  { throw new RuntimeException(); }
  public  void newRow (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
