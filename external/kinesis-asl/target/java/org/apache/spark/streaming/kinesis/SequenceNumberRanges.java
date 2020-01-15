package org.apache.spark.streaming.kinesis;
/** Class representing an array of Kinesis sequence number ranges */
  class SequenceNumberRanges implements scala.Product, scala.Serializable {
  static public  org.apache.spark.streaming.kinesis.SequenceNumberRanges apply (org.apache.spark.streaming.kinesis.SequenceNumberRange range)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.kinesis.SequenceNumberRange> ranges ()  { throw new RuntimeException(); }
  // not preceding
  public   SequenceNumberRanges (scala.collection.Seq<org.apache.spark.streaming.kinesis.SequenceNumberRange> ranges)  { throw new RuntimeException(); }
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  public  boolean nonEmpty ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
