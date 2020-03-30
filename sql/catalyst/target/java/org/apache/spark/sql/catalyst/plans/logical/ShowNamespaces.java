package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the SHOW NAMESPACES command that works for v2 catalogs.
 */
public  class ShowNamespaces extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.SupportsNamespaces catalog ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> namespace ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> pattern ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowNamespaces (org.apache.spark.sql.connector.catalog.SupportsNamespaces catalog, scala.Option<scala.collection.Seq<java.lang.String>> namespace, scala.Option<java.lang.String> pattern)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
