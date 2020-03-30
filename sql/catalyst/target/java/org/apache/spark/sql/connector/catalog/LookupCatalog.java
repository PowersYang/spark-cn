package org.apache.spark.sql.connector.catalog;
/**
 * A trait to encapsulate catalog lookup function and helpful extractors.
 */
public  interface LookupCatalog extends org.apache.spark.internal.Logging {
  /**
   * Extract catalog and identifier from a multi-part identifier with the current catalog if needed.
   */
  public  class CatalogObjectIdentifier {
    static public  scala.Some<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, org.apache.spark.sql.connector.catalog.Identifier>> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  /**
   * Extract catalog and identifier from a multi-part identifier with the current catalog if needed.
   */
  public  class CatalogObjectIdentifier$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CatalogObjectIdentifier$ MODULE$ = null;
    public   CatalogObjectIdentifier$ ()  { throw new RuntimeException(); }
    public  scala.Some<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, org.apache.spark.sql.connector.catalog.Identifier>> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  /**
   * Extract catalog and namespace from a multi-part identifier with the current catalog if needed.
   * Catalog name takes precedence over namespaces.
   */
  public  class CatalogAndNamespace {
    static public  scala.Some<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.Option<scala.collection.Seq<java.lang.String>>>> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  /**
   * Extract catalog and namespace from a multi-part identifier with the current catalog if needed.
   * Catalog name takes precedence over namespaces.
   */
  public  class CatalogAndNamespace$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CatalogAndNamespace$ MODULE$ = null;
    public   CatalogAndNamespace$ ()  { throw new RuntimeException(); }
    public  scala.Some<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.Option<scala.collection.Seq<java.lang.String>>>> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  /**
   * Extract legacy table identifier from a multi-part identifier.
   * <p>
   * For legacy support only. Please use {@link CatalogObjectIdentifier} instead on DSv2 code paths.
   */
  public  class AsTableIdentifier {
    static public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  /**
   * Extract legacy table identifier from a multi-part identifier.
   * <p>
   * For legacy support only. Please use {@link CatalogObjectIdentifier} instead on DSv2 code paths.
   */
  public  class AsTableIdentifier$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AsTableIdentifier$ MODULE$ = null;
    public   AsTableIdentifier$ ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  /**
   * For temp views, extract a table identifier from a multi-part identifier if it has no catalog.
   */
  public  class AsTemporaryViewIdentifier {
    static public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  /**
   * For temp views, extract a table identifier from a multi-part identifier if it has no catalog.
   */
  public  class AsTemporaryViewIdentifier$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AsTemporaryViewIdentifier$ MODULE$ = null;
    public   AsTemporaryViewIdentifier$ ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  /**
   * Extract catalog and the rest name parts from a multi-part identifier.
   */
  public  class CatalogAndIdentifierParts {
    static public  scala.Some<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  /**
   * Extract catalog and the rest name parts from a multi-part identifier.
   */
  public  class CatalogAndIdentifierParts$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CatalogAndIdentifierParts$ MODULE$ = null;
    public   CatalogAndIdentifierParts$ ()  { throw new RuntimeException(); }
    public  scala.Some<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.AsTableIdentifier$ AsTableIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.AsTemporaryViewIdentifier$ AsTemporaryViewIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndIdentifier$ CatalogAndIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndIdentifierParts$ CatalogAndIdentifierParts ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndNamespace$ CatalogAndNamespace ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogObjectIdentifier$ CatalogObjectIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.CatalogManager catalogManager ()  ;
  /**
   * Returns the current catalog set.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.catalog.CatalogPlugin currentCatalog ()  ;
}
