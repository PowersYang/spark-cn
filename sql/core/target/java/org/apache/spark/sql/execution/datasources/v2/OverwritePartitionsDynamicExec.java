package org.apache.spark.sql.execution.datasources.v2;
/**
 * Physical plan node for dynamic partition overwrite into a v2 table.
 * <p>
 * Dynamic partition overwrite is the behavior of Hive INSERT OVERWRITE ... PARTITION queries, and
 * Spark INSERT OVERWRITE queries when spark.sql.sources.partitionOverwriteMode=dynamic. Each
 * partition in the output data set replaces the corresponding existing partition in the table or
 * creates a new partition. Existing partitions for which there is no data in the output data set
 * are not modified.
 */
public  class OverwritePartitionsDynamicExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.datasources.v2.V2TableWriteExec, org.apache.spark.sql.execution.datasources.v2.BatchWriteHelper, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.StreamWriterCommitProgress> commitProgress ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.SupportsWrite table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap writeOptions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan query ()  { throw new RuntimeException(); }
  // not preceding
  public   OverwritePartitionsDynamicExec (org.apache.spark.sql.connector.catalog.SupportsWrite table, org.apache.spark.sql.util.CaseInsensitiveStringMap writeOptions, org.apache.spark.sql.execution.SparkPlan query)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
