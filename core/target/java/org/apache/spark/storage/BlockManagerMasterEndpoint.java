package org.apache.spark.storage;
/**
 * BlockManagerMasterEndpoint is an {@link ThreadSafeRpcEndpoint} on the master node to track statuses
 * of all slaves' block managers.
 */
  class BlockManagerMasterEndpoint implements org.apache.spark.rpc.IsolatedRpcEndpoint, org.apache.spark.internal.Logging {
  // not preceding
  public   BlockManagerMasterEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, boolean isLocal, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.LiveListenerBus listenerBus, scala.Option<org.apache.spark.network.shuffle.ExternalBlockStoreClient> externalBlockStoreClient)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcTimeout defaultRpcTimeout ()  { throw new RuntimeException(); }
  public  boolean isLocal ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  boolean proactivelyReplicate ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
