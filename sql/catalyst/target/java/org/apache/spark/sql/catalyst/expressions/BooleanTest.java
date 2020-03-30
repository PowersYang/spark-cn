package org.apache.spark.sql.catalyst.expressions;
public  interface BooleanTest extends org.apache.spark.sql.catalyst.expressions.Predicate, org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes {
  public  boolean boolValueForComparison ()  ;
  public  boolean boolValueWhenNull ()  ;
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  ;
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes ()  ;
  public  boolean nullable ()  ;
}
