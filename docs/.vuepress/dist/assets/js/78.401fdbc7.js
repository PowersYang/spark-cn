(window.webpackJsonp=window.webpackJsonp||[]).push([[78],{278:function(e,t,a){"use strict";a.r(t);var o=a(0),i=Object(o.a)({},(function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("ContentSlotsDistributor",{attrs:{"slot-key":e.$parent.slotKey}},[a("h1",{attrs:{id:"hdfs-quotas-guide"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#hdfs-quotas-guide","aria-hidden":"true"}},[e._v("#")]),e._v(" HDFS Quotas Guide")]),e._v(" "),a("h2",{attrs:{id:"overview"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#overview","aria-hidden":"true"}},[e._v("#")]),e._v(" Overview")]),e._v(" "),a("p",[e._v("The Hadoop Distributed File System (HDFS) allows the administrator to set quotas for the number of names used and the amount of space used for individual directories. Name quotas and space quotas operate independently, but the administration and implementation of the two types of quotas are closely parallel.")]),e._v(" "),a("h2",{attrs:{id:"name-quotas"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#name-quotas","aria-hidden":"true"}},[e._v("#")]),e._v(" Name Quotas")]),e._v(" "),a("p",[e._v("The name quota is a hard limit on the number of file and directory names in the tree rooted at that directory. File and directory creations fail if the quota would be exceeded. Quotas stick with renamed directories; the rename operation fails if operation would result in a quota violation. The attempt to set a quota will still succeed even if the directory would be in violation of the new quota. A newly created directory has no associated quota. The largest quota is Long.Max_Value. A quota of one forces a directory to remain empty. (Yes, a directory counts against its own quota!)")]),e._v(" "),a("p",[e._v("Quotas are persistent with the fsimage. When starting, if the fsimage is immediately in violation of a quota (perhaps the fsimage was surreptitiously modified), a warning is printed for each of such violations. Setting or removing a quota creates a journal entry.")]),e._v(" "),a("h2",{attrs:{id:"space-quotas"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#space-quotas","aria-hidden":"true"}},[e._v("#")]),e._v(" Space Quotas")]),e._v(" "),a("p",[e._v("The space quota is a hard limit on the number of bytes used by files in the tree rooted at that directory. Block allocations fail if the quota would not allow a full block to be written. Each replica of a block counts against the quota. Quotas stick with renamed directories; the rename operation fails if the operation would result in a quota violation. A newly created directory has no associated quota. The largest quota is Long.Max_Value. A quota of zero still permits files to be created, but no blocks can be added to the files. Directories don’t use host file system space and don’t count against the space quota. The host file system space used to save the file meta data is not counted against the quota. Quotas are charged at the intended replication factor for the file; changing the replication factor for a file will credit or debit quotas.")]),e._v(" "),a("p",[e._v("Quotas are persistent with the fsimage. When starting, if the fsimage is immediately in violation of a quota (perhaps the fsimage was surreptitiously modified), a warning is printed for each of such violations. Setting or removing a quota creates a journal entry.")]),e._v(" "),a("h2",{attrs:{id:"storage-type-quotas"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#storage-type-quotas","aria-hidden":"true"}},[e._v("#")]),e._v(" Storage Type Quotas")]),e._v(" "),a("p",[e._v("The storage type quota is a hard limit on the usage of specific storage type (SSD, DISK, ARCHIVE) by files in the tree rooted at the directory. It works similar to storage space quota in many aspects but offers fine-grain control over the cluster storage space usage. To set storage type quota on a directory, storage policies must be configured on the directory in order to allow files to be stored in different storage types according to the storage policy. See the "),a("router-link",{attrs:{to:"/docs/hadoop-project-dist/hadoop-hdfs/ArchivalStorage.html"}},[e._v("HDFS Storage Policy Documentation")]),e._v(" for more information.")],1),e._v(" "),a("p",[e._v("The storage type quota can be combined with the space quotas and name quotas to efficiently manage the cluster storage usage. For example,")]),e._v(" "),a("ol",[a("li",[e._v("For directories with storage policy configured, administrator should set storage type quotas for resource constraint storage types such as SSD and leave quotas for other storage types and overall space quota with either less restrictive values or default unlimited. HDFS will deduct quotas from both target storage type based on storage policy and the overall space quota.")]),e._v(" "),a("li",[e._v("For directories without storage policy configured, administrator should not configure storage type quota. Storage type quota can be configured even though the specific storage type is unavailable (or available but not configured properly with storage type information). However, overall space quota is recommended in this case as the storage type information is either unavailable or inaccurate for storage type quota enforcement.")]),e._v(" "),a("li",[e._v("Storage type quota on DISK are of limited use except when DISK is not the dominant storage medium. (e.g. cluster with predominantly ARCHIVE storage).")])]),e._v(" "),a("h2",{attrs:{id:"administrative-commands"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#administrative-commands","aria-hidden":"true"}},[e._v("#")]),e._v(" Administrative Commands")]),e._v(" "),a("p",[e._v("Quotas are managed by a set of commands available only to the administrator.")]),e._v(" "),a("ul",[a("li",[e._v("hdfs dfsadmin -setQuota "),a("N",[a("directory",[e._v("..."),a("directory")],1)],1)],1)]),e._v(" "),a("p",[e._v("Set the name quota to be N for each directory. Best effort for each directory, with faults reported if N is not a positive long integer, the directory does not exist or it is a file, or the directory would immediately exceed the new quota.")]),e._v(" "),a("ul",[a("li",[e._v("hdfs dfsadmin -clrQuota "),a("directory",[e._v("..."),a("directory")],1)],1)]),e._v(" "),a("p",[e._v("Remove any name quota for each directory. Best effort for each directory, with faults reported if the directory does not exist or it is a file. It is not a fault if the directory has no quota.")]),e._v(" "),a("ul",[a("li",[e._v("hdfs dfsadmin -setSpaceQuota "),a("N",[a("directory",[e._v("..."),a("directory")],1)],1)],1)]),e._v(" "),a("p",[e._v("Set the space quota to be N bytes for each directory. This is a hard limit on total size of all the files under the directory tree. The space quota takes replication also into account, i.e. one GB of data with replication of 3 consumes 3GB of quota. N can also be specified with a binary prefix for convenience, for e.g. 50g for 50 gigabytes and 2t for 2 terabytes etc. Best effort for each directory, with faults reported if N is neither zero nor a positive integer, the directory does not exist or it is a file, or the directory would immediately exceed the new quota.")]),e._v(" "),a("ul",[a("li",[e._v("hdfs dfsadmin -clrSpaceQuota "),a("directory",[e._v("..."),a("directory")],1)],1)]),e._v(" "),a("p",[e._v("Remove any space quota for each directory. Best effort for each directory, with faults reported if the directory does not exist or it is a file. It is not a fault if the directory has no quota.")]),e._v(" "),a("ul",[a("li",[e._v("hdfs dfsadmin -setSpaceQuota "),a("N",[e._v(" -storageType "),a("storagetype",[a("directory",[e._v("..."),a("directory")],1)],1)],1)],1)]),e._v(" "),a("p",[e._v("Set the storage type quota to be N bytes of storage type specified for each directory. This is a hard limit on total storage type usage for all the files under the directory tree. The storage type quota usage reflects the intended usage based on storage policy. For example, one GB of data with replication of 3 and ALL_SSD storage policy consumes 3GB of SSD quota. N can also be specified with a binary prefix for convenience, for e.g. 50g for 50 gigabytes and 2t for 2 terabytes etc. Best effort for each directory, with faults reported if N is neither zero nor a positive integer, the directory does not exist or it is a file, or the directory would immediately exceed the new quota. The storage type specific quota is set when -storageType option is specified. Available storageTypes are RAM_DISK,DISK,SSD,ARCHIVE.")]),e._v(" "),a("ul",[a("li",[e._v("hdfs dfsadmin -clrSpaceQuota -storageType "),a("storagetype",[a("directory",[e._v("..."),a("directory")],1)],1)],1)]),e._v(" "),a("p",[e._v("Remove storage type quota specified for each directory. Best effort for each directory, with faults reported if the directory does not exist or it is a file. It is not a fault if the directory has no storage type quota on for storage type specified. The storage type specific quota is cleared when -storageType option is specified. Available storageTypes are RAM_DISK,DISK,SSD,ARCHIVE.")]),e._v(" "),a("h2",{attrs:{id:"reporting-command"}},[a("a",{staticClass:"header-anchor",attrs:{href:"#reporting-command","aria-hidden":"true"}},[e._v("#")]),e._v(" Reporting Command")]),e._v(" "),a("p",[e._v("An an extension to the count command of the HDFS shell reports quota values and the current count of names and bytes in use.")]),e._v(" "),a("ul",[a("li",[e._v("hadoop fs -count -q [-h] [-v] [-t [comma-separated list of storagetypes]] "),a("directory",[e._v("..."),a("directory")],1)],1)]),e._v(" "),a("p",[e._v("With the -q option, also report the name quota value set for each directory, the available name quota remaining, the space quota value set, and the available space quota remaining. If the directory does not have a quota set, the reported values are none and inf. The -h option shows sizes in human readable format. The -v option displays a header line. The -t option displays the per storage type quota set and the available quota remaining for each directory. If specific storage types are given after -t option, only quota and remaining quota of the types specified will be displayed. Otherwise, quota and remaining quota of all storage types that support quota will be displayed.")])])}),[],!1,null,null,null);t.default=i.exports}}]);