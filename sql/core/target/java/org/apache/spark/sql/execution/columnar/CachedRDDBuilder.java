package org.apache.spark.sql.execution.columnar;
public  class CachedRDDBuilder implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean useCompression ()  { throw new RuntimeException(); }
  public  int batchSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan cachedPlan ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> tableName ()  { throw new RuntimeException(); }
  // not preceding
  public   CachedRDDBuilder (boolean useCompression, int batchSize, org.apache.spark.storage.StorageLevel storageLevel, org.apache.spark.sql.execution.SparkPlan cachedPlan, scala.Option<java.lang.String> tableName)  { throw new RuntimeException(); }
  public  org.apache.spark.util.LongAccumulator sizeInBytesStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.LongAccumulator rowCountStats ()  { throw new RuntimeException(); }
  public  java.lang.String cachedName ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.execution.columnar.CachedBatch> cachedColumnBuffers ()  { throw new RuntimeException(); }
  public  void clearCache (boolean blocking)  { throw new RuntimeException(); }
  public  boolean isCachedColumnBuffersLoaded ()  { throw new RuntimeException(); }
}
