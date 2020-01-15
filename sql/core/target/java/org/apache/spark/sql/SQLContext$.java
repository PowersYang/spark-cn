package org.apache.spark.sql;
/**
 * This SQLContext object contains utility functions to create a singleton SQLContext instance,
 * or to get the created SQLContext instance.
 * <p>
 * It also provides utility functions to support preference for threads in multiple sessions
 * scenario, setActive could set a SQLContext for current thread, which will be returned by
 * getOrCreate instead of the global one.
 */
public  class SQLContext$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SQLContext$ MODULE$ = null;
  public   SQLContext$ ()  { throw new RuntimeException(); }
  /**
   * Converts an iterator of Java Beans to InternalRow using the provided
   * bean info &amp; schema. This is not related to the singleton, but is a static
   * method for internal use.
   * @param data (undocumented)
   * @param beanClass (undocumented)
   * @param attrs (undocumented)
   * @return (undocumented)
   */
    scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> beansToRows (scala.collection.Iterator<?> data, java.lang.Class<?> beanClass, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attrs)  { throw new RuntimeException(); }
  /**
   * Extract <code>spark.sql.*</code> properties from the conf and return them as a {@link Properties}.
   * @param sparkConf (undocumented)
   * @return (undocumented)
   */
    java.util.Properties getSQLProperties (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
}
