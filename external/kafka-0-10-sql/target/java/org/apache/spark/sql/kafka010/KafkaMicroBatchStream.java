package org.apache.spark.sql.kafka010;
/**
 * A {@link MicroBatchStream} that reads data from Kafka.
 * <p>
 * The {@link KafkaSourceOffset} is the custom {@link Offset} defined for this source that contains
 * a map of TopicPartition -> offset. Note that this offset is 1 + (available offset). For
 * example if the last record in a Kafka topic "t", partition 2 is offset 5, then
 * KafkaSourceOffset will contain TopicPartition("t", 2) -> 6. This is done keep it consistent
 * with the semantics of <code>KafkaConsumer.position()</code>.
 * <p>
 * Zero data lost is not guaranteed when topics are deleted. If zero data lost is critical, the user
 * must make sure all messages in a topic have been processed when deleting a topic.
 * <p>
 * There is a known issue caused by KAFKA-1894: the query using Kafka maybe cannot be stopped.
 * To avoid this issue, you should make sure stopping the query before stopping the Kafka brokers
 * and not use wrong broker addresses.
 */
  class KafkaMicroBatchStream implements org.apache.spark.sql.execution.streaming.sources.RateControlMicroBatchStream, org.apache.spark.internal.Logging {
  // not preceding
  public   KafkaMicroBatchStream (org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaOffsetReader, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, org.apache.spark.sql.util.CaseInsensitiveStringMap options, java.lang.String metadataPath, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  /**
   * Lazily initialize <code>initialPartitionOffsets</code> to make sure that <code>KafkaConsumer.poll</code> is only
   * called in StreamExecutionThread. Otherwise, interrupting a thread while running
   * <code>KafkaConsumer.poll</code> may hang forever (KAFKA-1894).
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
    org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaOffsetReader ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset (org.apache.spark.sql.connector.read.streaming.Offset start)  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> maxOffsetsPerTrigger ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
    long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
