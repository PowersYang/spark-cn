package org.apache.spark.sql.catalyst.expressions;
/**
 * Create a Decimal from an unscaled Long value.
 * Note: this expression is internal and created only by the optimizer,
 * we don't need to do type check for it.
 */
public  class MakeDecimal extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  int precision ()  { throw new RuntimeException(); }
  public  int scale ()  { throw new RuntimeException(); }
  // not preceding
  public   MakeDecimal (org.apache.spark.sql.catalyst.expressions.Expression child, int precision, int scale)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
