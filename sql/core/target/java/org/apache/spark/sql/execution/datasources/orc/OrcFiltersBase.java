package org.apache.spark.sql.execution.datasources.orc;
/**
 * Methods that can be shared when upgrading the built-in Hive.
 */
public  interface OrcFiltersBase {
    scala.Option<org.apache.spark.sql.sources.Filter> buildTree (scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  ;
  /**
   * Return true if this is a searchable type in ORC.
   * Both CharType and VarcharType are cleaned at AstBuilder.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
    boolean isSearchableType (org.apache.spark.sql.types.DataType dataType)  ;
    java.lang.String quoteAttributeNameIfNeeded (java.lang.String name)  ;
}
