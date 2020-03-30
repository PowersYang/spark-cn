package org.apache.spark.examples.streaming;
/**
 * Usage: KinesisWordProducerASL <stream-name> <endpoint-url> \
 *   <records-per-sec> <words-per-record>
 * <p>
 *   <stream-name> is the name of the Kinesis stream (ie. mySparkStream)
 *   <endpoint-url> is the endpoint of the Kinesis service
 *     (ie. https://kinesis.us-east-1.amazonaws.com)
 *   <records-per-sec> is the rate of records per second to put onto the stream
 *   <words-per-record> is the rate of records per second to put onto the stream
 * <p>
 * Example:
 *    $ SPARK_HOME/bin/run-example streaming.KinesisWordProducerASL mySparkStream \
 *         https://kinesis.us-east-1.amazonaws.com us-east-1 10 5
 */
public  class KinesisWordProducerASL$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KinesisWordProducerASL$ MODULE$ = null;
  public   KinesisWordProducerASL$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> generate (java.lang.String stream, java.lang.String endpoint, int recordsPerSecond, int wordsPerRecord)  { throw new RuntimeException(); }
}
