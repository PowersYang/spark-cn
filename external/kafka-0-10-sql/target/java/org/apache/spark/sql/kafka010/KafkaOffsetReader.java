package org.apache.spark.sql.kafka010;
/**
 * This class uses Kafka's own {@link KafkaConsumer} API to read data offsets from Kafka.
 * The {@link ConsumerStrategy} class defines which Kafka topics and partitions should be read
 * by this source. These strategies directly correspond to the different consumption options
 * in. This class is designed to return a configured {@link KafkaConsumer} that is used by the
 * {@link KafkaSource} to query for the offsets. See the docs on
 * {@link org.apache.spark.sql.kafka010.ConsumerStrategy}
 * for more details.
 * <p>
 * Note: This class is not ThreadSafe
 */
  class KafkaOffsetReader implements org.apache.spark.internal.Logging {
  // not preceding
  public   KafkaOffsetReader (org.apache.spark.sql.kafka010.ConsumerStrategy consumerStrategy, java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams, org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> readerOptions, java.lang.String driverGroupIdPrefix)  { throw new RuntimeException(); }
  /**
   * A KafkaConsumer used in the driver to query the latest Kafka offsets. This only queries the
   * offsets and never commits them.
   * @return (undocumented)
   */
  protected  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> _consumer ()  { throw new RuntimeException(); }
  /**
   * Closes the connection to Kafka, and cleans up state.
   */
  public  void close ()  { throw new RuntimeException(); }
  protected  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> consumer ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams ()  { throw new RuntimeException(); }
  public  scala.concurrent.ExecutionContextExecutorService execContext ()  { throw new RuntimeException(); }
  /**
   * Fetch the earliest offsets for the topic partitions that are indicated
   * in the {@link ConsumerStrategy}.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets ()  { throw new RuntimeException(); }
  /**
   * Fetch the earliest offsets for specific topic partitions.
   * The return result may not contain some partitions if they are deleted.
   * @param newPartitions (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets (scala.collection.Seq<org.apache.kafka.common.TopicPartition> newPartitions)  { throw new RuntimeException(); }
  /**
   * Fetch the latest offsets for the topic partitions that are indicated
   * in the {@link ConsumerStrategy}.
   * <p>
   * Kafka may return earliest offsets when we are requesting latest offsets if <code>poll</code> is called
   * right before <code>seekToEnd</code> (KAFKA-7703). As a workaround, we will call <code>position</code> right after
   * <code>poll</code> to wait until the potential offset request triggered by <code>poll(0)</code> is done.
   * <p>
   * In addition, to avoid other unknown issues, we also use the given <code>knownOffsets</code> to audit the
   * latest offsets returned by Kafka. If we find some incorrect offsets (a latest offset is less
   * than an offset in <code>knownOffsets</code>), we will retry at most <code>maxOffsetFetchAttempts</code> times. When
   * a topic is recreated, the latest offsets may be less than offsets in <code>knownOffsets</code>. We cannot
   * distinguish this with KAFKA-7703, so we just return whatever we get from Kafka after retrying.
   * @param knownOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchLatestOffsets (scala.Option<scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object>> knownOffsets)  { throw new RuntimeException(); }
  /**
   * Fetch the partition offsets for the topic partitions that are indicated
   * in the {@link ConsumerStrategy} and {@link KafkaOffsetRangeLimit}.
   * @param offsetRangeLimit (undocumented)
   * @param isStartingOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchPartitionOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit offsetRangeLimit, boolean isStartingOffsets)  { throw new RuntimeException(); }
  /**
   * Resolves the specific offsets based on Kafka seek positions.
   * This method resolves offset value -1 to the latest and -2 to the
   * earliest Kafka seek position.
   * <p>
   * @param partitionOffsets the specific offsets to resolve
   * @param reportDataLoss callback to either report or log data loss depending on setting
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificTimestampBasedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionTimestamps, boolean failsOnNoMatchingOffset)  { throw new RuntimeException(); }
  /**
   * @return The Set of TopicPartitions for a given topic
   */
  public  scala.collection.immutable.Set<org.apache.kafka.common.TopicPartition> fetchTopicPartitions ()  { throw new RuntimeException(); }
  /**
   * Used to ensure execute fetch operations execute in an UninterruptibleThread
   * @return (undocumented)
   */
  public  java.util.concurrent.ExecutorService kafkaReaderThread ()  { throw new RuntimeException(); }
    int maxOffsetFetchAttempts ()  { throw new RuntimeException(); }
    long offsetFetchAttemptIntervalMs ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
