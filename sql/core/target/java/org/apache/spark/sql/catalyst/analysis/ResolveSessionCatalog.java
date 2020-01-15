package org.apache.spark.sql.catalyst.analysis;
/**
 * Resolves catalogs from the multi-part identifiers in SQL statements, and convert the statements
 * to the corresponding v1 or v2 commands if the resolved catalog is the session catalog.
 * <p>
 * We can remove this rule once we implement all the catalog functionality in <code>V2SessionCatalog</code>.
 */
public  class ResolveSessionCatalog extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.connector.catalog.LookupCatalog {
  public  class SessionCatalog {
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  public  class SessionCatalog$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SessionCatalog$ MODULE$ = null;
    public   SessionCatalog$ ()  { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.AsTableIdentifier$ AsTableIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.AsTemporaryViewIdentifier$ AsTemporaryViewIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndIdentifierParts$ CatalogAndIdentifierParts ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndNamespace$ CatalogAndNamespace ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogObjectIdentifier$ CatalogObjectIdentifier ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolveSessionCatalog (org.apache.spark.sql.connector.catalog.CatalogManager catalogManager, org.apache.spark.sql.internal.SQLConf conf, scala.Function1<scala.collection.Seq<java.lang.String>, java.lang.Object> isView)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.ResolveSessionCatalog.SessionCatalog$ SessionCatalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.CatalogManager catalogManager ()  { throw new RuntimeException(); }
}
