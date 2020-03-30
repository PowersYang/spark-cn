package org.apache.spark.sql.kafka010;
public  class CachedKafkaProducer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CachedKafkaProducer$ MODULE$ = null;
  public   CachedKafkaProducer$ ()  { throw new RuntimeException(); }
  /**
   * Get a cached KafkaProducer for a given configuration. If matching KafkaProducer doesn't
   * exist, a new KafkaProducer will be created. KafkaProducer is thread safe, it is best to keep
   * one instance per specified kafkaParams.
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
    org.apache.kafka.clients.producer.KafkaProducer<byte[], byte[]> getOrCreate (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  /** For explicitly closing kafka producer */
    void close (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
    void clear ()  { throw new RuntimeException(); }
}
