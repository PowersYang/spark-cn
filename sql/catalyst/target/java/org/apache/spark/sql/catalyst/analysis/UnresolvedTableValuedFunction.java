package org.apache.spark.sql.catalyst.analysis;
/**
 * A table-valued function, e.g.
 * <pre><code>
 *   select id from range(10);
 *
 *   // Assign alias names
 *   select t.a from range(10) t(a);
 * </code></pre>
 * <p>
 * param:  functionName name of this table-value function
 * param:  functionArgs list of function arguments
 * param:  outputNames alias names of function output columns. If these names given, an analyzer
 *                    adds {@link Project} to rename the output columns.
 */
public  class UnresolvedTableValuedFunction extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String functionName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> functionArgs ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> outputNames ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedTableValuedFunction (java.lang.String functionName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> functionArgs, scala.collection.Seq<java.lang.String> outputNames)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
}
