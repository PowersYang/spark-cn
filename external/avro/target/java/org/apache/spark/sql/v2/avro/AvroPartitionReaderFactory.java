package org.apache.spark.sql.v2.avro;
/**
 * A factory used to create AVRO readers.
 * <p>
 * param:  sqlConf SQL configuration.
 * param:  broadcastedConf Broadcast serializable Hadoop Configuration.
 * param:  dataSchema Schema of AVRO files.
 * param:  readDataSchema Required data schema of AVRO files.
 * param:  partitionSchema Schema of partitions.
 * param:  options Options for parsing AVRO files.
 */
public  class AvroPartitionReaderFactory extends org.apache.spark.sql.execution.datasources.v2.FilePartitionReaderFactory implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf sqlConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType dataSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readDataSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType partitionSchema ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  { throw new RuntimeException(); }
  // not preceding
  public   AvroPartitionReaderFactory (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType readDataSchema, org.apache.spark.sql.types.StructType partitionSchema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReader<org.apache.spark.sql.catalyst.InternalRow> buildReader (org.apache.spark.sql.execution.datasources.PartitionedFile partitionedFile)  { throw new RuntimeException(); }
}
