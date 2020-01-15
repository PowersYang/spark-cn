package org.apache.spark.sql.catalyst.plans.logical;
/**
 * This method repartitions data using {@link Expression}s into <code>numPartitions</code>, and receives
 * information about the number of partitions during execution. Used when a specific ordering or
 * distribution is expected by the consumer of the query result. Use {@link Repartition} for RDD-like
 * <code>coalesce</code> and <code>repartition</code>.
 */
public  class RepartitionByExpression extends org.apache.spark.sql.catalyst.plans.logical.RepartitionOperation implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   RepartitionByExpression (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionExpressions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, int numPartitions)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning partitioning ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxRows ()  { throw new RuntimeException(); }
  public  boolean shuffle ()  { throw new RuntimeException(); }
}
