package org.apache.spark.internal;
public  class Logging$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Logging$ MODULE$ = null;
  public   Logging$ ()  { throw new RuntimeException(); }
    org.apache.log4j.Level sparkShellThresholdLevel ()  { throw new RuntimeException(); }
  public  java.lang.Object initLock ()  { throw new RuntimeException(); }
  /**
   * Marks the logging system as not initialized. This does a best effort at resetting the
   * logging system to its initial state so that the next class to use logging triggers
   * initialization again.
   */
  public  void uninitialize ()  { throw new RuntimeException(); }
}
