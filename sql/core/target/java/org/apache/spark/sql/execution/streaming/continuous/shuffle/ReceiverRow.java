package org.apache.spark.sql.execution.streaming.continuous.shuffle;
  class ReceiverRow implements org.apache.spark.sql.execution.streaming.continuous.shuffle.RPCContinuousShuffleMessage, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int writerId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow row ()  { throw new RuntimeException(); }
  // not preceding
  public   ReceiverRow (int writerId, org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
}
