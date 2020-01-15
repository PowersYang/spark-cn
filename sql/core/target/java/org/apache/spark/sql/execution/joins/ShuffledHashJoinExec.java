package org.apache.spark.sql.execution.joins;
/**
 * Performs a hash join of two child relations by first shuffling the data using the join keys.
 */
public  class ShuffledHashJoinExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.BinaryExecNode, org.apache.spark.sql.execution.joins.HashJoin, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkPlan buildPlan ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkPlan streamedPlan ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> buildKeys ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> streamedKeys ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.BuildSide buildSide ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan right ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffledHashJoinExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.execution.joins.BuildSide buildSide, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, org.apache.spark.sql.execution.SparkPlan left, org.apache.spark.sql.execution.SparkPlan right)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
