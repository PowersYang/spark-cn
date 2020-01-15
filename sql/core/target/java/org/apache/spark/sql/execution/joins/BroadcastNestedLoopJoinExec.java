package org.apache.spark.sql.execution.joins;
public  class BroadcastNestedLoopJoinExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.BinaryExecNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan right ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.BuildSide buildSide ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastNestedLoopJoinExec (org.apache.spark.sql.execution.SparkPlan left, org.apache.spark.sql.execution.SparkPlan right, org.apache.spark.sql.execution.joins.BuildSide buildSide, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
