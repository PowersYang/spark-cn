package org.apache.spark.sql.hive.execution;
/**
 * Transforms the input by forking and running the specified script.
 * <p>
 * param:  input the set of expression that should be passed to the script.
 * param:  script the command that should be executed.
 * param:  output the attributes that are produced by the script.
 */
public  class ScriptTransformationExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> input ()  { throw new RuntimeException(); }
  public  java.lang.String script ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.HiveScriptIOSchema ioschema ()  { throw new RuntimeException(); }
  // not preceding
  public   ScriptTransformationExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> input, java.lang.String script, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.execution.SparkPlan child, org.apache.spark.sql.hive.execution.HiveScriptIOSchema ioschema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
