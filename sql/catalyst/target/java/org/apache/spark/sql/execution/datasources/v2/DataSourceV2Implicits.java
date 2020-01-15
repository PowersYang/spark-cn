package org.apache.spark.sql.execution.datasources.v2;
public  class DataSourceV2Implicits {
  static public  class TableHelper {
    public   TableHelper (org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.catalog.SupportsDelete asDeletable ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.catalog.SupportsRead asReadable ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.catalog.SupportsWrite asWritable ()  { throw new RuntimeException(); }
    public  boolean supports (org.apache.spark.sql.connector.catalog.TableCapability capability)  { throw new RuntimeException(); }
    public  boolean supportsAny (scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableCapability> capabilities)  { throw new RuntimeException(); }
  }
  static public  class OptionsHelper {
    public   OptionsHelper (scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.util.CaseInsensitiveStringMap asOptions ()  { throw new RuntimeException(); }
  }
}
