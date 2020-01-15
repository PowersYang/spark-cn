package org.apache.spark.ml;
/**
 * Event emitted by ML operations. Events are either fired before and/or
 * after each operation (the event should document this).
 * <p>
 * @note This is supported via {@link Pipeline} and {@link PipelineModel}.
 * @note This is experimental and unstable. Do not use this unless you fully
 *   understand what <code>Unstable</code> means.
 */
public  interface MLEvent extends org.apache.spark.scheduler.SparkListenerEvent {
    boolean logEvent ()  ;
}
