package org.apache.spark.resource;
/**
 * Resource identifier.
 * param:  componentName spark.driver / spark.executor / spark.task
 * param:  resourceName  gpu, fpga, etc
 */
  class ResourceID implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String componentName ()  { throw new RuntimeException(); }
  public  java.lang.String resourceName ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceID (java.lang.String componentName, java.lang.String resourceName)  { throw new RuntimeException(); }
  public  java.lang.String confPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String amountConf ()  { throw new RuntimeException(); }
  public  java.lang.String discoveryScriptConf ()  { throw new RuntimeException(); }
  public  java.lang.String vendorConf ()  { throw new RuntimeException(); }
}
