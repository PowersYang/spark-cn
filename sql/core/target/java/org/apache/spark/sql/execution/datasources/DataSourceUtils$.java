package org.apache.spark.sql.execution.datasources;
public  class DataSourceUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataSourceUtils$ MODULE$ = null;
  public   DataSourceUtils$ ()  { throw new RuntimeException(); }
  /**
   * The key to use for storing partitionBy columns as options.
   * @return (undocumented)
   */
  public  java.lang.String PARTITIONING_COLUMNS_KEY ()  { throw new RuntimeException(); }
  public  java.lang.String encodePartitioningColumns (scala.collection.Seq<java.lang.String> columns)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> decodePartitioningColumns (java.lang.String str)  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in datasource. This verification should be done
   * in a driver side.
   * @param format (undocumented)
   * @param schema (undocumented)
   */
  public  void verifySchema (org.apache.spark.sql.execution.datasources.FileFormat format, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    boolean isDataPath (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
    boolean isDataFile (java.lang.String fileName)  { throw new RuntimeException(); }
}
