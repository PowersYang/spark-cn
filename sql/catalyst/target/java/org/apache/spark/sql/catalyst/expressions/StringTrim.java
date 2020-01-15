package org.apache.spark.sql.catalyst.expressions;
public  class StringTrim extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.String2TrimExpression, scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.StringTrim apply (org.apache.spark.sql.catalyst.expressions.Expression str, org.apache.spark.sql.catalyst.expressions.Expression trimStr)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.StringTrim apply (org.apache.spark.sql.catalyst.expressions.Expression str)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression srcStr ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> trimStr ()  { throw new RuntimeException(); }
  public   StringTrim (org.apache.spark.sql.catalyst.expressions.Expression srcStr, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> trimStr)  { throw new RuntimeException(); }
  public   StringTrim (org.apache.spark.sql.catalyst.expressions.Expression srcStr, org.apache.spark.sql.catalyst.expressions.Expression trimStr)  { throw new RuntimeException(); }
  public   StringTrim (org.apache.spark.sql.catalyst.expressions.Expression srcStr)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
