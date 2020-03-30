package org.apache.spark.sql.catalyst.expressions;
/**
 * The Lag function returns the value of <code>input</code> at the <code>offset</code>th row before the current row in
 * the window. Offsets start at 0, which is the current row. The offset must be constant
 * integer value. The default offset is 1. When the value of <code>input</code> is null at the <code>offset</code>th row,
 * null is returned. If there is no such offset row, the <code>default</code> expression is evaluated.
 * <p>
 * param:  input expression to evaluate <code>offset</code> rows before the current row.
 * param:  offset rows to jump back in the partition.
 * param:  default to use when the offset row does not exist.
 */
public  class Lag extends org.apache.spark.sql.catalyst.expressions.OffsetWindowFunction implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression input ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression offset ()  { throw new RuntimeException(); }
  // not preceding
  public   Lag (org.apache.spark.sql.catalyst.expressions.Expression input, org.apache.spark.sql.catalyst.expressions.Expression offset, org.apache.spark.sql.catalyst.expressions.Expression default_)  { throw new RuntimeException(); }
  public   Lag (org.apache.spark.sql.catalyst.expressions.Expression input, org.apache.spark.sql.catalyst.expressions.Expression offset)  { throw new RuntimeException(); }
  public   Lag (org.apache.spark.sql.catalyst.expressions.Expression input)  { throw new RuntimeException(); }
  public   Lag ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Descending$ direction ()  { throw new RuntimeException(); }
}
