package org.apache.spark.sql.execution.streaming.continuous.shuffle;
  class ReceiverEpochMarker implements org.apache.spark.sql.execution.streaming.continuous.shuffle.RPCContinuousShuffleMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int writerId ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceiverEpochMarker (int writerId)  { throw new RuntimeException(); }
}
