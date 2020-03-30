package org.apache.spark.sql.catalyst.expressions.aggregate;
public  class Kurtosis extends org.apache.spark.sql.catalyst.expressions.aggregate.CentralMomentAgg implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   Kurtosis (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  protected  int momentOrder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}
