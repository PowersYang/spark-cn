package org.apache.spark.sql.execution;
/**
 * Builder that converts an ANTLR ParseTree into a LogicalPlan/Expression/TableIdentifier.
 */
public  class SparkSqlAstBuilder extends org.apache.spark.sql.catalyst.parser.AstBuilder {
  // not preceding
  public   SparkSqlAstBuilder (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * Converts a multi-part identifier to a TableIdentifier.
   * <p>
   * If the multi-part identifier has too many parts, this will throw a ParseException.
   * @param multipart (undocumented)
   * @param command (undocumented)
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier (scala.collection.Seq<java.lang.String> multipart, java.lang.String command, org.antlr.v4.runtime.ParserRuleContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableAddPartitionCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table ADD [IF NOT EXISTS] PARTITION spec [LOCATION 'loc1']
   *   ALTER VIEW view ADD [IF NOT EXISTS] PARTITION spec
   * </code></pre>
   * <p>
   * ALTER VIEW ... ADD PARTITION ... is not supported because the concept of partitioning
   * is associated with physical tables
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitAddTablePartition (org.apache.spark.sql.catalyst.parser.SqlBaseParser.AddTablePartitionContext ctx)  { throw new RuntimeException(); }
  /**
   * Alter the query of a view. This creates a {@link AlterViewAsCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER VIEW [db_name.]view_name AS SELECT ...;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitAlterViewQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.AlterViewQueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link AlterTableChangeColumnCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table [PARTITION partition_spec]
   *   CHANGE [COLUMN] column_old_name column_new_name column_dataType [COMMENT column_comment]
   *   [FIRST | AFTER column_name];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitChangeColumn (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ChangeColumnContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ClearCacheCommand} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitClearCache (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ClearCacheContext ctx)  { throw new RuntimeException(); }
  /**
   * Convert a constants list into a String sequence.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> visitConstantList (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ConstantListContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CatalogStorageFormat} for creating tables.
   * <p>
   * Format: STORED AS ...
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitCreateFileFormat (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFileFormatContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CreateFunctionCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   CREATE [OR REPLACE] [TEMPORARY] FUNCTION [IF NOT EXISTS] [db_name.]function_name
   *   AS class_name [USING JAR|FILE|ARCHIVE 'file_uri' [, JAR|FILE|ARCHIVE 'file_uri'};
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateFunction (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFunctionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a Hive serde table, returning a {@link CreateTable} logical plan.
   * <p>
   * This is a legacy syntax for Hive compatibility, we recommend users to use the Spark SQL
   * CREATE TABLE syntax to create Hive serde table, e.g. "CREATE TABLE ... USING hive ..."
   * <p>
   * Note: several features are currently not supported - temporary tables, bucketing,
   * skewed columns and storage handlers (STORED BY).
   * <p>
   * Expected format:
   * <pre><code>
   *   CREATE [EXTERNAL] TABLE [IF NOT EXISTS] [db_name.]table_name
   *   [(col1[:] data_type [COMMENT col_comment], ...)]
   *   create_table_clauses
   *   [AS select_statement];
   *
   *   create_table_clauses (order insensitive):
   *     [COMMENT table_comment]
   *     [PARTITIONED BY (col2[:] data_type [COMMENT col_comment], ...)]
   *     [ROW FORMAT row_format]
   *     [STORED AS file_format]
   *     [LOCATION path]
   *     [TBLPROPERTIES (property_name=property_value, ...)]
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateHiveTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateHiveTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a table, returning a {@link CreateTable} logical plan.
   * <p>
   * This is used to produce CreateTempViewUsing from CREATE TEMPORARY TABLE.
   * <p>
   * TODO: Remove this. It is used because CreateTempViewUsing is not a Catalyst plan.
   * Either move CreateTempViewUsing into catalyst as a parsed logical plan, or remove it because
   * it is deprecated.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CreateTableLikeCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   CREATE TABLE [IF NOT EXISTS] [db_name.]table_name
   *   LIKE [other_db_name.]existing_table_name [locationSpec]
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateTableLike (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTableLikeContext ctx)  { throw new RuntimeException(); }
  /**
   * Creates a {@link CreateTempViewUsing} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateTempViewUsing (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTempViewUsingContext ctx)  { throw new RuntimeException(); }
  /**
   * Create or replace a view. This creates a {@link CreateViewCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   CREATE [OR REPLACE] {&#64;link GLOBAL] TEMPORARY] VIEW [IF NOT EXISTS] [db_name.]view_name
   *   [(column_name [COMMENT column_comment], ...) ]
   *   create_view_clauses
   *
   *   AS SELECT ...;
   *
   *   create_view_clauses (order insensitive):
   *     [COMMENT view_comment]
   *     [TBLPROPERTIES (property_name = property_value, ...)]
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateView (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateViewContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link DescribeDatabaseCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   DESCRIBE DATABASE [EXTENDED] database;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDescribeDatabase (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DescribeDatabaseContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a plan for a DESCRIBE FUNCTION command.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDescribeFunction (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DescribeFunctionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link DescribeQueryCommand} logical command.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDescribeQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DescribeQueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link DropFunctionCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   DROP [TEMPORARY] FUNCTION [IF EXISTS] function;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDropFunction (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DropFunctionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link ExplainCommand} logical plan.
   * The syntax of using this command in SQL is:
   * <pre><code>
   *   EXPLAIN (EXTENDED | CODEGEN | COST | FORMATTED) SELECT * FROM ...
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitExplain (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ExplainContext ctx)  { throw new RuntimeException(); }
  /**
   * Fail an unsupported Hive native command.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitFailNativeCommand (org.apache.spark.sql.catalyst.parser.SqlBaseParser.FailNativeCommandContext ctx)  { throw new RuntimeException(); }
  /**
   * Resolve a {@link HiveSerDe} based on the name given and return it as a {@link CatalogStorageFormat}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitGenericFileFormat (org.apache.spark.sql.catalyst.parser.SqlBaseParser.GenericFileFormatContext ctx)  { throw new RuntimeException(); }
  /**
   * Return the parameters for {@link InsertIntoDir} logical plan.
   * <p>
   * Expected format:
   * <pre><code>
   *   INSERT OVERWRITE DIRECTORY
   *   [path]
   *   [OPTIONS table_property_list]
   *   select_statement;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple3<java.lang.Object, org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat, scala.Option<java.lang.String>> visitInsertOverwriteDir (org.apache.spark.sql.catalyst.parser.SqlBaseParser.InsertOverwriteDirContext ctx)  { throw new RuntimeException(); }
  /**
   * Return the parameters for {@link InsertIntoDir} logical plan.
   * <p>
   * Expected format:
   * <pre><code>
   *   INSERT OVERWRITE [LOCAL] DIRECTORY
   *   path
   *   [ROW FORMAT row_format]
   *   [STORED AS file_format]
   *   select_statement;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple3<java.lang.Object, org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat, scala.Option<java.lang.String>> visitInsertOverwriteHiveDir (org.apache.spark.sql.catalyst.parser.SqlBaseParser.InsertOverwriteHiveDirContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link AddFileCommand}, {@link AddJarCommand}, {@link ListFilesCommand} or {@link ListJarsCommand}
   * command depending on the requested operation on resources.
   * Expected format:
   * <pre><code>
   *   ADD (FILE[S] &lt;filepath ...&gt; | JAR[S] &lt;jarpath ...&gt;)
   *   LIST (FILE[S] [filepath ...] | JAR[S] [jarpath ...])
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitManageResource (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ManageResourceContext ctx)  { throw new RuntimeException(); }
  /**
   * Convert a nested constants list into a sequence of string sequences.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<java.lang.String>> visitNestedConstantList (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NestedConstantListContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link RefreshResource} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRefreshResource (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RefreshResourceContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link AlterTableRenameCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table1 RENAME TO table2;
   *   ALTER VIEW view1 RENAME TO view2;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRenameTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RenameTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ResetCommand} logical plan.
   * Example SQL :
   * <pre><code>
   *   RESET;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitResetConfiguration (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ResetConfigurationContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a delimited row format properties object.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitRowFormatDelimited (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatDelimitedContext ctx)  { throw new RuntimeException(); }
  /**
   * Create SERDE row format name and properties pair.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitRowFormatSerde (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatSerdeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link SetCommand} logical plan.
   * <p>
   * Note that we assume that everything after the SET keyword is assumed to be a part of the
   * key-value pair. The split between key and value is made by searching for the first <code>=</code>
   * character in the raw string.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetConfiguration (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetConfigurationContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterDatabaseSetLocationCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER (DATABASE|SCHEMA) database SET LOCATION path;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetDatabaseLocation (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetDatabaseLocationContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterDatabasePropertiesCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER (DATABASE|SCHEMA) database SET DBPROPERTIES (property_name=property_value, ...);
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetDatabaseProperties (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetDatabasePropertiesContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableSerDePropertiesCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table [PARTITION spec] SET SERDE serde_name [WITH SERDEPROPERTIES props];
   *   ALTER TABLE table [PARTITION spec] SET SERDEPROPERTIES serde_properties;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetTableSerDe (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetTableSerDeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a plan for a SHOW FUNCTIONS command.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowFunctions (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowFunctionsContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ShowTablesCommand} logical plan.
   * Example SQL :
   * <pre><code>
   *   SHOW TABLE EXTENDED [(IN|FROM) database_name] LIKE 'identifier_with_wildcards'
   *   [PARTITION(partition_spec)];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowTableContext ctx)  { throw new RuntimeException(); }
  /**
   * A command for users to list the properties for a table. If propertyKey is specified, the value
   * for the propertyKey is returned. If propertyKey is not specified, all the keys and their
   * corresponding values are returned.
   * The syntax of using this command in SQL is:
   * <pre><code>
   *   SHOW TBLPROPERTIES table_name[('propertyKey')];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowTblProperties (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowTblPropertiesContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CatalogStorageFormat}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitTableFileFormat (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TableFileFormatContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a clause for DISTRIBUTE BY.
   * @param ctx (undocumented)
   * @param expressions (undocumented)
   * @param query (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withRepartitionByExpression (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QueryOrganizationContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  /**
   * Create a {@link ScriptInputOutputSchema}.
   * @param ctx (undocumented)
   * @param inRowFormat (undocumented)
   * @param recordWriter (undocumented)
   * @param outRowFormat (undocumented)
   * @param recordReader (undocumented)
   * @param schemaLess (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.plans.logical.ScriptInputOutputSchema withScriptIOSchema (org.antlr.v4.runtime.ParserRuleContext ctx, org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatContext inRowFormat, org.antlr.v4.runtime.Token recordWriter, org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatContext outRowFormat, org.antlr.v4.runtime.Token recordReader, boolean schemaLess)  { throw new RuntimeException(); }
}
