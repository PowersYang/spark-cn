package org.apache.spark.sql.execution.datasources.v2;
/** Some helper interfaces that use V2 write semantics through the V1 writer interface. */
public  interface V1FallbackWriters extends org.apache.spark.sql.execution.datasources.v2.SupportsV1Write {
  protected  class toV1WriteBuilder {
    public  org.apache.spark.sql.connector.write.V1WriteBuilder asV1Builder ()  { throw new RuntimeException(); }
    public   toV1WriteBuilder (org.apache.spark.sql.connector.write.WriteBuilder builder)  { throw new RuntimeException(); }
  }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  ;
  public  org.apache.spark.sql.connector.write.V1WriteBuilder newWriteBuilder ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  ;
  public  org.apache.spark.sql.connector.catalog.SupportsWrite table ()  ;
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap writeOptions ()  ;
}
