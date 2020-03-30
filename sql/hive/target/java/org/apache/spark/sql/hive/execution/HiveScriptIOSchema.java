package org.apache.spark.sql.hive.execution;
public  class HiveScriptIOSchema implements org.apache.spark.sql.hive.HiveInspectors, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.hive.execution.HiveScriptIOSchema apply (org.apache.spark.sql.catalyst.plans.logical.ScriptInputOutputSchema input)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputRowFormat ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputRowFormat ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> inputSerdeClass ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputSerdeClass ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputSerdeProps ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputSerdeProps ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> recordReaderClass ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> recordWriterClass ()  { throw new RuntimeException(); }
  public  boolean schemaLess ()  { throw new RuntimeException(); }
  // not preceding
  public   HiveScriptIOSchema (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputRowFormat, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputRowFormat, scala.Option<java.lang.String> inputSerdeClass, scala.Option<java.lang.String> outputSerdeClass, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputSerdeProps, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputSerdeProps, scala.Option<java.lang.String> recordReaderClass, scala.Option<java.lang.String> recordWriterClass, boolean schemaLess)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> inputRowFormatMap ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> outputRowFormatMap ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<org.apache.hadoop.hive.serde2.AbstractSerDe, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector>> initInputSerDe (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> input)  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<org.apache.hadoop.hive.serde2.AbstractSerDe, org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector>> initOutputSerDe (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.hadoop.hive.ql.exec.RecordReader> recordReader (java.io.InputStream inputStream, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.hadoop.hive.ql.exec.RecordWriter> recordWriter (java.io.OutputStream outputStream, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
