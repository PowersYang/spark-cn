package org.apache.spark.sql.catalyst.expressions;
public  class WeekDay extends org.apache.spark.sql.catalyst.expressions.DayWeek implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   WeekDay (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object date)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
