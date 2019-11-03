(window.webpackJsonp=window.webpackJsonp||[]).push([[242],{442:function(e,t,n){"use strict";n.r(t);var o=n(0),a=Object(o.a)({},(function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("ContentSlotsDistributor",{attrs:{"slot-key":e.$parent.slotKey}},[n("h1",{attrs:{id:"nodemanager-rest-api’s"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#nodemanager-rest-api’s"}},[e._v("#")]),e._v(" NodeManager REST API’s")]),e._v(" "),n("h2",{attrs:{id:"overview"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#overview"}},[e._v("#")]),e._v(" Overview")]),e._v(" "),n("p",[e._v("The NodeManager REST API’s allow the user to get status on the node and information about applications and containers running on that node.")]),e._v(" "),n("h2",{attrs:{id:"enabling-cors-support"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#enabling-cors-support"}},[e._v("#")]),e._v(" Enabling CORS support")]),e._v(" "),n("p",[e._v("To enable cross-origin support (CORS) for the NM only(without enabling it for the RM), please set the following configuration parameters:")]),e._v(" "),n("p",[e._v("In core-site.xml, add org.apache.hadoop.security.HttpCrossOriginFilterInitializer to hadoop.http.filter.initializers. In yarn-site.xml, set yarn.nodemanager.webapp.cross-origin.enabled to true.")]),e._v(" "),n("h2",{attrs:{id:"nodemanager-information-api"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#nodemanager-information-api"}},[e._v("#")]),e._v(" NodeManager Information API")]),e._v(" "),n("p",[e._v("The node information resource provides overall information about that particular node.")]),e._v(" "),n("h3",{attrs:{id:"uri"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#uri"}},[e._v("#")]),e._v(" URI")]),e._v(" "),n("p",[e._v("Both of the following URI’s give you the cluster information.")]),e._v(" "),n("ul",[n("li",[n("a",{attrs:{href:"http://nm-http-address:port/ws/v1/node",target:"_blank",rel:"noopener noreferrer"}},[e._v("http://nm-http-address:port/ws/v1/node"),n("OutboundLink")],1),e._v(" "),n("ul",[n("li",[n("a",{attrs:{href:"http://nm-http-address:port/ws/v1/node/info",target:"_blank",rel:"noopener noreferrer"}},[e._v("http://nm-http-address:port/ws/v1/node/info"),n("OutboundLink")],1)])])])]),e._v(" "),n("h3",{attrs:{id:"http-operations-supported"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#http-operations-supported"}},[e._v("#")]),e._v(" HTTP Operations Supported")]),e._v(" "),n("ul",[n("li",[e._v("GET")])]),e._v(" "),n("h3",{attrs:{id:"query-parameters-supported"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#query-parameters-supported"}},[e._v("#")]),e._v(" Query Parameters Supported")]),e._v(" "),n("pre",[n("code",[e._v("  None\n")])]),e._v(" "),n("h3",{attrs:{id:"elements-of-the-nodeinfo-object"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#elements-of-the-nodeinfo-object"}},[e._v("#")]),e._v(" Elements of the nodeInfo object")]),e._v(" "),n("table",[n("thead",[n("tr",[n("th",[e._v("Properties")]),e._v(" "),n("th",[e._v("Data Type")]),e._v(" "),n("th",[e._v("Description")])])]),e._v(" "),n("tbody",[n("tr",[n("td",[e._v("id")]),e._v(" "),n("td",[e._v("long")]),e._v(" "),n("td",[e._v("The NodeManager id")])]),e._v(" "),n("tr",[n("td",[e._v("nodeHostName")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The host name of the NodeManager")])]),e._v(" "),n("tr",[n("td",[e._v("totalPmemAllocatedContainersMB")]),e._v(" "),n("td",[e._v("long")]),e._v(" "),n("td",[e._v("The amount of physical memory allocated for use by containers in MB")])]),e._v(" "),n("tr",[n("td",[e._v("totalVmemAllocatedContainersMB")]),e._v(" "),n("td",[e._v("long")]),e._v(" "),n("td",[e._v("The amount of virtual memory allocated for use by containers in MB")])]),e._v(" "),n("tr",[n("td",[e._v("totalVCoresAllocatedContainers")]),e._v(" "),n("td",[e._v("long")]),e._v(" "),n("td",[e._v("The number of virtual cores allocated for use by containers")])]),e._v(" "),n("tr",[n("td",[e._v("vmemCheckEnabled")]),e._v(" "),n("td",[e._v("boolean")]),e._v(" "),n("td",[e._v("Whether virtual memory checking is enabled for preemption")])]),e._v(" "),n("tr",[n("td",[e._v("pmemCheckEnabled")]),e._v(" "),n("td",[e._v("boolean")]),e._v(" "),n("td",[e._v("Whether physical memory checking is enabled for preemption")])]),e._v(" "),n("tr",[n("td",[e._v("lastNodeUpdateTime")]),e._v(" "),n("td",[e._v("long")]),e._v(" "),n("td",[e._v("The last timestamp at which the health report was received (in ms since epoch)")])]),e._v(" "),n("tr",[n("td",[e._v("nmStartupTime")]),e._v(" "),n("td",[e._v("long")]),e._v(" "),n("td",[e._v("The timestamp at which the node was started (in ms since epoch)")])]),e._v(" "),n("tr",[n("td",[e._v("healthReport")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The diagnostic health report of the node")])]),e._v(" "),n("tr",[n("td",[e._v("nodeHealthy")]),e._v(" "),n("td",[e._v("boolean")]),e._v(" "),n("td",[e._v("true/false indicator of if the node is healthy")])]),e._v(" "),n("tr",[n("td",[e._v("nodeManagerVersion")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("Version of the NodeManager")])]),e._v(" "),n("tr",[n("td",[e._v("nodeManagerBuildVersion")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("NodeManager build string with build version, user, and checksum")])]),e._v(" "),n("tr",[n("td",[e._v("nodeManagerVersionBuiltOn")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("Timestamp when NodeManager was built(in ms since epoch)")])]),e._v(" "),n("tr",[n("td",[e._v("hadoopVersion")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("Version of hadoop common")])]),e._v(" "),n("tr",[n("td",[e._v("hadoopBuildVersion")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("Hadoop common build string with build version, user, and checksum")])]),e._v(" "),n("tr",[n("td",[e._v("hadoopVersionBuiltOn")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("Timestamp when hadoop common was built(in ms since epoch)")])])])]),e._v(" "),n("h3",{attrs:{id:"response-examples"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#response-examples"}},[e._v("#")]),e._v(" Response Examples")]),e._v(" "),n("p",[e._v("JSON response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/node/info\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/json\n  Transfer-Encoding: chunked\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('{\n  "nodeInfo": {\n    "healthReport": "",\n    "totalVmemAllocatedContainersMB": 17203,\n    "totalPmemAllocatedContainersMB": 8192,\n    "totalVCoresAllocatedContainers": 8,\n    "vmemCheckEnabled": false,\n    "pmemCheckEnabled": true,\n    "lastNodeUpdateTime": 1485814574224,\n    "nodeHealthy": true,\n    "nodeManagerVersion": "3.0.0",\n    "nodeManagerBuildVersion": "3.0.0",\n    "nodeManagerVersionBuiltOn": "2017-01-30T17:42Z",\n    "hadoopVersion": "3.0.0",\n    "hadoopBuildVersion": "3.0.0",\n    "hadoopVersionBuiltOn": "2017-01-30T17:39Z",\n    "id": "host.domain.com:46077",\n    "nodeHostName": "host.domain.com",\n    "nmStartupTime": 1485800887841\n  }\n}\n')])]),e._v(" "),n("p",[e._v("XML response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  Accept: application/xml\n  GET http://nm-http-address:port/ws/v1/node/info\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/xml\n  Content-Length: 983\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('<?xml version="1.0" encoding="UTF-8" standalone="yes"?>\n<nodeInfo>\n    <healthReport></healthReport>\n    <totalVmemAllocatedContainersMB>17203</totalVmemAllocatedContainersMB>\n    <totalPmemAllocatedContainersMB>8192</totalPmemAllocatedContainersMB>\n    <totalVCoresAllocatedContainers>8</totalVCoresAllocatedContainers>\n    <vmemCheckEnabled>false</vmemCheckEnabled>\n    <pmemCheckEnabled>true</pmemCheckEnabled>\n    <lastNodeUpdateTime>1485815774203</lastNodeUpdateTime>\n    <nodeHealthy>true</nodeHealthy>\n    <nodeManagerVersion>3.0.0</nodeManagerVersion>\n    <nodeManagerBuildVersion>3.0.0</nodeManagerBuildVersion>\n    <nodeManagerVersionBuiltOn>2017-01-30T17:42Z</nodeManagerVersionBuiltOn>\n    <hadoopVersion>3.0.0</hadoopVersion>\n    <hadoopBuildVersion>3.0.0</hadoopBuildVersion>\n    <hadoopVersionBuiltOn>2017-01-30T17:39Z</hadoopVersionBuiltOn>\n    <id>host.domain.com:46077</id>\n    <nodeHostName>host.domain.com</nodeHostName>\n    <nmStartupTime>1485800887841</nmStartupTime>\n</nodeInfo>\n')])]),e._v(" "),n("h2",{attrs:{id:"applications-api"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#applications-api"}},[e._v("#")]),e._v(" Applications API")]),e._v(" "),n("p",[e._v("With the Applications API, you can obtain a collection of resources, each of which represents an application. When you run a GET operation on this resource, you obtain a collection of Application Objects. See also Application API for syntax of the application object.")]),e._v(" "),n("h3",{attrs:{id:"uri-2"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#uri-2"}},[e._v("#")]),e._v(" URI")]),e._v(" "),n("ul",[n("li",[n("a",{attrs:{href:"http://nm-http-address:port/ws/v1/node/apps",target:"_blank",rel:"noopener noreferrer"}},[e._v("http://nm-http-address:port/ws/v1/node/apps"),n("OutboundLink")],1)])]),e._v(" "),n("h3",{attrs:{id:"http-operations-supported-2"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#http-operations-supported-2"}},[e._v("#")]),e._v(" HTTP Operations Supported")]),e._v(" "),n("ul",[n("li",[e._v("GET")])]),e._v(" "),n("h3",{attrs:{id:"query-parameters-supported-2"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#query-parameters-supported-2"}},[e._v("#")]),e._v(" Query Parameters Supported")]),e._v(" "),n("p",[e._v("Multiple parameters can be specified.")]),e._v(" "),n("ul",[n("li",[e._v("state - application state\n"),n("ul",[n("li",[e._v("user - user name")])])])]),e._v(" "),n("h3",{attrs:{id:"elements-of-the-apps-applications-object"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#elements-of-the-apps-applications-object"}},[e._v("#")]),e._v(" Elements of the apps (Applications) object")]),e._v(" "),n("p",[e._v("When you make a request for the list of applications, the information will be returned as a collection of app objects. See also Application API for syntax of the app object.")]),e._v(" "),n("table",[n("thead",[n("tr",[n("th",[e._v("Properties")]),e._v(" "),n("th",[e._v("Data Type")]),e._v(" "),n("th",[e._v("Description")])])]),e._v(" "),n("tbody",[n("tr",[n("td",[e._v("app")]),e._v(" "),n("td",[e._v("array of app objects(JSON)/zero or more app objects(XML)")]),e._v(" "),n("td",[e._v("A collection of application objects")])])])]),e._v(" "),n("h3",{attrs:{id:"response-examples-2"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#response-examples-2"}},[e._v("#")]),e._v(" Response Examples")]),e._v(" "),n("p",[e._v("JSON response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/node/apps\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/json\n  Transfer-Encoding: chunked\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('{\n   "apps" : {\n      "app" : [\n         {\n            "containerids" : [\n               "container_1326121700862_0003_01_000001",\n               "container_1326121700862_0003_01_000002"\n            ],\n            "user" : "user1",\n            "id" : "application_1326121700862_0003",\n            "state" : "RUNNING"\n         },\n         {\n            "user" : "user1",\n            "id" : "application_1326121700862_0002",\n            "state" : "FINISHED"\n         }\n      ]\n   }\n}\n')])]),e._v(" "),n("p",[e._v("XML response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/node/apps\n  Accept: application/xml\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/xml\n  Content-Length: 400\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('<?xml version="1.0" encoding="UTF-8" standalone="yes"?>\n<apps>\n  <app>\n    <id>application_1326121700862_0002</id>\n    <state>FINISHED</state>\n    <user>user1</user>\n  </app>\n  <app>\n    <id>application_1326121700862_0003</id>\n    <state>RUNNING</state>\n    <user>user1</user>\n    <containerids>container_1326121700862_0003_01_000002</containerids>\n    <containerids>container_1326121700862_0003_01_000001</containerids>\n  </app>\n</apps>\n')])]),e._v(" "),n("h2",{attrs:{id:"application-api"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#application-api"}},[e._v("#")]),e._v(" Application API")]),e._v(" "),n("p",[e._v("An application resource contains information about a particular application that was run or is running on this NodeManager.")]),e._v(" "),n("h3",{attrs:{id:"uri-3"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#uri-3"}},[e._v("#")]),e._v(" URI")]),e._v(" "),n("p",[e._v("Use the following URI to obtain an app Object, for a application identified by the appid value.")]),e._v(" "),n("ul",[n("li",[n("a",{attrs:{href:"http://nm-http-address:port/ws/v1/node/apps/%7Bappid%7D",target:"_blank",rel:"noopener noreferrer"}},[e._v("http://nm-http-address:port/ws/v1/node/apps/{appid}"),n("OutboundLink")],1)])]),e._v(" "),n("h3",{attrs:{id:"http-operations-supported-3"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#http-operations-supported-3"}},[e._v("#")]),e._v(" HTTP Operations Supported")]),e._v(" "),n("ul",[n("li",[e._v("GET")])]),e._v(" "),n("h3",{attrs:{id:"query-parameters-supported-3"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#query-parameters-supported-3"}},[e._v("#")]),e._v(" Query Parameters Supported")]),e._v(" "),n("pre",[n("code",[e._v("  None\n")])]),e._v(" "),n("h3",{attrs:{id:"elements-of-the-app-application-object"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#elements-of-the-app-application-object"}},[e._v("#")]),e._v(" Elements of the app (Application) object")]),e._v(" "),n("table",[n("thead",[n("tr",[n("th",[e._v("Properties")]),e._v(" "),n("th",[e._v("Data Type")]),e._v(" "),n("th",[e._v("Description")])])]),e._v(" "),n("tbody",[n("tr",[n("td",[e._v("id")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The application id")])]),e._v(" "),n("tr",[n("td",[e._v("user")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The user who started the application")])]),e._v(" "),n("tr",[n("td",[e._v("state")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The state of the application - valid states are: NEW, INITING, RUNNING, FINISHING_CONTAINERS_WAIT, APPLICATION_RESOURCES_CLEANINGUP, FINISHED")])]),e._v(" "),n("tr",[n("td",[e._v("containerids")]),e._v(" "),n("td",[e._v("array of containerids(JSON)/zero or more containerids(XML)")]),e._v(" "),n("td",[e._v("The list of containerids currently being used by the application on this node. If not present then no containers are currently running for this application.")])])])]),e._v(" "),n("h3",{attrs:{id:"response-examples-3"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#response-examples-3"}},[e._v("#")]),e._v(" Response Examples")]),e._v(" "),n("p",[e._v("JSON response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/node/apps/application_1326121700862_0005\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/json\n  Transfer-Encoding: chunked\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('{\n   "app" : {\n      "containerids" : [\n         "container_1326121700862_0005_01_000003",\n         "container_1326121700862_0005_01_000001"\n      ],\n      "user" : "user1",\n      "id" : "application_1326121700862_0005",\n      "state" : "RUNNING"\n   }\n}\n')])]),e._v(" "),n("p",[e._v("XML response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/node/apps/application_1326121700862_0005\n  Accept: application/xml\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/xml\n  Content-Length: 281\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('<?xml version="1.0" encoding="UTF-8" standalone="yes"?>\n<app>\n  <id>application_1326121700862_0005</id>\n  <state>RUNNING</state>\n  <user>user1</user>\n  <containerids>container_1326121700862_0005_01_000003</containerids>\n  <containerids>container_1326121700862_0005_01_000001</containerids>\n</app>\n')])]),e._v(" "),n("h2",{attrs:{id:"containers-api"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#containers-api"}},[e._v("#")]),e._v(" Containers API")]),e._v(" "),n("p",[e._v("With the containers API, you can obtain a collection of resources, each of which represents a container. When you run a GET operation on this resource, you obtain a collection of Container Objects. See also Container API for syntax of the container object.")]),e._v(" "),n("h3",{attrs:{id:"uri-4"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#uri-4"}},[e._v("#")]),e._v(" URI")]),e._v(" "),n("ul",[n("li",[n("a",{attrs:{href:"http://nm-http-address:port/ws/v1/node/containers",target:"_blank",rel:"noopener noreferrer"}},[e._v("http://nm-http-address:port/ws/v1/node/containers"),n("OutboundLink")],1)])]),e._v(" "),n("h3",{attrs:{id:"http-operations-supported-4"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#http-operations-supported-4"}},[e._v("#")]),e._v(" HTTP Operations Supported")]),e._v(" "),n("ul",[n("li",[e._v("GET")])]),e._v(" "),n("h3",{attrs:{id:"query-parameters-supported-4"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#query-parameters-supported-4"}},[e._v("#")]),e._v(" Query Parameters Supported")]),e._v(" "),n("pre",[n("code",[e._v("  None\n")])]),e._v(" "),n("h3",{attrs:{id:"elements-of-the-containers-object"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#elements-of-the-containers-object"}},[e._v("#")]),e._v(" Elements of the containers object")]),e._v(" "),n("p",[e._v("When you make a request for the list of containers, the information will be returned as collection of container objects. See also Container API for syntax of the container object.")]),e._v(" "),n("table",[n("thead",[n("tr",[n("th",[e._v("Properties")]),e._v(" "),n("th",[e._v("Data Type")]),e._v(" "),n("th",[e._v("Description")])])]),e._v(" "),n("tbody",[n("tr",[n("td",[e._v("containers")]),e._v(" "),n("td",[e._v("array of container objects(JSON)/zero or more container objects(XML)")]),e._v(" "),n("td",[e._v("A collection of container objects")])])])]),e._v(" "),n("h3",{attrs:{id:"response-examples-4"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#response-examples-4"}},[e._v("#")]),e._v(" Response Examples")]),e._v(" "),n("p",[e._v("JSON response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/node/containers\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/json\n  Transfer-Encoding: chunked\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('{\n   "containers" : {\n      "container" : [\n         {\n            "nodeId" : "host.domain.com:8041",\n            "totalMemoryNeededMB" : 2048,\n            "totalVCoresNeeded" : 1,\n            "state" : "RUNNING",\n            "diagnostics" : "",\n            "containerLogsLink" : "http://host.domain.com:8042/node/containerlogs/container_1326121700862_0006_01_000001/user1",\n            "user" : "user1",\n            "id" : "container_1326121700862_0006_01_000001",\n            "exitCode" : -1000,\n            "executionType": "GUARANTEED",\n            "containerLogFiles": [\n              "stdout",\n              "stderr",\n              "syslog"\n            ]\n         },\n         {\n            "nodeId" : "host.domain.com:8041",\n            "totalMemoryNeededMB" : 2048,\n            "totalVCoresNeeded" : 2,\n            "state" : "RUNNING",\n            "diagnostics" : "",\n            "containerLogsLink" : "http://host.domain.com:8042/node/containerlogs/container_1326121700862_0006_01_000003/user1",\n            "user" : "user1",\n            "id" : "container_1326121700862_0006_01_000003",\n            "exitCode" : -1000,\n            "executionType": "GUARANTEED",\n            "containerLogFiles": [\n              "stdout",\n              "stderr",\n              "syslog"\n            ]\n         }\n      ]\n   }\n}\n')])]),e._v(" "),n("p",[e._v("XML response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/node/containers\n  Accept: application/xml\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/xml\n  Content-Length: 988\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('<?xml version="1.0" encoding="UTF-8" standalone="yes"?>\n<containers>\n  <container>\n    <id>container_1326121700862_0006_01_000001</id>\n    <state>RUNNING</state>\n    <exitCode>-1000</exitCode>\n    <diagnostics/>\n    <user>user1</user>\n    <totalMemoryNeededMB>2048</totalMemoryNeededMB>\n    <totalVCoresNeeded>1</totalVCoresNeeded>\n    <containerLogsLink>http://host.domain.com:8042/node/containerlogs/container_1326121700862_0006_01_000001/user1</containerLogsLink>\n    <nodeId>host.domain.com:8041</nodeId>\n    <executionType>GUARANTEED</executionType>\n    <containerLogFiles>stdout</containerLogFiles>\n    <containerLogFiles>stderr</containerLogFiles>\n    <containerLogFiles>syslog</containerLogFiles>\n  </container>\n  <container>\n    <id>container_1326121700862_0006_01_000003</id>\n    <state>DONE</state>\n    <exitCode>0</exitCode>\n    <diagnostics>Container killed by the ApplicationMaster.</diagnostics>\n    <user>user1</user>\n    <totalMemoryNeededMB>2048</totalMemoryNeededMB>\n    <totalVCoresNeeded>2</totalVCoresNeeded>\n    <containerLogsLink>http://host.domain.com:8042/node/containerlogs/container_1326121700862_0006_01_000003/user1</containerLogsLink>\n    <nodeId>host.domain.com:8041</nodeId>\n    <executionType>GUARANTEED</executionType>\n    <containerLogFiles>stdout</containerLogFiles>\n    <containerLogFiles>stderr</containerLogFiles>\n    <containerLogFiles>syslog</containerLogFiles>\n  </container>\n</containers>\n')])]),e._v(" "),n("h2",{attrs:{id:"container-api"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#container-api"}},[e._v("#")]),e._v(" Container API")]),e._v(" "),n("p",[e._v("A container resource contains information about a particular container that is running on this NodeManager.")]),e._v(" "),n("h3",{attrs:{id:"uri-5"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#uri-5"}},[e._v("#")]),e._v(" URI")]),e._v(" "),n("p",[e._v("Use the following URI to obtain a Container Object, from a container identified by the containerid value.")]),e._v(" "),n("ul",[n("li",[n("a",{attrs:{href:"http://nm-http-address:port/ws/v1/node/containers/%7Bcontainerid%7D",target:"_blank",rel:"noopener noreferrer"}},[e._v("http://nm-http-address:port/ws/v1/node/containers/{containerid}"),n("OutboundLink")],1)])]),e._v(" "),n("h3",{attrs:{id:"http-operations-supported-5"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#http-operations-supported-5"}},[e._v("#")]),e._v(" HTTP Operations Supported")]),e._v(" "),n("ul",[n("li",[e._v("GET")])]),e._v(" "),n("h3",{attrs:{id:"query-parameters-supported-5"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#query-parameters-supported-5"}},[e._v("#")]),e._v(" Query Parameters Supported")]),e._v(" "),n("pre",[n("code",[e._v("  None\n")])]),e._v(" "),n("h3",{attrs:{id:"elements-of-the-container-object"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#elements-of-the-container-object"}},[e._v("#")]),e._v(" Elements of the container object")]),e._v(" "),n("table",[n("thead",[n("tr",[n("th",[e._v("Properties")]),e._v(" "),n("th",[e._v("Data Type")]),e._v(" "),n("th",[e._v("Description")])])]),e._v(" "),n("tbody",[n("tr",[n("td",[e._v("id")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The container id")])]),e._v(" "),n("tr",[n("td",[e._v("state")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("State of the container - valid states are: NEW, LOCALIZING, LOCALIZATION_FAILED, LOCALIZED, RUNNING, EXITED_WITH_SUCCESS, EXITED_WITH_FAILURE, KILLING, CONTAINER_CLEANEDUP_AFTER_KILL, CONTAINER_RESOURCES_CLEANINGUP, DONE")])]),e._v(" "),n("tr",[n("td",[e._v("nodeId")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The id of the node the container is on")])]),e._v(" "),n("tr",[n("td",[e._v("containerLogsLink")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The http link to the container logs")])]),e._v(" "),n("tr",[n("td",[e._v("user")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("The user name of the user which started the container")])]),e._v(" "),n("tr",[n("td",[e._v("exitCode")]),e._v(" "),n("td",[e._v("int")]),e._v(" "),n("td",[e._v("Exit code of the container")])]),e._v(" "),n("tr",[n("td",[e._v("diagnostics")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("A diagnostic message for failed containers")])]),e._v(" "),n("tr",[n("td",[e._v("totalMemoryNeededMB")]),e._v(" "),n("td",[e._v("long")]),e._v(" "),n("td",[e._v("Total amout of memory needed by the container (in MB)")])]),e._v(" "),n("tr",[n("td",[e._v("totalVCoresNeeded")]),e._v(" "),n("td",[e._v("long")]),e._v(" "),n("td",[e._v("Total number of virtual cores needed by the container")])]),e._v(" "),n("tr",[n("td",[e._v("executionType")]),e._v(" "),n("td",[e._v("string")]),e._v(" "),n("td",[e._v("Container type of GUARANTEED or OPPORTUNISTIC")])]),e._v(" "),n("tr",[n("td",[e._v("containerLogFiles")]),e._v(" "),n("td",[e._v("array of strings")]),e._v(" "),n("td",[e._v("Container log file names")])])])]),e._v(" "),n("h3",{attrs:{id:"response-examples-5"}},[n("a",{staticClass:"header-anchor",attrs:{href:"#response-examples-5"}},[e._v("#")]),e._v(" Response Examples")]),e._v(" "),n("p",[e._v("JSON response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/nodes/containers/container_1326121700862_0007_01_000001\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/json\n  Transfer-Encoding: chunked\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('{\n   "container" : {\n      "nodeId" : "host.domain.com:8041",\n      "totalMemoryNeededMB" : 2048,\n      "totalVCoresNeeded" : 1,\n      "state" : "RUNNING",\n      "diagnostics" : "",\n      "containerLogsLink" : "http://host.domain.com:8042/node/containerlogs/container_1326121700862_0007_01_000001/user1",\n      "user" : "user1",\n      "id" : "container_1326121700862_0007_01_000001",\n      "exitCode" : -1000,\n      "executionType": "GUARANTEED",\n      "containerLogFiles": [\n        "stdout",\n        "stderr",\n        "syslog"\n      ]\n   }\n}\n')])]),e._v(" "),n("p",[e._v("XML response")]),e._v(" "),n("p",[e._v("HTTP Request:")]),e._v(" "),n("pre",[n("code",[e._v("  GET http://nm-http-address:port/ws/v1/node/containers/container_1326121700862_0007_01_000001\n  Accept: application/xml\n")])]),e._v(" "),n("p",[e._v("Response Header:")]),e._v(" "),n("pre",[n("code",[e._v("  HTTP/1.1 200 OK\n  Content-Type: application/xml\n  Content-Length: 491\n  Server: Jetty(6.1.26)\n")])]),e._v(" "),n("p",[e._v("Response Body:")]),e._v(" "),n("pre",[n("code",[e._v('<?xml version="1.0" encoding="UTF-8" standalone="yes"?>\n<container>\n  <id>container_1326121700862_0007_01_000001</id>\n  <state>RUNNING</state>\n  <exitCode>-1000</exitCode>\n  <diagnostics/>\n  <user>user1</user>\n  <totalMemoryNeededMB>2048</totalMemoryNeededMB>\n  <totalVCoresNeeded>1</totalVCoresNeeded>\n  <containerLogsLink>http://host.domain.com:8042/node/containerlogs/container_1326121700862_0007_01_000001/user1</containerLogsLink>\n  <nodeId>host.domain.com:8041</nodeId>\n  <executionType>GUARANTEED</executionType>\n  <containerLogFiles>stdout</containerLogFiles>\n  <containerLogFiles>stderr</containerLogFiles>\n  <containerLogFiles>syslog</containerLogFiles>\n</container>\n')])])])}),[],!1,null,null,null);t.default=a.exports}}]);