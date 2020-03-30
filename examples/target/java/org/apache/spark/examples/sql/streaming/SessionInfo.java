package org.apache.spark.examples.sql.streaming;
/**
 * User-defined data type for storing a session information as state in mapGroupsWithState.
 * <p>
 * param:  numEvents        total number of events received in the session
 * param:  startTimestampMs timestamp of first event received in the session when it started
 * param:  endTimestampMs   timestamp of last event received in the session before it expired
 */
public  class SessionInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int numEvents ()  { throw new RuntimeException(); }
  public  long startTimestampMs ()  { throw new RuntimeException(); }
  public  long endTimestampMs ()  { throw new RuntimeException(); }
  // not preceding
  public   SessionInfo (int numEvents, long startTimestampMs, long endTimestampMs)  { throw new RuntimeException(); }
  /** Duration of the session, between the first and last events */
  public  long durationMs ()  { throw new RuntimeException(); }
}
