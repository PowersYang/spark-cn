(window.webpackJsonp=window.webpackJsonp||[]).push([[227],{426:function(e,t,a){"use strict";a.r(t);var r=a(0),o=Object(r.a)({},(function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("ContentSlotsDistributor",{attrs:{"slot-key":e.$parent.slotKey}},[a("h1",{attrs:{id:"yarn-scheduler-load-simulator-sls"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#yarn-scheduler-load-simulator-sls"}},[e._v("#")]),e._v(" YARN Scheduler Load Simulator (SLS)")]),e._v(" "),a("h2",{attrs:{id:"overview"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#overview"}},[e._v("#")]),e._v(" Overview")]),e._v(" "),a("h3",{attrs:{id:"overview-2"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#overview-2"}},[e._v("#")]),e._v(" Overview")]),e._v(" "),a("p",[e._v("The YARN scheduler is a fertile area of interest with different implementations, e.g., Fifo, Capacity and Fair schedulers. Meanwhile, several optimizations are also made to improve scheduler performance for different scenarios and workload. Each scheduler algorithm has its own set of features, and drives scheduling decisions by many factors, such as fairness, capacity guarantee, resource availability, etc. It is very important to evaluate a scheduler algorithm very well before we deploy in a production cluster. Unfortunately, currently it is non-trivial to evaluate a scheduler algorithm. Evaluating in a real cluster is always time and cost consuming, and it is also very hard to find a large-enough cluster. Hence, a simulator which can predict how well a scheduler algorithm for some specific workload would be quite useful.")]),e._v(" "),a("p",[e._v("The YARN Scheduler Load Simulator (SLS) is such a tool, which can simulate large-scale YARN clusters and application loads in a single machine.This simulator would be invaluable in furthering YARN by providing a tool for researchers and developers to prototype new scheduler features and predict their behavior and performance with reasonable amount of confidence, thereby aiding rapid innovation. o The simulator will exercise the real YARN ResourceManager removing the network factor by simulating NodeManagers and ApplicationMasters via handling and dispatching NM/AMs heartbeat events from within the same JVM. To keep tracking of scheduler behavior and performance, a scheduler wrapper will wrap the real scheduler.")]),e._v(" "),a("p",[e._v("The size of the cluster and the application load can be loaded from configuration files, which are generated from job history files directly by adopting "),a("router-link",{attrs:{to:"/en/docs/hadoop-rumen/Rumen.html"}},[e._v("Apache Rumen")]),e._v(".")],1),e._v(" "),a("p",[e._v("The simulator will produce real time metrics while executing, including:")]),e._v(" "),a("ul",[a("li",[a("p",[e._v("Resource usages for whole cluster and each queue, which can be utilized to configure cluster and queue’s capacity.")])]),e._v(" "),a("li",[a("p",[e._v("The detailed application execution trace (recorded in relation to simulated time), which can be analyzed to understand/validate the scheduler behavior (individual jobs turn around time, throughput, fairness, capacity guarantee, etc.).")])]),e._v(" "),a("li",[a("p",[e._v("Several key metrics of scheduler algorithm, such as time cost of each scheduler operation (allocate, handle, etc.), which can be utilized by Hadoop developers to find the code spots and scalability limits.")])])]),e._v(" "),a("h3",{attrs:{id:"goals"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#goals"}},[e._v("#")]),e._v(" Goals")]),e._v(" "),a("ul",[a("li",[a("p",[e._v("Exercise the scheduler at scale without a real cluster using real job traces.")])]),e._v(" "),a("li",[a("p",[e._v("Being able to simulate real workloads.")])])]),e._v(" "),a("h3",{attrs:{id:"architecture"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#architecture"}},[e._v("#")]),e._v(" Architecture")]),e._v(" "),a("p",[e._v("The following figure illustrates the implementation architecture of the simulator.")]),e._v(" "),a("img",{attrs:{src:"/sls_arch.png",alt:"The architecture of the simulator"}}),e._v(" "),a("p",[e._v("The simulator takes input of workload traces, or synthetic load distributions and generaters the cluster and applications information. For each NM and AM, the simulator builds a simulator to simulate their running. All NM/AM simulators run in a thread pool. The simulator reuses YARN Resource Manager, and builds a wrapper out of the scheduler. The Scheduler Wrapper can track the scheduler behaviors and generates several logs, which are the outputs of the simulator and can be further analyzed.")]),e._v(" "),a("h3",{attrs:{id:"usecases"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#usecases"}},[e._v("#")]),e._v(" Usecases")]),e._v(" "),a("ul",[a("li",[a("p",[e._v("Engineering")]),e._v(" "),a("ul",[a("li",[e._v("Verify correctness of scheduler algorithm under load")]),e._v(" "),a("li",[e._v("Cheap/practical way for finding code hotspots/critical-path.")]),e._v(" "),a("li",[e._v("Validate the impact of changes and new features.")]),e._v(" "),a("li",[e._v("Determine what drives the scheduler scalability limits.")])])]),e._v(" "),a("li",[a("p",[e._v("QA")]),e._v(" "),a("ul",[a("li",[e._v("Validate scheduler behavior for “large” clusters and several workload profiles.")])])]),e._v(" "),a("li",[a("p",[e._v("Solutions/Sales.")]),e._v(" "),a("ul",[a("li",[e._v("Sizing model for predefined/typical workloads.")]),e._v(" "),a("li",[e._v("Cluster sizing tool using real customer data (job traces).")]),e._v(" "),a("li",[e._v("Determine minimum SLAs under a particular workload.")])])])]),e._v(" "),a("h2",{attrs:{id:"usage"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#usage"}},[e._v("#")]),e._v(" Usage")]),e._v(" "),a("p",[e._v("This section will show how to use the simulator. Here let $HADOOP_ROOT represent the Hadoop install directory. If you build Hadoop yourself, $HADOOP_ROOT is hadoop-dist/target/hadoop-$VERSION. The simulator is located at $HADOOP_ROOT/share/hadoop/tools/sls. The fold sls containers four directories: bin, html, sample-conf, and sample-data")]),e._v(" "),a("ul",[a("li",[a("p",[e._v("bin: contains running scripts for the simulator.")])]),e._v(" "),a("li",[a("p",[e._v("html: Users can also reproduce those real-time tracking charts in offline mode. Just upload the realtimetrack.json to $HADOOP_ROOT/share/hadoop/tools/sls/html/showSimulationTrace.html. For browser security problem, need to put files realtimetrack.json and showSimulationTrace.html in the same directory.")])]),e._v(" "),a("li",[a("p",[e._v("sample-conf: specifies the simulator configurations.")])]),e._v(" "),a("li",[a("p",[e._v("sample-data: provides an example rumen trace, which can be used to generate inputs of the simulator.")])])]),e._v(" "),a("p",[e._v("The following sections will describe how to use the simulator step by step. Before start, make sure that command hadoop is included in your $PATH environment parameter.")]),e._v(" "),a("h3",{attrs:{id:"step-1-configure-hadoop-and-the-simulator"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#step-1-configure-hadoop-and-the-simulator"}},[e._v("#")]),e._v(" Step 1: Configure Hadoop and the simulator")]),e._v(" "),a("p",[e._v("Before we start, make sure Hadoop and the simulator are configured well. All configuration files for Hadoop and the simulator should be placed in directory $HADOOP_ROOT/etc/hadoop, where the ResourceManager and YARN scheduler load their configurations. Directory $HADOOP_ROOT/share/hadoop/tools/sls/sample-conf/ provides several example configurations, that can be used to start a demo.")]),e._v(" "),a("p",[e._v("For configuration of Hadoop and YARN scheduler, users can refer to Yarn’s website ("),a("a",{attrs:{href:"http://hadoop.apache.org/docs/current/hadoop-yarn/hadoop-yarn-site/",target:"_blank",rel:"noopener noreferrer"}},[e._v("http://hadoop.apache.org/docs/current/hadoop-yarn/hadoop-yarn-site/"),a("OutboundLink")],1),e._v(").")]),e._v(" "),a("p",[e._v("For the simulator, it loads configuration information from file $HADOOP_ROOT/etc/hadoop/sls-runner.xml.")]),e._v(" "),a("p",[e._v("Here we illustrate each configuration parameter in sls-runner.xml. Note that $HADOOP_ROOT/share/hadoop/tools/sls/sample-conf/sls-runner.xml contains all the default values for these configuration parameters.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.runner.pool.size")])]),e._v(" "),a("p",[e._v("The simulator uses a thread pool to simulate the NM and AM running, and this parameter specifies the number of threads in the pool.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.nm.memory.mb")])]),e._v(" "),a("p",[e._v("The total memory for each NMSimulator.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.nm.vcores")])]),e._v(" "),a("p",[e._v("The total vCores for each NMSimulator.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.nm.heartbeat.interval.ms")])]),e._v(" "),a("p",[e._v("The heartbeat interval for each NMSimulator.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.am.heartbeat.interval.ms")])]),e._v(" "),a("p",[e._v("The heartbeat interval for each AMSimulator.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.am.type.mapreduce")])]),e._v(" "),a("p",[e._v("The AMSimulator implementation for MapReduce-like applications. Users can specify implementations for other type of applications.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.container.memory.mb")])]),e._v(" "),a("p",[e._v("The memory required for each container simulator.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.container.vcores")])]),e._v(" "),a("p",[e._v("The vCores required for each container simulator.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.runner.metrics.switch")])]),e._v(" "),a("p",[e._v("The simulator introduces "),a("a",{attrs:{href:"http://metrics.codahale.com/",target:"_blank",rel:"noopener noreferrer"}},[e._v("Metrics"),a("OutboundLink")],1),e._v(" to measure the behaviors of critical components and operations. This field specifies whether we open (ON) or close (OFF) the Metrics running.")]),e._v(" "),a("ul",[a("li",[e._v("yarn.sls.metrics.web.address.port")])]),e._v(" "),a("p",[e._v("The port used by simulator to provide real-time tracking. The default value is 10001.")]),e._v(" "),a("ul",[a("li",[e._v("org.apache.hadoop.yarn.server.resourcemanager.scheduler.fifo.FifoScheduler")])]),e._v(" "),a("p",[e._v("The implementation of scheduler metrics of Fifo Scheduler.")]),e._v(" "),a("ul",[a("li",[e._v("org.apache.hadoop.yarn.server.resourcemanager.scheduler.fair.FairScheduler")])]),e._v(" "),a("p",[e._v("The implementation of scheduler metrics of Fair Scheduler.")]),e._v(" "),a("ul",[a("li",[e._v("org.apache.hadoop.yarn.server.resourcemanager.scheduler.capacity.CapacityScheduler")])]),e._v(" "),a("p",[e._v("The implementation of scheduler metrics of Capacity Scheduler.")]),e._v(" "),a("h3",{attrs:{id:"step-2-run-the-simulator"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#step-2-run-the-simulator"}},[e._v("#")]),e._v(" Step 2: Run the simulator")]),e._v(" "),a("p",[e._v("The simulator supports two types of input files: the rumen traces and its own input traces. The script to start the simulator is slsrun.sh.")]),e._v(" "),a("pre",[a("code",[e._v("$ cd $HADOOP_ROOT/share/hadoop/tools/sls\n$ bin/slsrun.sh\n  Usage: slsrun.sh <OPTIONS>\n             --tracetype=<SYNTH | SLS | RUMEN>\n             --tracelocation=<FILE1,FILE2,...>\n             (deprecated --input-rumen=<FILE1,FILE2,...>  | --input-sls=<FILE1,FILE2,...>)\n             --output-dir=<SLS_SIMULATION_OUTPUT_DIRECTORY>\n             [--nodes=<SLS_NODES_FILE>]\n             [--track-jobs=<JOBID1,JOBID2,...>]\n             [--print-simulation]\n")])]),e._v(" "),a("ul",[a("li",[a("p",[e._v("--input-rumen: The input rumen trace files. Users can input multiple files, separated by comma. One example trace is provided in $HADOOP_ROOT/share/hadoop/tools/sls/sample-data/2jobs2min-rumen-jh.json. This is equivalent to --tracetype=RUMEN --tracelocation=<path_to_trace>.")])]),e._v(" "),a("li",[a("p",[e._v("--input-sls: Simulator its own file format. The simulator also provides a tool to convert rumen traces to sls traces (rumen2sls.sh). Refer to appendix for an example of sls input json file. This is equivalent to --tracetype=SLS --tracelocation=<path_to_trace>.")])]),e._v(" "),a("li",[a("p",[e._v("--tracetype: This is the new way to configure the trace generation and takes values RUMEN, SLS, or SYNTH, to trigger the three type of load generation")])]),e._v(" "),a("li",[a("p",[e._v("--tracelocation: Path to the input file, matching the tracetype above.")])]),e._v(" "),a("li",[a("p",[e._v("--output-dir: The output directory for generated running logs and metrics.")])]),e._v(" "),a("li",[a("p",[e._v("--nodes: The cluster topology. By default, the simulator will use the topology fetched from the input json files. Users can specifies a new topology by setting this parameter. Refer to the appendix for the topology file format.")])]),e._v(" "),a("li",[a("p",[e._v("--track-jobs: The particular jobs that will be tracked during simulator running, spearated by comma.")])]),e._v(" "),a("li",[a("p",[e._v("--print-simulation: Whether to print out simulation information before simulator running, including number of nodes, applications, tasks, and information for each application.")])])]),e._v(" "),a("p",[e._v("In comparison to rumen format, here the sls format is much simpler and users can easily generate various workload. The simulator also provides a tool to convert rumen traces to sls traces.")]),e._v(" "),a("pre",[a("code",[e._v("    $ bin/rumen2sls.sh\n  --rumen-file=<RUMEN_FILE>\n  --output-dir=<SLS_OUTPUT_DIRECTORY>\n    [--output-prefix=<SLS_FILE_PREFIX>]\n")])]),e._v(" "),a("ul",[a("li",[a("p",[e._v("--rumen-file: The rumen format file. One example trace is provided in directory sample-data.")])]),e._v(" "),a("li",[a("p",[e._v("--output-dir: The output directory of generated simulation traces. Two files will be generated in this output directory, including one trace file including all job and task information, and another file showing the topology information.")])]),e._v(" "),a("li",[a("p",[e._v("--output-prefix: The prefix of the generated files. The default value is “sls”, and the two generated files are sls-jobs.json and sls-nodes.json.")])])]),e._v(" "),a("h2",{attrs:{id:"metrics"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#metrics"}},[e._v("#")]),e._v(" Metrics")]),e._v(" "),a("p",[e._v("The YARN Scheduler Load Simulator has integrated "),a("a",{attrs:{href:"http://metrics.codahale.com/",target:"_blank",rel:"noopener noreferrer"}},[e._v("Metrics"),a("OutboundLink")],1),e._v(" to measure the behaviors of critical components and operations, including running applications and containers, cluster available resources, scheduler operation timecost, et al. If the switch yarn.sls.runner.metrics.switch is set ON, Metrics will run and output it logs in --output-dir directory specified by users. Users can track these information during simulator running, and can also analyze these logs after running to evaluate the scheduler performance.")]),e._v(" "),a("h3",{attrs:{id:"real-time-tracking"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#real-time-tracking"}},[e._v("#")]),e._v(" Real-time Tracking")]),e._v(" "),a("p",[e._v("The simulator provides an interface for tracking its running in real-time. Users can go to http://host:port/simulate to track whole running, and http://host:port/track to track a particular job or queue. Here the host is the place when we run the simulator, and port is the value configured by yarn.sls.metrics.web.address.port (default value is 10001).")]),e._v(" "),a("p",[e._v("Here we’ll illustrate each chart shown in the webpage.")]),e._v(" "),a("p",[e._v("The first figure describes the number of running applications and containers.")]),e._v(" "),a("img",{attrs:{src:"/sls_running_apps_containers.png",alt:"Number of running applications/containers"}}),e._v(" "),a("p",[e._v("The second figure describes the allocated and available resources (memory) in the cluster.")]),e._v(" "),a("img",{attrs:{src:"/sls_cluster_memory.png",alt:"Cluster Resource (Memory)"}}),e._v(" "),a("p",[e._v("The third figure describes the allocated resource for each queue. Here we have three queues: sls_queue_1, sls_queue_2, and sls_queue_3.The first two queues are configured with 25% share, while the last one has 50% share.")]),e._v(" "),a("img",{attrs:{src:"/sls_queue_allocated_memory.png",alt:"Queue Allocated Resource (Memory)"}}),e._v(" "),a("p",[e._v("The fourth figure describes the timecost for each scheduler operation.")]),e._v(" "),a("img",{attrs:{src:"/sls_scheduler_operation_timecost.png",alt:"Scheduler Opertion Timecost"}}),e._v(" "),a("p",[e._v("Finally, we measure the memory used by the simulator.")]),e._v(" "),a("img",{attrs:{src:"/sls_JVM.png",alt:"JVM Memory"}}),e._v(" "),a("p",[e._v("The simulator also provides an interface for tracking some particular jobs and queues. Go to http://"),a("Host",[e._v(":"),a("Port",[e._v("/track to get these information.")])],1)],1),e._v(" "),a("p",[e._v("Here the first figure illustrates the resource usage information for queue SLS_Queue_1.")]),e._v(" "),a("img",{attrs:{src:"/sls_track_queue.png",alt:"Tracking Queue "}}),e._v(" "),a("p",[e._v("The second figure illustrates the resource usage information for job job_1369942127770_0653.")]),e._v(" "),a("img",{attrs:{src:"/sls_track_job.png",alt:"Tracking Job "}}),e._v(" "),a("h3",{attrs:{id:"offline-analysis"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#offline-analysis"}},[e._v("#")]),e._v(" Offline Analysis")]),e._v(" "),a("p",[e._v("After the simulator finishes, all logs are saved in the output directory specified by --output-dir in $HADOOP_ROOT/share/hadoop/tools/sls/bin/slsrun.sh.")]),e._v(" "),a("ul",[a("li",[a("p",[e._v("File realtimetrack.json: records all real-time tracking logs every 1 second.")])]),e._v(" "),a("li",[a("p",[e._v("File jobruntime.csv: records all jobs’ start and end time in the simulator.")])]),e._v(" "),a("li",[a("p",[e._v("Folder metrics: logs generated by the Metrics.")])])]),e._v(" "),a("p",[e._v("Users can also reproduce those real-time tracking charts in offline mode. Just upload the realtimetrack.json to $HADOOP_ROOT/share/hadoop/tools/sls/html/showSimulationTrace.html. For browser security problem, need to put files realtimetrack.json and showSimulationTrace.html in the same directory.")]),e._v(" "),a("h2",{attrs:{id:"synthetic-load-generator"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#synthetic-load-generator"}},[e._v("#")]),e._v(" Synthetic Load Generator")]),e._v(" "),a("p",[e._v("The Synthetic Load Generator complements the extensive nature of SLS-native and RUMEN traces, by providing a distribution-driven generation of load. The load generator is organized as a JobStoryProducer (compatible with rumen, and thus gridmix for later integration). We seed the Random number generator so that results randomized but deterministic—hence reproducible. We organize the jobs being generated around /workloads/job_class hierarchy, which allow to easily group jobs with similar behaviors and categorize them (e.g., jobs with long running containers, or maponly computations, etc..). The user can control average and standard deviations for many of the important parameters, such as number of mappers/reducers, duration of mapper/reducers, size (mem/cpu) of containers, chance of reservation, etc. We use weighted-random sampling (whenever we pick among a small number of options) or LogNormal distributions (to avoid negative values) when we pick from wide ranges of values—see appendix on LogNormal distributions.")]),e._v(" "),a("p",[e._v("The SYNTH mode of SLS is very convenient to generate very large loads without the need for extensive input files. This allows to easily explore wide range of use cases (e.g., imagine simulating 100k jobs, and in different runs simply tune the average number of mappers, or average task duration), in an efficient and compact way.")]),e._v(" "),a("h2",{attrs:{id:"resource-type-in-sls"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#resource-type-in-sls"}},[e._v("#")]),e._v(" Resource Type in SLS")]),e._v(" "),a("p",[e._v("This section talks about how to use resource type in SLS.")]),e._v(" "),a("h2",{attrs:{id:"configure-resource-manager"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#configure-resource-manager"}},[e._v("#")]),e._v(" Configure Resource Manager")]),e._v(" "),a("p",[e._v("This is the same to how to configure resource type for a real cluster. Configure item yarn.resource-types in yarn-site.xml as the following example does.")]),e._v(" "),a("pre",[a("code",[e._v(" <property>\n   <name>yarn.resource-types</name>\n   <value>resource-type1, resource-type2</value>\n </property>\n")])]),e._v(" "),a("h2",{attrs:{id:"configure-node-manager"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#configure-node-manager"}},[e._v("#")]),e._v(" Configure Node Manager")]),e._v(" "),a("p",[e._v("Specify the size of resource in each node by adding relevant items into sls-runner.xml like the following example does. The values apply for every node in SLS. The default values for resources other than memory and vcores are 0.")]),e._v(" "),a("pre",[a("code",[e._v(" <property>\n   <name>yarn.sls.nm.resource-type1</name>\n   <value>10</value>\n </property>\n <property>\n   <name>yarn.sls.nm.resource-type2</name>\n   <value>10</value>\n </property>\n")])]),e._v(" "),a("h2",{attrs:{id:"specify-resource-in-sls-json-input"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#specify-resource-in-sls-json-input"}},[e._v("#")]),e._v(" Specify Resource in SLS JSON input")]),e._v(" "),a("p",[e._v("Resource Type is supported in SLS JSON input format, but not in other two formats(SYNTH and RUMEN). To make it work in SLS JSON input format, you can specify resource sizes for both task containers and the AM container. Here is an example.")]),e._v(" "),a("pre",[a("code",[e._v('{\n  "job.start.ms" : 0,\n  "am.memory-mb": 2048,\n  "am.vcores": 2,\n  "am.resource-type1": 2,\n  "am.resource-type2": 2,\n  "job.tasks" : [ {\n    "container.duration.ms":  5000\n    "container.memory-mb": 1024,\n    "container.vcores": 1,\n    "container.resource-type1": 1,\n    "container.resource-type2": 1\n  }\n}\n')])]),e._v(" "),a("h2",{attrs:{id:"appendix"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#appendix"}},[e._v("#")]),e._v(" Appendix")]),e._v(" "),a("h3",{attrs:{id:"resources"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#resources"}},[e._v("#")]),e._v(" Resources")]),e._v(" "),a("p",[a("a",{attrs:{href:"https://issues.apache.org/jira/browse/YARN-1021",target:"_blank",rel:"noopener noreferrer"}},[e._v("YARN-1021"),a("OutboundLink")],1),e._v(" is the main JIRA that introduces YARN Scheduler Load Simulator to Hadoop YARN project. "),a("a",{attrs:{href:"https://issues.apache.org/jira/browse/YARN-6363",target:"_blank",rel:"noopener noreferrer"}},[e._v("YARN-6363"),a("OutboundLink")],1),e._v(" is the main JIRA that introduces the Synthetic Load Generator to SLS.")]),e._v(" "),a("h3",{attrs:{id:"sls-json-input-file-format"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#sls-json-input-file-format"}},[e._v("#")]),e._v(" SLS JSON input file format")]),e._v(" "),a("p",[e._v("Here we provide an example format of the sls json file, which contains 2 jobs. The first job has 3 map tasks and the second one has 2 map tasks.")]),e._v(" "),a("pre",[a("code",[e._v('{\n  "num.nodes": 3,  // total number of nodes in the cluster\n  "num.racks": 1   // total number of racks in the cluster, it divides num.nodes into the racks evenly, optional, the default value is 1\n}\n{\n  "am.type" : "mapreduce", // type of AM, optional, the default value is "mapreduce"\n  "job.start.ms" : 0,      // job start time\n  "job.end.ms" : 95375,    // job finish time, optional, the default value is 0\n  "job.queue.name" : "sls_queue_1", // the queue job will be submitted to\n  "job.id" : "job_1",      // the job id used to track the job, optional. The default value, an zero-based integer increasing with number of jobs, is used if this is not specified or job.count > 1\n  "job.user" : "default",  // user, optional, the default value is "default"\n  "job.count" : 1,         // number of jobs, optional, the default value is 1\n  "job.tasks" : [ {\n    "count": 1,    // number of tasks, optional, the default value is 1\n    "container.host" : "/default-rack/node1",  // host the container asks for\n    "container.start.ms" : 6664,  // container start time, optional\n    "container.end.ms" : 23707,   // container finish time, optional\n    "container.duration.ms":  50000, // duration of the container, optional if start and end time is specified\n    "container.priority" : 20,    // priority of the container, optional, the default value is 20\n    "container.type" : "map"      // type of the container, could be "map" or "reduce", optional, the default value is "map"\n  }, {\n    "container.host" : "/default-rack/node3",\n    "container.start.ms" : 6665,\n    "container.end.ms" : 21593,\n    "container.priority" : 20,\n    "container.type" : "map"\n  }, {\n    "container.host" : "/default-rack/node2",\n    "container.start.ms" : 68770,\n    "container.end.ms" : 86613,\n    "container.priority" : 20,\n    "container.type" : "map"\n  } ]\n}\n{\n  "am.type" : "mapreduce",\n  "job.start.ms" : 105204,\n  "job.end.ms" : 197256,\n  "job.queue.name" : "sls_queue_2",\n  "job.id" : "job_2",\n  "job.user" : "default",\n  "job.tasks" : [ {\n    "container.host" : "/default-rack/node1",\n    "container.start.ms" : 111822,\n    "container.end.ms" : 133985,\n    "container.priority" : 20,\n    "container.type" : "map"\n  }, {\n    "container.host" : "/default-rack/node2",\n    "container.start.ms" : 111788,\n    "container.end.ms" : 131377,\n    "container.priority" : 20,\n    "container.type" : "map"\n  } ]\n}\n')])]),e._v(" "),a("h3",{attrs:{id:"synth-json-input-file-format"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#synth-json-input-file-format"}},[e._v("#")]),e._v(" SYNTH JSON input file format")]),e._v(" "),a("p",[e._v("Here we provide an example format of the synthetic generator json file. We use (json-non-conforming) inline comments to explain the use of each parameter.")]),e._v(" "),a("pre",[a("code",[e._v('{\n  "description" : "tiny jobs workload",    //description of the meaning of this collection of workloads\n  "num_nodes" : 10,  //total nodes in the simulated cluster\n  "nodes_per_rack" : 4, //number of nodes in each simulated rack\n  "num_jobs" : 10, // total number of jobs being simulated\n  "rand_seed" : 2, //the random seed used for deterministic randomized runs\n\n  // a list of “workloads”, each of which has job classes, and temporal properties\n  "workloads" : [\n    {\n      "workload_name" : "tiny-test", // name of the workload\n      "workload_weight": 0.5,  // used for weighted random selection of which workload to sample from\n      "queue_name" : "sls_queue_1", //queue the job will be submitted to\n\n    //different classes of jobs for this workload\n       "job_classes" : [\n        {\n          "class_name" : "class_1", //name of the class\n          "class_weight" : 1.0, //used for weighted random selection of class within workload\n\n          //nextr group controls average and standard deviation of a LogNormal distribution that\n          //determines the number of mappers and reducers for thejob.\n          "mtasks_avg" : 5,\n          "mtasks_stddev" : 1,\n          "rtasks_avg" : 5,\n          "rtasks_stddev" : 1,\n\n          //averge and stdev input param of LogNormal distribution controlling job duration\n          "dur_avg" : 60,\n          "dur_stddev" : 5,\n\n          //averge and stdev input param of LogNormal distribution controlling mappers and reducers durations\n          "mtime_avg" : 10,\n          "mtime_stddev" : 2,\n          "rtime_avg" : 20,\n          "rtime_stddev" : 4,\n\n          //averge and stdev input param of LogNormal distribution controlling memory and cores for map and reduce\n          "map_max_memory_avg" : 1024,\n          "map_max_memory_stddev" : 0.001,\n          "reduce_max_memory_avg" : 2048,\n          "reduce_max_memory_stddev" : 0.001,\n          "map_max_vcores_avg" : 1,\n          "map_max_vcores_stddev" : 0.001,\n          "reduce_max_vcores_avg" : 2,\n          "reduce_max_vcores_stddev" : 0.001,\n\n          //probability of running this job with a reservation\n          "chance_of_reservation" : 0.5,\n          //input parameters of LogNormal distribution that determines the deadline slack (as a multiplier of job duration)\n          "deadline_factor_avg" : 10.0,\n          "deadline_factor_stddev" : 0.001,\n        }\n       ],\n    // for each workload determines with what probability each time bucket is picked to choose the job starttime.\n    // In the example below the jobs have twice as much chance to start in the first minute than in the second minute\n    // of simulation, and then zero chance thereafter.\n      "time_distribution" : [\n        { "time" : 1, "weight" : 66 },\n        { "time" : 60, "weight" : 33 },\n        { "time" : 120, "jobs" : 0 }\n     ]\n    }\n ]\n}\n')])]),e._v(" "),a("h3",{attrs:{id:"simulator-input-topology-file-format"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#simulator-input-topology-file-format"}},[e._v("#")]),e._v(" Simulator input topology file format")]),e._v(" "),a("p",[e._v("Here is an example input topology file which has 3 nodes organized in 1 rack.")]),e._v(" "),a("pre",[a("code",[e._v('{\n  "rack" : "default-rack",\n  "nodes" : [ {\n    "node" : "node1"\n  }, {\n    "node" : "node2"\n  }, {\n    "node" : "node3"\n  }]\n}\n')])]),e._v(" "),a("h3",{attrs:{id:"notes-on-lognormal-distribution"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#notes-on-lognormal-distribution"}},[e._v("#")]),e._v(" Notes on LogNormal distribution:")]),e._v(" "),a("p",[e._v("LogNormal distributions represent well many of the parameters we see in practice (e.g., most jobs have a small number of mappers, but few might be very large, and few very small, but greater than zero. It is however worth noticing that it might be tricky to use, as the average is typically on the right side of the peak (most common value) of the distribution, because the distribution has a one-side tail.")])])}),[],!1,null,null,null);t.default=o.exports}}]);