package org.apache.spark.sql.execution.streaming.sources;
public  interface RateControlMicroBatchStream extends org.apache.spark.sql.connector.read.streaming.MicroBatchStream {
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset ()  ;
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset (org.apache.spark.sql.connector.read.streaming.Offset start)  ;
}
