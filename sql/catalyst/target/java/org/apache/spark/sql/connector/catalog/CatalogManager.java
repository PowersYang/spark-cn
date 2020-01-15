package org.apache.spark.sql.connector.catalog;
/**
 * A thread-safe manager for {@link CatalogPlugin}s. It tracks all the registered catalogs, and allow
 * the caller to look up a catalog by name.
 * <p>
 * There are still many commands (e.g. ANALYZE TABLE) that do not support v2 catalog API. They
 * ignore the current catalog and blindly go to the v1 <code>SessionCatalog</code>. To avoid tracking current
 * namespace in both <code>SessionCatalog</code> and <code>CatalogManger</code>, we let <code>CatalogManager</code> to set/get
 * current database of <code>SessionCatalog</code> when the current catalog is the session catalog.
 */
  class CatalogManager implements org.apache.spark.internal.Logging {
  static public  java.lang.String SESSION_CATALOG_NAME ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog v1SessionCatalog ()  { throw new RuntimeException(); }
  // not preceding
  public   CatalogManager (org.apache.spark.sql.internal.SQLConf conf, org.apache.spark.sql.connector.catalog.CatalogPlugin defaultSessionCatalog, org.apache.spark.sql.catalyst.catalog.SessionCatalog v1SessionCatalog)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.CatalogPlugin catalog (java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.String[] currentNamespace ()  { throw new RuntimeException(); }
  public  void setCurrentNamespace (java.lang.String[] namespace)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.CatalogPlugin currentCatalog ()  { throw new RuntimeException(); }
  public  void setCurrentCatalog (java.lang.String catalogName)  { throw new RuntimeException(); }
    void reset ()  { throw new RuntimeException(); }
}
