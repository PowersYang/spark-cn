package org.apache.spark.scheduler;
/**
 * param:  _message human readable loss reason
 * param:  workerLost whether the worker is confirmed lost too (i.e. including shuffle service)
 */
  class SlaveLost extends org.apache.spark.scheduler.ExecutorLossReason implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String _message ()  { throw new RuntimeException(); }
  public  boolean workerLost ()  { throw new RuntimeException(); }
  // not preceding
  public   SlaveLost (java.lang.String _message, boolean workerLost)  { throw new RuntimeException(); }
}
