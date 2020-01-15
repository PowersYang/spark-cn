package org.apache.spark.resource;
  class ResourceRequest implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceID id ()  { throw new RuntimeException(); }
  public  int amount ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> discoveryScript ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> vendor ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceRequest (org.apache.spark.resource.ResourceID id, int amount, scala.Option<java.lang.String> discoveryScript, scala.Option<java.lang.String> vendor)  { throw new RuntimeException(); }
}
