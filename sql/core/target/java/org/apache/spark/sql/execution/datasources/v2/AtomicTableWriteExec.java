package org.apache.spark.sql.execution.datasources.v2;
public  interface AtomicTableWriteExec extends org.apache.spark.sql.execution.datasources.v2.V2TableWriteExec, org.apache.spark.sql.execution.datasources.v2.SupportsV1Write {
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> writeToStagedTable (org.apache.spark.sql.connector.catalog.StagedTable stagedTable, org.apache.spark.sql.util.CaseInsensitiveStringMap writeOptions, org.apache.spark.sql.connector.catalog.Identifier ident)  ;
}
