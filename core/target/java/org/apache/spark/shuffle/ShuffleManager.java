package org.apache.spark.shuffle;
/**
 * Pluggable interface for shuffle systems. A ShuffleManager is created in SparkEnv on the driver
 * and on each executor, based on the spark.shuffle.manager setting. The driver registers shuffles
 * with it, and executors (or tasks running locally in the driver) can ask to read and write data.
 * <p>
 * NOTE: this will be instantiated by SparkEnv so its constructor can take a SparkConf and
 * boolean isDriver as parameters.
 */
public  interface ShuffleManager {
  /**
   * Get a reader for a range of reduce partitions (startPartition to endPartition-1, inclusive).
   * Called on executors by reduce tasks.
   * @param handle (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @param metrics (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReader (org.apache.spark.shuffle.ShuffleHandle handle, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleReadMetricsReporter metrics)  ;
  /**
   * Get a reader for a range of reduce partitions (startPartition to endPartition-1, inclusive)
   * that are produced by one specific mapper. Called on executors by reduce tasks.
   * @param handle (undocumented)
   * @param mapIndex (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @param metrics (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReaderForOneMapper (org.apache.spark.shuffle.ShuffleHandle handle, int mapIndex, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleReadMetricsReporter metrics)  ;
  /** Get a writer for a given partition. Called on executors by map tasks. */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.shuffle.ShuffleWriter<K, V> getWriter (org.apache.spark.shuffle.ShuffleHandle handle, long mapId, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleWriteMetricsReporter metrics)  ;
  /**
   * Register a shuffle with the manager and obtain a handle for it to pass to tasks.
   * @param shuffleId (undocumented)
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleHandle registerShuffle (int shuffleId, org.apache.spark.ShuffleDependency<K, V, C> dependency)  ;
  /**
   * Return a resolver capable of retrieving shuffle block data based on block coordinates.
   * @return (undocumented)
   */
  public  org.apache.spark.shuffle.ShuffleBlockResolver shuffleBlockResolver ()  ;
  /** Shut down this ShuffleManager. */
  public  void stop ()  ;
  /**
   * Remove a shuffle's metadata from the ShuffleManager.
   * @return true if the metadata removed successfully, otherwise false.
   * @param shuffleId (undocumented)
   */
  public  boolean unregisterShuffle (int shuffleId)  ;
}
