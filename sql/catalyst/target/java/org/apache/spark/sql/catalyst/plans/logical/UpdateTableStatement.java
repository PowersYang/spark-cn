package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A UPDATE tbl_name statement, as parsed from SQL.
 */
public  class UpdateTableStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> tableAlias ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<java.lang.String>> columns ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> values ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition ()  { throw new RuntimeException(); }
  // not preceding
  public   UpdateTableStatement (scala.collection.Seq<java.lang.String> tableName, scala.Option<java.lang.String> tableAlias, scala.collection.Seq<scala.collection.Seq<java.lang.String>> columns, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> values, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition)  { throw new RuntimeException(); }
}
