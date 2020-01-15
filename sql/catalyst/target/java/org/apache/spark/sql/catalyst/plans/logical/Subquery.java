package org.apache.spark.sql.catalyst.plans.logical;
/**
 * This node is inserted at the top of a subquery when it is optimized. This makes sure we can
 * recognize a subquery as such, and it allows us to write subquery aware transformations.
 */
public  class Subquery extends org.apache.spark.sql.catalyst.plans.logical.OrderPreservingUnaryNode implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   Subquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
