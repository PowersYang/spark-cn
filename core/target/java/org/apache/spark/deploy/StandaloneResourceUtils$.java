package org.apache.spark.deploy;
public  class StandaloneResourceUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StandaloneResourceUtils$ MODULE$ = null;
  public   StandaloneResourceUtils$ ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_RESOURCES_COORDINATE_DIR ()  { throw new RuntimeException(); }
  public  java.lang.String ALLOCATED_RESOURCES_FILE ()  { throw new RuntimeException(); }
  public  java.lang.String RESOURCES_LOCK_FILE ()  { throw new RuntimeException(); }
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
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> acquireResources (org.apache.spark.SparkConf conf, java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, int pid)  { throw new RuntimeException(); }
  /**
   * Frees (if coordinate needed) all the resources a worker/driver (pid) has in one shot
   * to make those resources be available for other workers/drivers on the same host.
   * @param conf SparkConf
   * @param componentName spark.driver / spark.worker
   * @param toRelease the resources expected to release
   * @param pid the process id of worker/driver to release resources.
   */
  public  void releaseResources (org.apache.spark.SparkConf conf, java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> toRelease, int pid)  { throw new RuntimeException(); }
  /**
   * Save the allocated resources of driver(cluster only) or executor into a JSON formatted
   * resources file. Used in Standalone only.
   * @param componentName spark.driver / spark.executor
   * @param resources allocated resources for driver(cluster only) or executor
   * @param dir the target directory used to place the resources file
   * @return None if resources is empty or Some(file) which represents the resources file
   */
  public  scala.Option<java.io.File> prepareResourcesFile (java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, java.io.File dir)  { throw new RuntimeException(); }
  /** Whether needs to coordinate resources among workers and drivers for user */
  public  boolean needCoordinate (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.StandaloneResourceUtils.MutableResourceInfo> toMutable (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> immutableResources)  { throw new RuntimeException(); }
  public  java.lang.String formatResourcesDetails (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> usedInfo, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> freeInfo)  { throw new RuntimeException(); }
  public  java.lang.String formatResourcesAddresses (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public  java.lang.String formatResourcesUsed (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesTotal, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesUsed)  { throw new RuntimeException(); }
  public  java.lang.String formatResourceRequirements (scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> requirements)  { throw new RuntimeException(); }
}
