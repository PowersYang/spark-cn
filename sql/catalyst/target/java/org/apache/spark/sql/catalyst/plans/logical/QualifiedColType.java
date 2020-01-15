package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Column data as parsed by ALTER TABLE ... ADD COLUMNS.
 */
public  class QualifiedColType implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> comment ()  { throw new RuntimeException(); }
  // not preceding
  public   QualifiedColType (scala.collection.Seq<java.lang.String> name, org.apache.spark.sql.types.DataType dataType, scala.Option<java.lang.String> comment)  { throw new RuntimeException(); }
}
