package org.apache.spark.resource;
/**
 * Trait used to help executor/worker allocate resources.
 * Please note that this is intended to be used in a single thread.
 */
public  interface ResourceAllocator {
  /**
   * Acquire a sequence of resource addresses (to a launched task), these addresses must be
   * available. When the task finishes, it will return the acquired resource addresses.
   * Throw an Exception if an address is not available or doesn't exist.
   * @param addrs (undocumented)
   */
  public  void acquire (scala.collection.Seq<java.lang.String> addrs)  ;
  /**
   * Sequence of currently assigned resource addresses.
   * @return (undocumented)
   */
    scala.collection.Seq<java.lang.String> assignedAddrs ()  ;
  /**
   * Sequence of currently available resource addresses.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> availableAddrs ()  ;
  /**
   * Release a sequence of resource addresses, these addresses must have been assigned. Resource
   * addresses are released when a task has finished.
   * Throw an Exception if an address is not assigned or doesn't exist.
   * @param addrs (undocumented)
   */
  public  void release (scala.collection.Seq<java.lang.String> addrs)  ;
  public  scala.collection.Seq<java.lang.String> resourceAddresses ()  ;
  public  java.lang.String resourceName ()  ;
}
