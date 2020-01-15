package org.apache.spark.sql.catalyst.expressions;
public abstract class ToTimestamp extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression, org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes {
  public   ToTimestamp ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  protected abstract  long downScaleFactor ()  ;
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  java.util.TimeZone timeZone ()  { throw new RuntimeException(); }
  public  java.time.ZoneId zoneId ()  { throw new RuntimeException(); }
}
