package org.apache.spark.streaming.receiver;
/** Listener object for BlockGenerator events */
public  interface BlockGeneratorListener {
  /**
   * Called after a data item is added into the BlockGenerator. The data addition and this
   * callback are synchronized with the block generation and its associated callback,
   * so block generation waits for the active data addition+callback to complete. This is useful
   * for updating metadata on successful buffering of a data item, specifically that metadata
   * that will be useful when a block is generated. Any long blocking operation in this callback
   * will hurt the throughput.
   * @param data (undocumented)
   * @param metadata (undocumented)
   */
  public  void onAddData (Object data, Object metadata)  ;
  /**
   * Called when an error has occurred in the BlockGenerator. Can be called form many places
   * so better to not do any long block operation in this callback.
   * @param message (undocumented)
   * @param throwable (undocumented)
   */
  public  void onError (java.lang.String message, java.lang.Throwable throwable)  ;
  /**
   * Called when a new block of data is generated by the block generator. The block generation
   * and this callback are synchronized with the data addition and its associated callback, so
   * the data addition waits for the block generation+callback to complete. This is useful
   * for updating metadata when a block has been generated, specifically metadata that will
   * be useful when the block has been successfully stored. Any long blocking operation in this
   * callback will hurt the throughput.
   * @param blockId (undocumented)
   */
  public  void onGenerateBlock (org.apache.spark.storage.StreamBlockId blockId)  ;
  /**
   * Called when a new block is ready to be pushed. Callers are supposed to store the block into
   * Spark in this method. Internally this is called from a single
   * thread, that is not synchronized with any other callbacks. Hence it is okay to do long
   * blocking operation in this callback.
   * @param blockId (undocumented)
   * @param arrayBuffer (undocumented)
   */
  public  void onPushBlock (org.apache.spark.storage.StreamBlockId blockId, scala.collection.mutable.ArrayBuffer<?> arrayBuffer)  ;
}
