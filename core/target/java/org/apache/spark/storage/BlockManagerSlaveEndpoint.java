package org.apache.spark.storage;
/**
 * An RpcEndpoint to take commands from the master to execute options. For example,
 * this is used to remove blocks from the slave's BlockManager.
 */
  class BlockManagerSlaveEndpoint implements org.apache.spark.rpc.IsolatedRpcEndpoint, org.apache.spark.internal.Logging {
  // not preceding
  public   BlockManagerSlaveEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.MapOutputTracker mapOutputTracker)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
