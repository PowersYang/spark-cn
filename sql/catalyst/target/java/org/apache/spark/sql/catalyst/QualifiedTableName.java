package org.apache.spark.sql.catalyst;
/** A fully qualified identifier for a table (i.e., database.tableName) */
public  class QualifiedTableName implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  public  java.lang.String database ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public   QualifiedTableName (java.lang.String database, java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
