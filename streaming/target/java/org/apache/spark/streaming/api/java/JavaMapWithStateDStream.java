package org.apache.spark.streaming.api.java;
/**
 * DStream representing the stream of data generated by <code>mapWithState</code> operation on a
 * {@link JavaPairDStream}. Additionally, it also gives access to the
 * stream of state snapshots, that is, the state data of all keys after a batch has updated them.
 * <p>
 * @param <KeyType>  Class of the keys
 * @param <ValueType>  Class of the values
 * @param <StateType>  Class of the state data
 * @param <MappedType>  Class of the mapped data
 */
public  class JavaMapWithStateDStream<KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> extends org.apache.spark.streaming.api.java.JavaDStream<MappedType> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
     JavaMapWithStateDStream (org.apache.spark.streaming.dstream.MapWithStateDStream<KeyType, ValueType, StateType, MappedType> dstream)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaPairDStream<KeyType, StateType> stateSnapshots ()  { throw new RuntimeException(); }
}
