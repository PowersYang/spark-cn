package org.apache.spark.streaming.kinesis;
/** Class representing a range of Kinesis sequence numbers. Both sequence numbers are inclusive. */
  class SequenceNumberRange implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String streamName ()  { throw new RuntimeException(); }
  public  java.lang.String shardId ()  { throw new RuntimeException(); }
  public  java.lang.String fromSeqNumber ()  { throw new RuntimeException(); }
  public  java.lang.String toSeqNumber ()  { throw new RuntimeException(); }
  public  int recordCount ()  { throw new RuntimeException(); }
  // not preceding
  public   SequenceNumberRange (java.lang.String streamName, java.lang.String shardId, java.lang.String fromSeqNumber, java.lang.String toSeqNumber, int recordCount)  { throw new RuntimeException(); }
}
