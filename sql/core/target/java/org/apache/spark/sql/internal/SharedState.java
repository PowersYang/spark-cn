package org.apache.spark.sql.internal;
/**
 * A class that holds all state shared across sessions in a given {@link SQLContext}.
 * <p>
 * param:  sparkContext The Spark context associated with this SharedState
 * param:  initialConfigs The configs from the very first created SparkSession
 */
  class SharedState implements org.apache.spark.internal.Logging {
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  // not preceding
  public   SharedState (org.apache.spark.SparkContext sparkContext, scala.collection.Map<java.lang.String, java.lang.String> initialConfigs)  { throw new RuntimeException(); }
  public  java.lang.String warehousePath ()  { throw new RuntimeException(); }
  /**
   * Class for caching query results reused in future executions.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.CacheManager cacheManager ()  { throw new RuntimeException(); }
  /**
   * A map of active streaming queries to the session specific StreamingQueryManager that manages
   * the lifecycle of that stream.
   * @return (undocumented)
   */
    java.util.concurrent.ConcurrentHashMap<java.util.UUID, org.apache.spark.sql.streaming.StreamingQueryManager> activeStreamingQueries ()  { throw new RuntimeException(); }
  /**
   * A status store to query SQL status/metrics of this Spark application, based on SQL-specific
   * {@link org.apache.spark.scheduler.SparkListenerEvent}s.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.ui.SQLAppStatusStore statusStore ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.ExternalCatalogWithListener externalCatalog ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.GlobalTempViewManager globalTempViewManager ()  { throw new RuntimeException(); }
  /**
   * A classloader used to load all user-added jar.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.internal.NonClosableMutableURLClassLoader jarClassLoader ()  { throw new RuntimeException(); }
}
