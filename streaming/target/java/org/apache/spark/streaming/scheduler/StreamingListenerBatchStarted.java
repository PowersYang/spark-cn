package org.apache.spark.streaming.scheduler;
public  class StreamingListenerBatchStarted implements org.apache.spark.streaming.scheduler.StreamingListenerEvent, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.BatchInfo batchInfo ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingListenerBatchStarted (org.apache.spark.streaming.scheduler.BatchInfo batchInfo)  { throw new RuntimeException(); }
}
