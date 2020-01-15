package org.apache.spark.sql.execution.datasources;
public  class DataSourceStrategy$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataSourceStrategy$ MODULE$ = null;
  public   DataSourceStrategy$ ()  { throw new RuntimeException(); }
  /**
   * The attribute name of predicate could be different than the one in schema in case of
   * case insensitive, we should change them to match the one in schema, so we do not need to
   * worry about case sensitivity anymore.
   * @param filters (undocumented)
   * @param attributes (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> normalizeFilters (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attributes)  { throw new RuntimeException(); }
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   * @param predicate (undocumented)
   */
  protected  scala.Option<org.apache.spark.sql.sources.Filter> translateFilter (org.apache.spark.sql.catalyst.expressions.Expression predicate)  { throw new RuntimeException(); }
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @param predicate The input {@link Expression} to be translated as {@link Filter}
   * @param translatedFilterToExpr An optional map from leaf node filter expressions to its
   *                               translated {@link Filter}. The map is used for rebuilding
   *                               {@link Expression} from {@link Filter}.
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   */
  protected  scala.Option<org.apache.spark.sql.sources.Filter> translateFilterWithMapping (org.apache.spark.sql.catalyst.expressions.Expression predicate, scala.Option<scala.collection.mutable.HashMap<org.apache.spark.sql.sources.Filter, org.apache.spark.sql.catalyst.expressions.Expression>> translatedFilterToExpr)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.Expression rebuildExpressionFromFilter (org.apache.spark.sql.sources.Filter filter, scala.collection.mutable.HashMap<org.apache.spark.sql.sources.Filter, org.apache.spark.sql.catalyst.expressions.Expression> translatedFilterToExpr)  { throw new RuntimeException(); }
  /**
   * Selects Catalyst predicate {@link Expression}s which are convertible into data source {@link Filter}s
   * and can be handled by <code>relation</code>.
   * <p>
   * @return A triplet of <code>Seq[Expression]</code>, <code>Seq[Filter]</code>, and <code>Seq[Filter]</code> . The first element
   *         contains all Catalyst predicate {@link Expression}s that are either not convertible or
   *         cannot be handled by <code>relation</code>. The second element contains all converted data source
   *         {@link Filter}s that will be pushed down to the data source. The third element contains
   *         all {@link Filter}s that are completely filtered at the DataSource.
   * @param relation (undocumented)
   * @param predicates (undocumented)
   */
  protected  scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.sources.Filter>, scala.collection.immutable.Set<org.apache.spark.sql.sources.Filter>> selectFilters (org.apache.spark.sql.sources.BaseRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates)  { throw new RuntimeException(); }
}
