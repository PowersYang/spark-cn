package org.apache.spark.resource;
  class ResourceRequirement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String resourceName ()  { throw new RuntimeException(); }
  public  int amount ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceRequirement (java.lang.String resourceName, int amount)  { throw new RuntimeException(); }
}
