package org.apache.spark.storage;
/**
 * Creates and maintains the logical mapping between logical blocks and physical on-disk
 * locations. One block is mapped to one file with a name given by its BlockId.
 * <p>
 * Block files are hashed among the directories listed in spark.local.dir (or in
 * SPARK_LOCAL_DIRS, if it's set).
 */
  class DiskBlockManager implements org.apache.spark.internal.Logging {
  public   DiskBlockManager (org.apache.spark.SparkConf conf, boolean deleteFilesOnStop)  { throw new RuntimeException(); }
  /** Check if disk block manager has a block. */
  public  boolean containsBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /** Produces a unique block id and File suitable for storing local intermediate results. */
  public  scala.Tuple2<org.apache.spark.storage.TempLocalBlockId, java.io.File> createTempLocalBlock ()  { throw new RuntimeException(); }
  /** Produces a unique block id and File suitable for storing shuffled intermediate results. */
  public  scala.Tuple2<org.apache.spark.storage.TempShuffleBlockId, java.io.File> createTempShuffleBlock ()  { throw new RuntimeException(); }
  /** List all the blocks currently stored on disk by the disk manager. */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> getAllBlocks ()  { throw new RuntimeException(); }
  /** List all the files currently stored on disk by the disk manager. */
  public  scala.collection.Seq<java.io.File> getAllFiles ()  { throw new RuntimeException(); }
  /** Looks up a file by hashing it into one of our local subdirectories. */
  public  java.io.File getFile (java.lang.String filename)  { throw new RuntimeException(); }
  public  java.io.File getFile (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
    java.io.File[] localDirs ()  { throw new RuntimeException(); }
    java.lang.String[] localDirsString ()  { throw new RuntimeException(); }
  /** Cleanup local dirs and stop shuffle sender. */
    void stop ()  { throw new RuntimeException(); }
    int subDirsPerLocalDir ()  { throw new RuntimeException(); }
}
