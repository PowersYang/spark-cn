package org.apache.spark.internal.io;
/**
 * An {@link FileCommitProtocol} implementation backed by an underlying Hadoop OutputCommitter
 * (from the newer mapreduce API, not the old mapred API).
 * <p>
 * Unlike Hadoop's OutputCommitter, this implementation is serializable.
 * <p>
 * param:  jobId the job's or stage's id
 * param:  path the job's output path, or null if committer acts as a noop
 * param:  dynamicPartitionOverwrite If true, Spark will overwrite partition directories at runtime
 *                                  dynamically, i.e., we first write files under a staging
 *                                  directory with partition path, e.g.
 *                                  /path/to/staging/a=1/b=1/xxx.parquet. When committing the job,
 *                                  we first clean up the corresponding partition directories at
 *                                  destination path, e.g. /path/to/destination/a=1/b=1, and move
 *                                  files from staging directory to the corresponding partition
 *                                  directories under destination path.
 */
public  class HadoopMapReduceCommitProtocol extends org.apache.spark.internal.io.FileCommitProtocol implements scala.Serializable, org.apache.spark.internal.Logging {
  public   HadoopMapReduceCommitProtocol (java.lang.String jobId, java.lang.String path, boolean dynamicPartitionOverwrite)  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.OutputCommitter setupCommitter (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, java.lang.String ext)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, java.lang.String ext)  { throw new RuntimeException(); }
  protected  java.lang.String getFilename (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String ext)  { throw new RuntimeException(); }
  public  void setupJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext jobContext, scala.collection.Seq<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage> taskCommits)  { throw new RuntimeException(); }
  /**
   * Abort the job; log and ignore any IO exception thrown.
   * This is invariably invoked in an exception handler; raising
   * an exception here will lose the root cause of the failure.
   * <p>
   * @param jobContext job context
   */
  public  void abortJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  /**
   * Abort the task; log and ignore any failure thrown.
   * This is invariably invoked in an exception handler; raising
   * an exception here will lose the root cause of the failure.
   * <p>
   * @param taskContext context
   */
  public  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
}
