package org.apache.spark.deploy;
public  class StandaloneResourceUtils {
  /**
   * A mutable resource information which provides more efficient modification on addresses.
   */
  static   class MutableResourceInfo implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashSet<java.lang.String> addresses ()  { throw new RuntimeException(); }
    // not preceding
    public   MutableResourceInfo (java.lang.String name, scala.collection.mutable.HashSet<java.lang.String> addresses)  { throw new RuntimeException(); }
    public  org.apache.spark.resource.ResourceInformation toResourceInformation ()  { throw new RuntimeException(); }
  }
  static public  class MutableResourceInfo$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.collection.mutable.HashSet<java.lang.String>, org.apache.spark.deploy.StandaloneResourceUtils.MutableResourceInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MutableResourceInfo$ MODULE$ = null;
    public   MutableResourceInfo$ ()  { throw new RuntimeException(); }
  }
  /**
   * Resource allocation used in Standalone only, which tracks assignments with
   * worker/driver(client only) pid.
   */
  static public  class StandaloneResourceAllocation implements scala.Product, scala.Serializable {
    public  int pid ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.resource.ResourceAllocation> allocations ()  { throw new RuntimeException(); }
    // not preceding
    public   StandaloneResourceAllocation (int pid, scala.collection.Seq<org.apache.spark.resource.ResourceAllocation> allocations)  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> toResourceInformationMap ()  { throw new RuntimeException(); }
  }
  static public  class StandaloneResourceAllocation$ extends scala.runtime.AbstractFunction2<java.lang.Object, scala.collection.Seq<org.apache.spark.resource.ResourceAllocation>, org.apache.spark.deploy.StandaloneResourceUtils.StandaloneResourceAllocation> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StandaloneResourceAllocation$ MODULE$ = null;
    public   StandaloneResourceAllocation$ ()  { throw new RuntimeException(); }
  }
  static public  java.lang.String SPARK_RESOURCES_COORDINATE_DIR ()  { throw new RuntimeException(); }
  static public  java.lang.String ALLOCATED_RESOURCES_FILE ()  { throw new RuntimeException(); }
  static public  java.lang.String RESOURCES_LOCK_FILE ()  { throw new RuntimeException(); }
  /**
   * Assigns (if coordinate needed) resources to workers/drivers from the same host to avoid
   * address conflict.
   * <p>
   * This function works in three steps. First, acquiring the lock on RESOURCES_LOCK_FILE
   * to achieve synchronization among workers and drivers. Second, getting all allocated
   * resources from ALLOCATED_RESOURCES_FILE and assigning isolated resources to the worker
   * or driver after differentiating available resources in discovered resources from
   * allocated resources. If available resources don't meet worker's or driver's requirement,
   * try to update allocated resources by excluding the resource allocation if its related
   * process has already terminated and do the assignment again. If still don't meet requirement,
   * exception should be thrown. Third, updating ALLOCATED_RESOURCES_FILE with new allocated
   * resources along with pid for the worker or driver. Then, return allocated resources
   * information after releasing the lock.
   * <p>
   * @param conf SparkConf
   * @param componentName spark.driver / spark.worker
   * @param resources the resources found by worker/driver on the host
   * @param pid the process id of worker/driver to acquire resources.
   * @return allocated resources for the worker/driver or throws exception if can't
   *         meet worker/driver's requirement
   */
  static public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> acquireResources (org.apache.spark.SparkConf conf, java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, int pid)  { throw new RuntimeException(); }
  /**
   * Frees (if coordinate needed) all the resources a worker/driver (pid) has in one shot
   * to make those resources be available for other workers/drivers on the same host.
   * @param conf SparkConf
   * @param componentName spark.driver / spark.worker
   * @param toRelease the resources expected to release
   * @param pid the process id of worker/driver to release resources.
   */
  static public  void releaseResources (org.apache.spark.SparkConf conf, java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> toRelease, int pid)  { throw new RuntimeException(); }
  /**
   * Save the allocated resources of driver(cluster only) or executor into a JSON formatted
   * resources file. Used in Standalone only.
   * @param componentName spark.driver / spark.executor
   * @param resources allocated resources for driver(cluster only) or executor
   * @param dir the target directory used to place the resources file
   * @return None if resources is empty or Some(file) which represents the resources file
   */
  static public  scala.Option<java.io.File> prepareResourcesFile (java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, java.io.File dir)  { throw new RuntimeException(); }
  /** Whether needs to coordinate resources among workers and drivers for user */
  static public  boolean needCoordinate (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.StandaloneResourceUtils.MutableResourceInfo> toMutable (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> immutableResources)  { throw new RuntimeException(); }
  static public  java.lang.String formatResourcesDetails (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> usedInfo, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> freeInfo)  { throw new RuntimeException(); }
  static public  java.lang.String formatResourcesAddresses (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  static public  java.lang.String formatResourcesUsed (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesTotal, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesUsed)  { throw new RuntimeException(); }
  static public  java.lang.String formatResourceRequirements (scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> requirements)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
}
