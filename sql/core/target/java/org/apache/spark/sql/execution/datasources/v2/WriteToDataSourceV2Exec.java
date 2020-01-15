package org.apache.spark.sql.execution.datasources.v2;
public  class WriteToDataSourceV2Exec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.datasources.v2.V2TableWriteExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.StreamWriterCommitProgress> commitProgress ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.BatchWrite batchWrite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan query ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToDataSourceV2Exec (org.apache.spark.sql.connector.write.BatchWrite batchWrite, org.apache.spark.sql.execution.SparkPlan query)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap writeOptions ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
