package org.apache.spark.storage;
/**
 * An iterator that fetches multiple blocks. For local blocks, it fetches from the local block
 * manager. For remote blocks, it fetches them using the provided BlockTransferService.
 * <p>
 * This creates an iterator of (BlockID, InputStream) tuples so the caller can handle blocks
 * in a pipelined fashion as they are received.
 * <p>
 * The implementation throttles the remote fetches so they don't exceed maxBytesInFlight to avoid
 * using too much memory.
 * <p>
 * param:  context {@link TaskContext}, used for metrics update
 * param:  shuffleClient {@link BlockStoreClient} for fetching remote blocks
 * param:  blockManager {@link BlockManager} for reading local blocks
 * param:  blocksByAddress list of blocks to fetch grouped by the {@link BlockManagerId}.
 *                        For each block we also require two info: 1. the size (in bytes as a long
 *                        field) in order to throttle the memory usage; 2. the mapIndex for this
 *                        block, which indicate the index in the map stage.
 *                        Note that zero-sized blocks are already excluded, which happened in
 *                        {@link org.apache.spark.MapOutputTracker.convertMapStatuses}.
 * param:  streamWrapper A function to wrap the returned input stream.
 * param:  maxBytesInFlight max size (in bytes) of remote blocks to fetch at any given point.
 * param:  maxReqsInFlight max number of remote requests to fetch blocks at any given point.
 * param:  maxBlocksInFlightPerAddress max number of shuffle blocks being fetched at any given point
 *                                    for a given remote host:port.
 * param:  maxReqSizeShuffleToMem max size (in bytes) of a request that can be shuffled to memory.
 * param:  detectCorrupt whether to detect any corruption in fetched blocks.
 * param:  shuffleMetrics used to report shuffle metrics.
 * param:  doBatchFetch fetch continuous shuffle blocks from same executor in batch if the server
 *                     side supports.
 */
 final class ShuffleBlockFetcherIterator implements scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream>>, org.apache.spark.network.shuffle.DownloadFileManager, org.apache.spark.internal.Logging {
  /**
   * The block information to fetch used in FetchRequest.
   * param:  blockId block id
   * param:  size estimated size of the block. Note that this is NOT the exact bytes.
   *             Size of remote block is used to calculate bytesInFlight.
   * param:  mapIndex the mapIndex for this block, which indicate the index in the map stage.
   */
  static   class FetchBlockInfo implements scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
    public  int mapIndex ()  { throw new RuntimeException(); }
    // not preceding
    public   FetchBlockInfo (org.apache.spark.storage.BlockId blockId, long size, int mapIndex)  { throw new RuntimeException(); }
  }
  static public  class FetchBlockInfo$ extends scala.runtime.AbstractFunction3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object, org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FetchBlockInfo$ MODULE$ = null;
    public   FetchBlockInfo$ ()  { throw new RuntimeException(); }
  }
  /**
   * A request to fetch blocks from a remote BlockManager.
   * param:  address remote BlockManager to fetch from.
   * param:  blocks Sequence of the information for blocks to fetch from the same address.
   */
  static public  class FetchRequest implements scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> blocks ()  { throw new RuntimeException(); }
    // not preceding
    public   FetchRequest (org.apache.spark.storage.BlockManagerId address, scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> blocks)  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
  }
  static public  class FetchRequest$ extends scala.runtime.AbstractFunction2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo>, org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FetchRequest$ MODULE$ = null;
    public   FetchRequest$ ()  { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block successfully.
   * param:  blockId block id
   * param:  mapIndex the mapIndex for this block, which indicate the index in the map stage.
   * param:  address BlockManager that the block was fetched from.
   * param:  size estimated size of the block. Note that this is NOT the exact bytes.
   *             Size of remote block is used to calculate bytesInFlight.
   * param:  buf <code>ManagedBuffer</code> for the content.
   * param:  isNetworkReqDone Is this the last network request for this host in this fetch request.
   */
  static   class SuccessFetchResult implements org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchResult, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  int mapIndex ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
    public  org.apache.spark.network.buffer.ManagedBuffer buf ()  { throw new RuntimeException(); }
    public  boolean isNetworkReqDone ()  { throw new RuntimeException(); }
    // not preceding
    public   SuccessFetchResult (org.apache.spark.storage.BlockId blockId, int mapIndex, org.apache.spark.storage.BlockManagerId address, long size, org.apache.spark.network.buffer.ManagedBuffer buf, boolean isNetworkReqDone)  { throw new RuntimeException(); }
  }
  static public  class SuccessFetchResult$ extends scala.runtime.AbstractFunction6<org.apache.spark.storage.BlockId, java.lang.Object, org.apache.spark.storage.BlockManagerId, java.lang.Object, org.apache.spark.network.buffer.ManagedBuffer, java.lang.Object, org.apache.spark.storage.ShuffleBlockFetcherIterator.SuccessFetchResult> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SuccessFetchResult$ MODULE$ = null;
    public   SuccessFetchResult$ ()  { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block unsuccessfully.
   * param:  blockId block id
   * param:  mapIndex the mapIndex for this block, which indicate the index in the map stage
   * param:  address BlockManager that the block was attempted to be fetched from
   * param:  e the failure exception
   */
  static   class FailureFetchResult implements org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchResult, scala.Product, scala.Serializable {
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  int mapIndex ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  java.lang.Throwable e ()  { throw new RuntimeException(); }
    // not preceding
    public   FailureFetchResult (org.apache.spark.storage.BlockId blockId, int mapIndex, org.apache.spark.storage.BlockManagerId address, java.lang.Throwable e)  { throw new RuntimeException(); }
  }
  static public  class FailureFetchResult$ extends scala.runtime.AbstractFunction4<org.apache.spark.storage.BlockId, java.lang.Object, org.apache.spark.storage.BlockManagerId, java.lang.Throwable, org.apache.spark.storage.ShuffleBlockFetcherIterator.FailureFetchResult> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FailureFetchResult$ MODULE$ = null;
    public   FailureFetchResult$ ()  { throw new RuntimeException(); }
  }
  /**
   * Result of a fetch from a remote block.
   */
  static public  interface FetchResult {
    public  org.apache.spark.storage.BlockManagerId address ()  ;
    public  org.apache.spark.storage.BlockId blockId ()  ;
  }
  public   ShuffleBlockFetcherIterator (org.apache.spark.TaskContext context, org.apache.spark.network.shuffle.BlockStoreClient shuffleClient, org.apache.spark.storage.BlockManager blockManager, scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> blocksByAddress, scala.Function2<org.apache.spark.storage.BlockId, java.io.InputStream, java.io.InputStream> streamWrapper, long maxBytesInFlight, int maxReqsInFlight, int maxBlocksInFlightPerAddress, long maxReqSizeShuffleToMem, boolean detectCorrupt, boolean detectCorruptUseExtraMemory, org.apache.spark.shuffle.ShuffleReadMetricsReporter shuffleMetrics, boolean doBatchFetch)  { throw new RuntimeException(); }
    void releaseCurrentResultBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.shuffle.DownloadFile createTempFile (org.apache.spark.network.util.TransportConf transportConf)  { throw new RuntimeException(); }
  public  boolean registerTempFileToClean (org.apache.spark.network.shuffle.DownloadFile file)  { throw new RuntimeException(); }
  /**
   * Mark the iterator as zombie, and release all buffers that haven't been deserialized yet.
   */
    void cleanup ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  /**
   * Fetches the next (BlockId, InputStream). If a task fails, the ManagedBuffers
   * underlying each InputStream will be freed by the cleanup() method registered with the
   * TaskCompletionListener. However, callers should close() these InputStreams
   * as soon as they are no longer needed, in order to release memory as early as possible.
   * <p>
   * Throws a FetchFailedException if the next block could not be fetched.
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream> next ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream>> toCompletionIterator ()  { throw new RuntimeException(); }
    scala.runtime.Nothing$ throwFetchFailedException (org.apache.spark.storage.BlockId blockId, int mapIndex, org.apache.spark.storage.BlockManagerId address, java.lang.Throwable e)  { throw new RuntimeException(); }
}
