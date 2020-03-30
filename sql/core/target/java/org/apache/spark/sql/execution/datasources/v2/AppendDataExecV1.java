package org.apache.spark.sql.execution.datasources.v2;
/**
 * Physical plan node for append into a v2 table using V1 write interfaces.
 * <p>
 * Rows in the output data set are appended.
 */
public  class AppendDataExecV1 extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.datasources.v2.V1FallbackWriters, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.SupportsWrite table ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap writeOptions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
  // not preceding
  public   AppendDataExecV1 (org.apache.spark.sql.connector.catalog.SupportsWrite table, org.apache.spark.sql.util.CaseInsensitiveStringMap writeOptions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
