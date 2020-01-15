package org.apache.spark.sql.execution.datasources.orc;
public  class OrcUtils {
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extensionsForCompressionCodecNames ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.hadoop.fs.Path> listOrcFiles (java.lang.String pathStr, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.orc.TypeDescription> readSchema (org.apache.hadoop.fs.Path file, org.apache.hadoop.conf.Configuration conf, boolean ignoreCorruptFiles)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.StructType> readSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
  /**
   * Reads ORC file schemas in multi-threaded manner, using native version of ORC.
   * This is visible for testing.
   * @param files (undocumented)
   * @param conf (undocumented)
   * @param ignoreCorruptFiles (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.sql.types.StructType> readOrcSchemasInParallel (scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files, org.apache.hadoop.conf.Configuration conf, boolean ignoreCorruptFiles)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Returns the requested column ids from the given ORC file. Column id can be -1, which means the
   * requested column doesn't exist in the ORC file. Returns None if the given ORC file is empty.
   * @param isCaseSensitive (undocumented)
   * @param dataSchema (undocumented)
   * @param requiredSchema (undocumented)
   * @param reader (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<int[]> requestedColumnIds (boolean isCaseSensitive, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType requiredSchema, org.apache.orc.Reader reader, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Add a metadata specifying Spark version.
   * @param writer (undocumented)
   */
  static public  void addSparkVersionMetadata (org.apache.orc.Writer writer)  { throw new RuntimeException(); }
  /**
   * Given a <code>StructType</code> object, this methods converts it to corresponding string representation
   * in ORC.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String orcTypeDescriptionString (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
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
}
