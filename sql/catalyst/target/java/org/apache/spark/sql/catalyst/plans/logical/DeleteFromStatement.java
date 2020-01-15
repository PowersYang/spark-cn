package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A DELETE FROM statement, as parsed from SQL.
 */
public  class DeleteFromStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> tableAlias ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  // not preceding
  public   DeleteFromStatement (scala.collection.Seq<java.lang.String> tableName, scala.Option<java.lang.String> tableAlias, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition)  { throw new RuntimeException(); }
}
