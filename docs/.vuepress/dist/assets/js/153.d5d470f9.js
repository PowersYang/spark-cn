(window.webpackJsonp=window.webpackJsonp||[]).push([[153],{351:function(e,t,i){"use strict";i.r(t);var s=i(0),o=Object(s.a)({},(function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("ContentSlotsDistributor",{attrs:{"slot-key":e.$parent.slotKey}},[i("h1",{attrs:{id:"distcp-guide"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#distcp-guide"}},[e._v("#")]),e._v(" DistCp Guide")]),e._v(" "),i("hr"),e._v(" "),i("h3",{attrs:{id:"distcp-driver"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#distcp-driver"}},[e._v("#")]),e._v(" DistCp Driver")]),e._v(" "),i("p",[e._v("The DistCp Driver components are responsible for:")]),e._v(" "),i("ul",[i("li",[i("p",[e._v("Parsing the arguments passed to the DistCp command on the command-line, via:")]),e._v(" "),i("ul",[i("li",[e._v("OptionsParser, and")]),e._v(" "),i("li",[e._v("DistCpOptionsSwitch")])])]),e._v(" "),i("li",[i("p",[e._v("Assembling the command arguments into an appropriate DistCpOptions object, and initializing DistCp. These arguments include:")]),e._v(" "),i("ul",[i("li",[e._v("Source-paths")]),e._v(" "),i("li",[e._v("Target location")]),e._v(" "),i("li",[e._v("Copy options (e.g. whether to update-copy, overwrite, which file-attributes to preserve, etc.)")])])]),e._v(" "),i("li",[i("p",[e._v("Orchestrating the copy operation by:")]),e._v(" "),i("ul",[i("li",[e._v("Invoking the copy-listing-generator to create the list of files to be copied.")]),e._v(" "),i("li",[e._v("Setting up and launching the Hadoop Map-Reduce Job to carry out the copy.")]),e._v(" "),i("li",[e._v("Based on the options, either returning a handle to the Hadoop MR Job immediately, or waiting till completion.")])])])]),e._v(" "),i("p",[e._v("The parser-elements are exercised only from the command-line (or if DistCp::run() is invoked). The DistCp class may also be used programmatically, by constructing the DistCpOptions object, and initializing a DistCp object appropriately.")]),e._v(" "),i("h3",{attrs:{id:"copy-listing-generator"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#copy-listing-generator"}},[e._v("#")]),e._v(" Copy-listing Generator")]),e._v(" "),i("p",[e._v("The copy-listing-generator classes are responsible for creating the list of files/directories to be copied from source. They examine the contents of the source-paths (files/directories, including wild-cards), and record all paths that need copy into a SequenceFile, for consumption by the DistCp Hadoop Job. The main classes in this module include:")]),e._v(" "),i("ol",[i("li",[e._v("CopyListing: The interface that should be implemented by any copy-listing-generator implementation. Also provides the factory method by which the concrete CopyListing implementation is chosen.")]),e._v(" "),i("li",[e._v("SimpleCopyListing: An implementation of CopyListing that accepts multiple source paths (files/directories), and recursively lists all the individual files and directories under each, for copy.")]),e._v(" "),i("li",[e._v("GlobbedCopyListing: Another implementation of CopyListing that expands wild-cards in the source paths.")]),e._v(" "),i("li",[e._v("FileBasedCopyListing: An implementation of CopyListing that reads the source-path list from a specified file.")])]),e._v(" "),i("p",[e._v("Based on whether a source-file-list is specified in the DistCpOptions, the source-listing is generated in one of the following ways:")]),e._v(" "),i("ol",[i("li",[e._v("If there’s no source-file-list, the GlobbedCopyListing is used. All wild-cards are expanded, and all the expansions are forwarded to the SimpleCopyListing, which in turn constructs the listing (via recursive descent of each path).")]),e._v(" "),i("li",[e._v("If a source-file-list is specified, the FileBasedCopyListing is used. Source-paths are read from the specified file, and then forwarded to the GlobbedCopyListing. The listing is then constructed as described above.")])]),e._v(" "),i("p",[e._v("One may customize the method by which the copy-listing is constructed by providing a custom implementation of the CopyListing interface. The behaviour of DistCp differs here from the legacy DistCp, in how paths are considered for copy.")]),e._v(" "),i("p",[e._v("The legacy implementation only lists those paths that must definitely be copied on to target. E.g. if a file already exists at the target (and -overwrite isn’t specified), the file isn’t even considered in the MapReduce Copy Job. Determining this during setup (i.e. before the MapReduce Job) involves file-size and checksum-comparisons that are potentially time-consuming.")]),e._v(" "),i("p",[e._v("The new DistCp postpones such checks until the MapReduce Job, thus reducing setup time. Performance is enhanced further since these checks are parallelized across multiple maps.")]),e._v(" "),i("h3",{attrs:{id:"inputformats-and-mapreduce-components"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#inputformats-and-mapreduce-components"}},[e._v("#")]),e._v(" InputFormats and MapReduce Components")]),e._v(" "),i("p",[e._v("The InputFormats and MapReduce components are responsible for the actual copy of files and directories from the source to the destination path. The listing-file created during copy-listing generation is consumed at this point, when the copy is carried out. The classes of interest here include:")]),e._v(" "),i("ul",[i("li",[i("p",[e._v("UniformSizeInputFormat: This implementation of org.apache.hadoop.mapreduce.InputFormat provides equivalence with Legacy DistCp in balancing load across maps. The aim of the UniformSizeInputFormat is to make each map copy roughly the same number of bytes. Apropos, the listing file is split into groups of paths, such that the sum of file-sizes in each InputSplit is nearly equal to every other map. The splitting isn’t always perfect, but its trivial implementation keeps the setup-time low.")])]),e._v(" "),i("li",[i("p",[e._v("DynamicInputFormat and DynamicRecordReader: The DynamicInputFormat implements org.apache.hadoop.mapreduce.InputFormat, and is new to DistCp. The listing-file is split into several “chunk-files”, the exact number of chunk-files being a multiple of the number of maps requested for in the Hadoop Job. Each map task is “assigned” one of the chunk-files (by renaming the chunk to the task’s id), before the Job is launched. Paths are read from each chunk using the DynamicRecordReader, and processed in the CopyMapper. After all the paths in a chunk are processed, the current chunk is deleted and a new chunk is acquired. The process continues until no more chunks are available. This “dynamic” approach allows faster map-tasks to consume more paths than slower ones, thus speeding up the DistCp job overall.")])]),e._v(" "),i("li",[i("p",[e._v("CopyMapper: This class implements the physical file-copy. The input-paths are checked against the input-options (specified in the Job’s Configuration), to determine whether a file needs copy. A file will be copied only if at least one of the following is true:")]),e._v(" "),i("ul",[i("li",[e._v("A file with the same name doesn’t exist at target.")]),e._v(" "),i("li",[e._v("A file with the same name exists at target, but has a different file size.")]),e._v(" "),i("li",[e._v("A file with the same name exists at target, but has a different checksum, and -skipcrccheck isn’t mentioned.")]),e._v(" "),i("li",[e._v("A file with the same name exists at target, but -overwrite is specified.")]),e._v(" "),i("li",[e._v("A file with the same name exists at target, but differs in block-size (and block-size needs to be preserved.")])])]),e._v(" "),i("li",[i("p",[e._v("CopyCommitter: This class is responsible for the commit-phase of the DistCp job, including:")]),e._v(" "),i("ul",[i("li",[e._v("Preservation of directory-permissions (if specified in the options)")]),e._v(" "),i("li",[e._v("Clean-up of temporary-files, work-directories, etc.")])])])]),e._v(" "),i("h2",{attrs:{id:"appendix"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#appendix"}},[e._v("#")]),e._v(" Appendix")]),e._v(" "),i("h3",{attrs:{id:"map-sizing"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#map-sizing"}},[e._v("#")]),e._v(" Map sizing")]),e._v(" "),i("p",[e._v("By default, DistCp makes an attempt to size each map comparably so that each copies roughly the same number of bytes. Note that files are the finest level of granularity, so increasing the number of simultaneous copiers (i.e. maps) may not always increase the number of simultaneous copies nor the overall throughput.")]),e._v(" "),i("p",[e._v("The new DistCp also provides a strategy to “dynamically” size maps, allowing faster data-nodes to copy more bytes than slower nodes. Using -strategy dynamic (explained in the Architecture), rather than to assign a fixed set of source-files to each map-task, files are instead split into several sets. The number of sets exceeds the number of maps, usually by a factor of 2-3. Each map picks up and copies all files listed in a chunk. When a chunk is exhausted, a new chunk is acquired and processed, until no more chunks remain.")]),e._v(" "),i("p",[e._v("By not assigning a source-path to a fixed map, faster map-tasks (i.e. data-nodes) are able to consume more chunks, and thus copy more data, than slower nodes. While this distribution isn’t uniform, it is fair with regard to each mapper’s capacity.")]),e._v(" "),i("p",[e._v("The dynamic-strategy is implemented by the DynamicInputFormat. It provides superior performance under most conditions.")]),e._v(" "),i("p",[e._v("Tuning the number of maps to the size of the source and destination clusters, the size of the copy, and the available bandwidth is recommended for long-running and regularly run jobs.")]),e._v(" "),i("h3",{attrs:{id:"copying-between-versions-of-hdfs"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#copying-between-versions-of-hdfs"}},[e._v("#")]),e._v(" Copying Between Versions of HDFS")]),e._v(" "),i("p",[e._v("For copying between two different major versions of Hadoop (e.g. between 1.X and 2.X), one will usually use WebHdfsFileSystem. Unlike the previous HftpFileSystem, as webhdfs is available for both read and write operations, DistCp can be run on both source and destination cluster. Remote cluster is specified as webhdfs://<namenode_hostname>:<http_port>. When copying between same major versions of Hadoop cluster (e.g. between 2.X and 2.X), use hdfs protocol for better performance.")]),e._v(" "),i("h3",{attrs:{id:"secure-copy-over-the-wire-with-distcp"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#secure-copy-over-the-wire-with-distcp"}},[e._v("#")]),e._v(" Secure Copy over the wire with distcp")]),e._v(" "),i("p",[e._v("Use the “swebhdfs://” scheme when webhdfs is secured with SSL. For more information see "),i("router-link",{attrs:{to:"/en/docs/hadoop-project-dist/hadoop-hdfs/WebHDFS.html#SSL_Configurations_for_SWebHDFS"}},[e._v("SSL Configurations for SWebHDFS")]),e._v(".")],1),e._v(" "),i("h3",{attrs:{id:"mapreduce-and-other-side-effects"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#mapreduce-and-other-side-effects"}},[e._v("#")]),e._v(" MapReduce and other side-effects")]),e._v(" "),i("p",[e._v("As has been mentioned in the preceding, should a map fail to copy one of its inputs, there will be several side-effects.")]),e._v(" "),i("ul",[i("li",[e._v("Unless -overwrite is specified, files successfully copied by a previous map on a re-execution will be marked as “skipped”.")]),e._v(" "),i("li",[e._v("If a map fails mapreduce.map.maxattempts times, the remaining map tasks will be killed (unless -i is set).")]),e._v(" "),i("li",[e._v("If mapreduce.map.speculative is set set final and true, the result of the copy is undefined.")])]),e._v(" "),i("h3",{attrs:{id:"distcp-and-object-stores"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#distcp-and-object-stores"}},[e._v("#")]),e._v(" DistCp and Object Stores")]),e._v(" "),i("p",[e._v("DistCp works with Object Stores such as Amazon S3, Azure WASB and OpenStack Swift.")]),e._v(" "),i("p",[e._v("Prequisites")]),e._v(" "),i("ol",[i("li",[e._v("The JAR containing the object store implementation is on the classpath, along with all of its dependencies.")]),e._v(" "),i("li",[e._v("Unless the JAR automatically registers its bundled filesystem clients, the configuration may need to be modified to state the class which implements the filesystem schema. All of the ASF’s own object store clients are self-registering.")]),e._v(" "),i("li",[e._v("The relevant object store access credentials must be available in the cluster configuration, or be otherwise available in all cluster hosts.")])]),e._v(" "),i("p",[e._v("DistCp can be used to upload data")]),e._v(" "),i("pre",[i("code",[e._v("hadoop distcp -direct hdfs://nn1:8020/datasets/set1 s3a://bucket/datasets/set1\n")])]),e._v(" "),i("p",[e._v("To download data")]),e._v(" "),i("pre",[i("code",[e._v("hadoop distcp s3a://bucket/generated/results hdfs://nn1:8020/results\n")])]),e._v(" "),i("p",[e._v("To copy data between object stores")]),e._v(" "),i("pre",[i("code",[e._v("hadoop distcp s3a://bucket/generated/results \\\n  wasb://updates@example.blob.core.windows.net\n")])]),e._v(" "),i("p",[e._v("And do copy data within an object store")]),e._v(" "),i("pre",[i("code",[e._v("hadoop distcp wasb://updates@example.blob.core.windows.net/current \\\n  wasb://updates@example.blob.core.windows.net/old\n")])]),e._v(" "),i("p",[e._v("And to use -update to only copy changed files.")]),e._v(" "),i("pre",[i("code",[e._v("hadoop distcp -update -numListstatusThreads 20  \\\n  swift://history.cluster1/2016 \\\n  hdfs://nn1:8020/history/2016\n")])]),e._v(" "),i("p",[e._v("Because object stores are slow to list files, consider setting the -numListstatusThreads option when performing a -update operation on a large directory tree (the limit is 40 threads).")]),e._v(" "),i("p",[e._v("When DistCp -update is used with object stores, generally only the modification time and length of the individual files are compared, not any checksums. The fact that most object stores do have valid timestamps for directories is irrelevant; only the file timestamps are compared. However, it is important to have the clock of the client computers close to that of the infrastructure, so that timestamps are consistent between the client/HDFS cluster and that of the object store. Otherwise, changed files may be missed/copied too often.")]),e._v(" "),i("p",[e._v("Notes")]),e._v(" "),i("ul",[i("li",[i("p",[e._v("The -atomic option causes a rename of the temporary data, so significantly increases the time to commit work at the end of the operation. Furthermore, as Object Stores other than (optionally) wasb:// do not offer atomic renames of directories the -atomic operation doesn’t actually deliver what is promised. Avoid.")])]),e._v(" "),i("li",[i("p",[e._v("The -append option is not supported.")])]),e._v(" "),i("li",[i("p",[e._v("The -diff and rdiff options are not supported")])]),e._v(" "),i("li",[i("p",[e._v("CRC checking will not be performed, irrespective of the value of the -skipCrc flag.")])]),e._v(" "),i("li",[i("p",[e._v("All -p options, including those to preserve permissions, user and group information, attributes checksums and replication are generally ignored. The wasb:// connector will preserve the information, but not enforce the permissions.")])]),e._v(" "),i("li",[i("p",[e._v("Some object store connectors offer an option for in-memory buffering of output —for example the S3A connector. Using such option while copying large files may trigger some form of out of memory event, be it a heap overflow or a YARN container termination. This is particularly common if the network bandwidth between the cluster and the object store is limited (such as when working with remote object stores). It is best to disable/avoid such options and rely on disk buffering.")])]),e._v(" "),i("li",[i("p",[e._v("Copy operations within a single object store still take place in the Hadoop cluster —even when the object store implements a more efficient COPY operation internally")])])]),e._v(" "),i("p",[e._v("That is, an operation such as")]),e._v(" "),i("p",[e._v("hadoop distcp "),i("a",{attrs:{href:"s3a://bucket/datasets/set1"}},[e._v("s3a://bucket/datasets/set1")]),e._v(" "),i("a",{attrs:{href:"s3a://bucket/datasets/set2"}},[e._v("s3a://bucket/datasets/set2")])]),e._v(" "),i("p",[e._v("Copies each byte down to the Hadoop worker nodes and back to the bucket. As well as being slow, it means that charges may be incurred.")]),e._v(" "),i("ul",[i("li",[e._v("The -direct option can be used to write to object store target paths directly, avoiding the potentially very expensive temporary file rename operations that would otherwise occur.")])]),e._v(" "),i("h2",{attrs:{id:"frequently-asked-questions"}},[i("a",{staticClass:"header-anchor",attrs:{href:"#frequently-asked-questions"}},[e._v("#")]),e._v(" Frequently Asked Questions")]),e._v(" "),i("ol",[i("li",[i("p",[e._v("Why does -update not create the parent source-directory under a pre-existing target directory? The behaviour of -update and -overwrite is described in detail in the Usage section of this document. In short, if either option is used with a pre-existing destination directory, the contents of each source directory is copied over, rather than the source-directory itself. This behaviour is consistent with the legacy DistCp implementation as well.")])]),e._v(" "),i("li",[i("p",[e._v("How does the new DistCp differ in semantics from the Legacy DistCp?")])])]),e._v(" "),i("pre",[i("code",[e._v("* Files that are skipped during copy used to also have their file-attributes (permissions, owner/group info, etc.) unchanged, when copied with Legacy DistCp. These are now updated, even if the file-copy is skipped.\n* Empty root directories among the source-path inputs were not created at the target, in Legacy DistCp. These are now created.\n")])]),e._v(" "),i("ol",{attrs:{start:"3"}},[i("li",[i("p",[e._v("Why does the new DistCp use more maps than legacy DistCp? Legacy DistCp works by figuring out what files need to be actually copied to target before the copy-job is launched, and then launching as many maps as required for copy. So if a majority of the files need to be skipped (because they already exist, for example), fewer maps will be needed. As a consequence, the time spent in setup (i.e. before the M/R job) is higher. The new DistCp calculates only the contents of the source-paths. It doesn’t try to filter out what files can be skipped. That decision is put off till the M/R job runs. This is much faster (vis-a-vis execution-time), but the number of maps launched will be as specified in the -m option, or 20 (default) if unspecified.")])]),e._v(" "),i("li",[i("p",[e._v("Why does DistCp not run faster when more maps are specified? At present, the smallest unit of work for DistCp is a file. i.e., a file is processed by only one map. Increasing the number of maps to a value exceeding the number of files would yield no performance benefit. The number of maps launched would equal the number of files.")])]),e._v(" "),i("li",[i("p",[e._v("Why does DistCp run out of memory? If the number of individual files/directories being copied from the source path(s) is extremely large (e.g. 1,000,000 paths), DistCp might run out of memory while determining the list of paths for copy. This is not unique to the new DistCp implementation. To get around this, consider changing the -Xmx JVM heap-size parameters, as follows:")]),e._v(" "),i("pre",[i("code",[e._v('bash$ export HADOOP_CLIENT_OPTS="-Xms64m -Xmx1024m"\n')])]),e._v(" "),i("p",[e._v("bash$ hadoop distcp /source /target")])])])])}),[],!1,null,null,null);t.default=o.exports}}]);