package org.apache.spark.sql.connector.write;
/**
 * A trait that should be implemented by V1 DataSources that would like to leverage the DataSource
 * V2 write code paths. The InsertableRelation will be used only to Append data. Other
 * instances of the {@link WriteBuilder} interface such as {@link SupportsOverwrite}, {@link SupportsTruncate}
 * should be extended as well to support additional operations other than data appends.
 * <p>
 * This interface is designed to provide Spark DataSources time to migrate to DataSource V2 and
 * will be removed in a future Spark release.
 * <p>
 * @since 3.0.0
 */
public  interface V1WriteBuilder extends org.apache.spark.sql.connector.write.WriteBuilder {
  public  org.apache.spark.sql.connector.write.BatchWrite buildForBatch ()  ;
  public  org.apache.spark.sql.connector.write.streaming.StreamingWrite buildForStreaming ()  ;
  /**
   * Creates an InsertableRelation that allows appending a DataFrame to a
   * a destination (using data source-specific parameters). The insert method will only be
   * called with <code>overwrite=false</code>. The DataSource should implement the overwrite behavior as
   * part of the {@link SupportsOverwrite}, and {@link SupportsTruncate} interfaces.
   * <p>
   * @since 3.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.InsertableRelation buildForV1Write ()  ;
}
