package org.apache.spark.sql.execution.datasources.v2;
/**
 * Helper for physical plans that build batch writes.
 */
public  interface BatchWriteHelper {
  public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder ()  ;
  public  org.apache.spark.sql.execution.SparkPlan query ()  ;
  public  org.apache.spark.sql.connector.catalog.SupportsWrite table ()  ;
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap writeOptions ()  ;
}
