package org.apache.spark.sql.catalyst.expressions;
/**
 * Replace all substrings of str that match regexp with rep.
 * <p>
 * NOTE: this expression is not THREAD-SAFE, as it has some internal mutable status.
 */
public  class RegExpReplace extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression subject ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression regexp ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression rep ()  { throw new RuntimeException(); }
  // not preceding
  public   RegExpReplace (org.apache.spark.sql.catalyst.expressions.Expression subject, org.apache.spark.sql.catalyst.expressions.Expression regexp, org.apache.spark.sql.catalyst.expressions.Expression rep)  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object s, Object p, Object r)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
