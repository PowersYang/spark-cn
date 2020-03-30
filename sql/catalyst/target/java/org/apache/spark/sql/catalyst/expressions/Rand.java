package org.apache.spark.sql.catalyst.expressions;
/** Generate a random column with i.i.d. uniformly distributed values in [0, 1). */
public  class Rand extends org.apache.spark.sql.catalyst.expressions.RDG implements org.apache.spark.sql.catalyst.expressions.ExpressionWithRandomSeed, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.expressions.Rand apply (long seed)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   Rand (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public   Rand ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Rand withNewSeed (long seed)  { throw new RuntimeException(); }
  protected  double evalInternal (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Rand freshCopy ()  { throw new RuntimeException(); }
}
