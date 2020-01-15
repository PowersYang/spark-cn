package org.apache.spark.sql.execution.streaming.state;
/**
 * Helper class to manage state required by a single side of {@link StreamingSymmetricHashJoinExec}.
 * The interface of this class is basically that of a multi-map:
 * - Get: Returns an iterator of multiple values for given key
 * - Append: Append a new value to the given key
 * - Remove Data by predicate: Drop any state using a predicate condition on keys or values
 * <p>
 * param:  joinSide              Defines the join side
 * param:  inputValueAttributes  Attributes of the input row which will be stored as value
 * param:  joinKeys              Expressions to generate rows that will be used to key the value rows
 * param:  stateInfo             Information about how to retrieve the correct version of state
 * param:  storeConf             Configuration for the state store.
 * param:  hadoopConf            Hadoop configuration for reading state data from storage
 * <p>
 * Internally, the key -> multiple values is stored in two {@link StateStore}s.
 * - Store 1 ({@link KeyToNumValuesStore}) maintains mapping between key -> number of values
 * - Store 2 ({@link KeyWithIndexToValueStore}) maintains mapping between (key, index) -> value
 * - Put:   update count in KeyToNumValuesStore,
 *          insert new (key, count) -> value in KeyWithIndexToValueStore
 * - Get:   read count from KeyToNumValuesStore,
 *          read each of the n values in KeyWithIndexToValueStore
 * - Remove state by predicate on keys:
 *          scan all keys in KeyToNumValuesStore to find keys that do match the predicate,
 *          delete from key from KeyToNumValuesStore, delete values in KeyWithIndexToValueStore
 * - Remove state by condition on values:
 *          scan all [(key, index) -> value] in KeyWithIndexToValueStore to find values that match
 *          the predicate, delete corresponding (key, indexToDelete) from KeyWithIndexToValueStore
 *          by overwriting with the value of (key, maxIndex), and removing [(key, maxIndex),
 *          decrement corresponding num values in KeyToNumValuesStore
 */
public  class SymmetricHashJoinStateManager implements org.apache.spark.internal.Logging {
  static public  interface StateStoreType {
  }
  static public  scala.collection.Seq<java.lang.String> allStateStoreNames (scala.collection.Seq<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide> joinSides)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide joinSide ()  { throw new RuntimeException(); }
  // not preceding
  public   SymmetricHashJoinStateManager (org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide joinSide, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputValueAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> joinKeys, scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /** Get all the values of a key */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  /** Append a new value to the key */
  public  void append (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
  /**
   * Remove using a predicate on keys.
   * <p>
   * This produces an iterator over the (key, value) pairs satisfying condition(key), where the
   * underlying store is updated as a side-effect of producing next.
   * <p>
   * This implies the iterator must be consumed fully without any other operations on this manager
   * or the underlying store being interleaved.
   * @param removalCondition (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> removeByKeyCondition (scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> removalCondition)  { throw new RuntimeException(); }
  /**
   * Remove using a predicate on values.
   * <p>
   * At a high level, this produces an iterator over the (key, value) pairs such that value
   * satisfies the predicate, where producing an element removes the value from the state store
   * and producing all elements with a given key updates it accordingly.
   * <p>
   * This implies the iterator must be consumed fully without any other operations on this manager
   * or the underlying store being interleaved.
   * @param removalCondition (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> removeByValueCondition (scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> removalCondition)  { throw new RuntimeException(); }
  /** Commit all the changes to all the state stores */
  public  void commit ()  { throw new RuntimeException(); }
  /** Abort any changes to the state stores if needed */
  public  void abortIfNeeded ()  { throw new RuntimeException(); }
  /** Get the combined metrics of all the state stores */
  public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  { throw new RuntimeException(); }
}
