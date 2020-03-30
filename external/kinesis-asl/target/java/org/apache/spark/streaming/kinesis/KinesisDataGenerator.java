package org.apache.spark.streaming.kinesis;
/** A wrapper interface that will allow us to consolidate the code for synthetic data generation. */
public  interface KinesisDataGenerator {
  /** Sends the data to Kinesis and returns the metadata for everything that has been sent. */
  public  scala.collection.immutable.Map<java.lang.String, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.String>>> sendData (java.lang.String streamName, scala.collection.Seq<java.lang.Object> data)  ;
}
