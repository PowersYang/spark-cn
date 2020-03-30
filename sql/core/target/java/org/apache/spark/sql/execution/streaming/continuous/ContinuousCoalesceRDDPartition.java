package org.apache.spark.sql.execution.streaming.continuous;
public  class ContinuousCoalesceRDDPartition implements org.apache.spark.Partition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int index ()  { throw new RuntimeException(); }
  public  java.lang.String endpointName ()  { throw new RuntimeException(); }
  public  int queueSize ()  { throw new RuntimeException(); }
  public  int numShuffleWriters ()  { throw new RuntimeException(); }
  public  long epochIntervalMs ()  { throw new RuntimeException(); }
  // not preceding
  public   ContinuousCoalesceRDDPartition (int index, java.lang.String endpointName, int queueSize, int numShuffleWriters, long epochIntervalMs)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.continuous.shuffle.ContinuousShuffleReader reader ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef endpoint ()  { throw new RuntimeException(); }
    boolean writersInitialized ()  { throw new RuntimeException(); }
}
