package org.apache.spark.sql.catalyst.catalog;
/**
 * Event fired after a database has been dropped.
 */
public  class DropDatabaseEvent implements org.apache.spark.sql.catalyst.catalog.DatabaseEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String database ()  { throw new RuntimeException(); }
  // not preceding
  public   DropDatabaseEvent (java.lang.String database)  { throw new RuntimeException(); }
}