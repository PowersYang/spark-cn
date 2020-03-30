package org.apache.spark.examples.sql.streaming;
/** User-defined data type representing the input events */
public  class Event implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String sessionId ()  { throw new RuntimeException(); }
  public  java.sql.Timestamp timestamp ()  { throw new RuntimeException(); }
  // not preceding
  public   Event (java.lang.String sessionId, java.sql.Timestamp timestamp)  { throw new RuntimeException(); }
}
