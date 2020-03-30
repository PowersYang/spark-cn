package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A CREATE NAMESPACE statement, as parsed from SQL.
 */
public  class CreateNamespaceStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public  java.lang.String COMMENT_PROPERTY_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String LOCATION_PROPERTY_KEY ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> namespace ()  { throw new RuntimeException(); }
  public  boolean ifNotExists ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateNamespaceStatement (scala.collection.Seq<java.lang.String> namespace, boolean ifNotExists, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
}
