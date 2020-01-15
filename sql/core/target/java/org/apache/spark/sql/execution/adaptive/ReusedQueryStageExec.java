package org.apache.spark.sql.execution.adaptive;
/**
 * A wrapper for reused query stage to have different output.
 */
public  class ReusedQueryStageExec extends org.apache.spark.sql.execution.adaptive.QueryStageExec implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.adaptive.QueryStageExec plan ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public   ReusedQueryStageExec (int id, org.apache.spark.sql.execution.adaptive.QueryStageExec plan, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<java.lang.Object> doMaterialize ()  { throw new RuntimeException(); }
  public  void cancel ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.Statistics> computeStats ()  { throw new RuntimeException(); }
}
