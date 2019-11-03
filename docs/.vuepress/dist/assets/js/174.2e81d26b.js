(window.webpackJsonp=window.webpackJsonp||[]).push([[174],{371:function(e,t,r){"use strict";r.r(t);var o=r(0),s=Object(o.a)({},(function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("ContentSlotsDistributor",{attrs:{"slot-key":e.$parent.slotKey}},[r("h1",{attrs:{id:"credentialprovider-api-guide"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#credentialprovider-api-guide"}},[e._v("#")]),e._v(" CredentialProvider API Guide")]),e._v(" "),r("h2",{attrs:{id:"overview"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#overview"}},[e._v("#")]),e._v(" Overview")]),e._v(" "),r("p",[e._v("The CredentialProvider API is an SPI framework for plugging in extensible credential providers. Credential providers are used to separate the use of sensitive tokens, secrets and passwords from the details of their storage and management. The ability to choose various storage mechanisms for protecting these credentials allows us to keep such sensitive assets out of clear text, away from prying eyes and potentially to be managed by third party solutions.")]),e._v(" "),r("p",[e._v("This document aims to describe the design of the CredentialProvider API, the out of the box implementations, where they are used and how to adopt their use.")]),e._v(" "),r("h2",{attrs:{id:"usage"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#usage"}},[e._v("#")]),e._v(" Usage")]),e._v(" "),r("h3",{attrs:{id:"usage-overview"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#usage-overview"}},[e._v("#")]),e._v(" Usage Overview")]),e._v(" "),r("p",[e._v("Let’s provide a quick overview of the use of the credential provider framework for protecting passwords or other sensitive tokens in hadoop.")]),e._v(" "),r("h5",{attrs:{id:"why-is-it-used"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#why-is-it-used"}},[e._v("#")]),e._v(" Why is it used?")]),e._v(" "),r("p",[e._v("There are certain deployments that are very sensitive to how sensitive tokens like passwords are stored and managed within the cluster. For instance, there may be security best practices and policies in place that require such things to never be stored in clear text, for example. Enterprise deployments may be required to use a preferred solution for managing credentials and we need a way to plug in integrations for them.")]),e._v(" "),r("h5",{attrs:{id:"general-usage-pattern"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#general-usage-pattern"}},[e._v("#")]),e._v(" General Usage Pattern")]),e._v(" "),r("p",[e._v("There are numerous places within the Hadoop project and ecosystem that can leverage the credential provider API today and the number continues to grow. In general, the usage pattern consists of the same requirements and flow.")]),e._v(" "),r("ol",[r("li",[e._v("Provision credentials within provider specific stores. This provisioning may be accomplished through the hadoop credential command or possibly through provider specific management tools.")]),e._v(" "),r("li",[e._v("Configure the credential provider path property. The provider path property hadoop.security.credential.provider.path is a comma separated list of one or more credential provider URIs that is traversed while trying to resolve a credential alias.")])]),e._v(" "),r("pre",[r("code",[e._v("* This property may be configured within core-site.xml or a component specific configuration file that is merged with core-site.xml.\n* For command line interfaces, such as that for DistCp, the property can be added with a hadoop system property (“-D property=value”) and dynamically added to the Configuration.\n")])]),e._v(" "),r("ol",{attrs:{start:"3"}},[r("li",[e._v("Features or components that leverage the new "),r("router-link",{attrs:{to:"/en/docs/api/org/apache/hadoop/conf/Configuration.html#getPassword-java.lang.String-"}},[e._v("Configuration.getPassword")]),e._v(" method to resolve their credentials will automatically pick up support for the credential provider API.")],1)]),e._v(" "),r("pre",[r("code",[e._v("* By using the same property names as are used for existing clear text passwords, this mechanism allows for the migration to credential providers while providing backward compatibility for clear text.\n* The entire credential provider path is interrogated before falling back to clear text passwords in config.\n")])]),e._v(" "),r("ol",{attrs:{start:"4"}},[r("li",[e._v("Features or components that do not use Hadoop’s org.apache.hadoop.conf.Configuration class for configuration or have other internal uses for the credential providers may choose to use the CredentialProvider API itself. An example of its use can be found within "),r("router-link",{attrs:{to:"/en/docs/api/org/apache/hadoop/conf/Configuration.html#getPassword-java.lang.String-"}},[e._v("Configuration.getPassword")]),e._v(" and within its unit tests.")],1)]),e._v(" "),r("h5",{attrs:{id:"provision-credentials"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#provision-credentials"}},[e._v("#")]),e._v(" Provision Credentials")]),e._v(" "),r("p",[e._v("Example: ssl.server.keystore.password")]),e._v(" "),r("pre",[r("code",[e._v("hadoop credential create ssl.server.keystore.password -value 123 \\\n  -provider localjceks://file/home/lmccay/aws.jceks\n")])]),e._v(" "),r("p",[e._v("The alias names are the same as the configuration properties that were used to get the credentials from the Configuration.get() methods.")]),e._v(" "),r("h5",{attrs:{id:"configuring-the-provider-path"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#configuring-the-provider-path"}},[e._v("#")]),e._v(" Configuring the Provider Path")]),e._v(" "),r("p",[e._v("Now, we need to make sure that this provisioned credential store is known at runtime by the "),r("router-link",{attrs:{to:"/en/docs/api/org/apache/hadoop/conf/Configuration.html#getPassword-java.lang.String-"}},[e._v("Configuration.getPassword")]),e._v(" method. If there is no credential provider path configuration then Configuration.getPassword() will skip the credential provider API interrogation. So, it is important that the following be configured within core-site.xml or your component’s equivalent.")],1),e._v(" "),r("pre",[r("code",[e._v("<property>\n  <name>hadoop.security.credential.provider.path</name>\n  <value>localjceks://file/home/lmccay/aws.jceks</value>\n  <description>Path to interrogate for protected credentials.</description>\n</property>\n")])]),e._v(" "),r("p",[e._v("A couple additional things to note about the provider path:")]),e._v(" "),r("ol",[r("li",[e._v("The scheme is used to indicate the type of provider in the above case the localjceks provider does not have a dependency on the Hadoop FileSystem APIs. and is needed sometimes to avoid a recursive dependency. Another provider represented by jceks, does use the Hadoop FileSystem APIs and can support keystores provisioned within HDFS or other compatible filesystems. A third provider type is the user type. This provider can manage credentials stored within the Credentials file for a process.")]),e._v(" "),r("li",[e._v("The path configuration accepts a comma separated path of providers or credential stores. The "),r("router-link",{attrs:{to:"/en/docs/api/org/apache/hadoop/conf/Configuration.html#getPassword-java.lang.String-"}},[e._v("Configuration.getPassword")]),e._v(" method will query each of the providers, in order until it resolves the alias or exhausts the list. Depending on the runtime needs for credentials, we may need to configure a chain of providers to check.")],1)]),e._v(" "),r("p",[e._v("In summary, first, provision the credentials into a provider then configure the provider for use by a feature or component and it will often just be picked up through the use of the "),r("router-link",{attrs:{to:"/en/docs/api/org/apache/hadoop/conf/Configuration.html#getPassword-java.lang.String-"}},[e._v("Configuration.getPassword")]),e._v(" method.")],1),e._v(" "),r("h5",{attrs:{id:"supported-features"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#supported-features"}},[e._v("#")]),e._v(" Supported Features")]),e._v(" "),r("table",[r("thead",[r("tr",[r("th",[e._v("Feature\\Component")]),e._v(" "),r("th",[e._v("Description")]),e._v(" "),r("th",[e._v("Link")])])]),e._v(" "),r("tbody",[r("tr",[r("td",[e._v("LDAPGroupsMapping")]),e._v(" "),r("td",[e._v("LDAPGroupsMapping is used to look up the groups for a given user in LDAP. The CredentialProvider API is used to protect the LDAP bind password and those needed for SSL.")]),e._v(" "),r("td",[r("router-link",{attrs:{to:"/en/docs/hadoop-project-dist/hadoop-common/GroupsMapping.html#LDAP_Groups_Mapping"}},[e._v("LDAP Groups Mapping")])],1)]),e._v(" "),r("tr",[r("td",[e._v("SSL Passwords")]),e._v(" "),r("td",[e._v("FileBasedKeyStoresFactory leverages the credential provider API in order to resolve the SSL related passwords.")]),e._v(" "),r("td",[e._v("TODO")])]),e._v(" "),r("tr",[r("td",[e._v("HDFS")]),e._v(" "),r("td",[e._v("DFSUtil uses Configuration.getPassword() use the credential provider API and/or fallback to the clear text value stored in ssl-server.xml. Zookeeper-based federation state store and failover controller use Configuration.getPassword to get the Zookeeper authentication info, with fallback provided to clear text auth info.")]),e._v(" "),r("td",[e._v("TODO")])]),e._v(" "),r("tr",[r("td",[e._v("YARN")]),e._v(" "),r("td",[e._v("WebAppUtils uptakes the use of the credential provider API through the new method on Configuration called getPassword. This provides an alternative to storing the passwords in clear text within the ssl-server.xml file while maintaining backward compatibility. Zookeeper based resource manager state store uses Configuration.getPassword to get the Zookeeper authentication info, with fallback provided to clear text auth info.")]),e._v(" "),r("td",[e._v("TODO")])]),e._v(" "),r("tr",[r("td",[e._v("KMS")]),e._v(" "),r("td",[e._v("Uses HttpServer2.loadSSLConfiguration that leverages Configuration.getPassword to read SSL related credentials. They may be resolved through Credential Provider and/or from the clear text in the config when allowed.")]),e._v(" "),r("td",[r("router-link",{attrs:{to:"/en/docs/hadoop-kms/index.html"}},[e._v("KMS")])],1)]),e._v(" "),r("tr",[r("td",[e._v("HttpFS")]),e._v(" "),r("td",[e._v("Uses HttpServer2.loadSSLConfiguration that leverages Configuration.getPassword to read SSL related credentials. They may be resolved through Credential Provider and/or from the clear text in the config when allowed.")]),e._v(" "),r("td",[r("router-link",{attrs:{to:"/en/docs/hadoop-hdfs-httpfs/ServerSetup.html"}},[e._v("HttpFS Server Setup")])],1)])])]),e._v(" "),r("p",[e._v("AWS"),r("br"),e._v("\nS3A  | Uses Configuration.getPassword to get the S3 credentials. They may be resolved through the credential provider API or from the config for backward compatibility. | "),r("router-link",{attrs:{to:"/en/docs/hadoop-aws/tools/hadoop-aws/index.html"}},[e._v("AWS S3/S3A Usage")]),r("br"),e._v("\nAzure"),r("br"),e._v("\nWASB  | Uses Configuration.getPassword to get the WASB credentials. They may be resolved through the credential provider API or from the config for backward compatibility. | "),r("router-link",{attrs:{to:"/en/docs/hadoop-azure/index.html"}},[e._v("Azure WASB Usage")]),r("br"),e._v("\nAzure"),r("br"),e._v("\nADLS  | Uses Configuration.getPassword to get the ADLS credentials. They may be resolved through the credential provider API or from the config for backward compatibility. | "),r("router-link",{attrs:{to:"/en/docs/hadoop-azure-datalake/index.html"}},[e._v("Azure ADLS Usage")]),r("br"),e._v("\nApache"),r("br"),e._v("\nAccumulo | The trace.password property is used by the Tracer to authenticate with Accumulo and persist the traces in the trace table. The credential provider API is used to acquire the trace.password from a provider or from configuration for backward compatibility. | TODO"),r("br"),e._v("\nApache"),r("br"),e._v("\nSlider  | A capability has been added to Slider to prompt the user for needed passwords and store them using CredentialProvider so they can be retrieved by an app later. | TODO"),r("br"),e._v("\nApache"),r("br"),e._v("\nHive  | Protection of the metastore password, SSL related passwords and JDO string password has been added through the use of the Credential Provider API | TODO"),r("br"),e._v("\nApache"),r("br"),e._v("\nHBase  | The HBase RESTServer is using the new Configuration.getPassword method so that the credential provider API will be checked first then fall back to clear text - when allowed. | TODO"),r("br"),e._v("\nApache"),r("br"),e._v("\nOozie  | Protects SSL, email and JDBC passwords using the credential provider API. | TODO"),r("br"),e._v("\nApache"),r("br"),e._v("\nRanger  | Protects database, trust and keystore passwords using the credential provider API. | TODO")],1),e._v(" "),r("h3",{attrs:{id:"credential-management"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#credential-management"}},[e._v("#")]),e._v(" Credential Management")]),e._v(" "),r("h4",{attrs:{id:"the-hadoop-credential-command"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#the-hadoop-credential-command"}},[e._v("#")]),e._v(" The hadoop credential Command")]),e._v(" "),r("p",[e._v("Usage: hadoop credential "),r("subcommand",[e._v(" [options]")])],1),e._v(" "),r("p",[e._v("See the command options detail in the "),r("router-link",{attrs:{to:"/en/docs/hadoop-project-dist/hadoop-common/CommandsManual.html#credential"}},[e._v("Commands Manual")])],1),e._v(" "),r("p",[e._v("The credential command can be for provisioning a password or secret to a particular credential store provider. In order to explicitly indicate which provider store to use the -provider option should be used.")]),e._v(" "),r("p",[e._v("Example: hadoop credential create ssl.server.keystore.password -provider jceks://file/tmp/test.jceks")]),e._v(" "),r("p",[e._v("In order to indicate a particular provider type and location, the user must provide the hadoop.security.credential.provider.path configuration element in core-site.xml or use the command line option -provider on each of the credential management commands. This provider path is a comma-separated list of URLs that indicates the type and location of a list of providers that should be consulted. For example, the following path: user:///,jceks://file/tmp/test.jceks,jceks://hdfs@nn1.example.com/my/path/test.jceks indicates that the current user’s credentials file should be consulted through the User Provider, that the local file located at /tmp/test.jceks is a Java Keystore Provider and that the file located within HDFS at nn1.example.com/my/path/test.jceks is also a store for a Java Keystore Provider.")]),e._v(" "),r("h4",{attrs:{id:"provider-types"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#provider-types"}},[e._v("#")]),e._v(" Provider Types")]),e._v(" "),r("ol",[r("li",[e._v("The UserProvider, which is represented by the provider URI user:///, is used to retrieve credentials from a user’s Credentials file. This file is used to store various tokens, secrets and passwords that are needed by executing jobs and applications.")]),e._v(" "),r("li",[e._v("The JavaKeyStoreProvider, which is represented by the provider URI jceks://SCHEME/path-to-keystore, is used to retrieve credentials from a Java keystore file in a filesystem "),r("SCHEME",[e._v(" The underlying use of the Hadoop filesystem API allows credentials to be stored on the local filesystem or within cluster stores.")])],1),e._v(" "),r("li",[e._v("The LocalJavaKeyStoreProvider, which is represented by the provider URI localjceks://file/path-to-keystore, is used to access credentials from a Java keystore that is must be stored on the local filesystem. This is needed for credentials that would result in a recursive dependency on accessing HDFS. Anytime that your credential is required to gain access to HDFS we can’t depend on getting a credential out of HDFS to do so.")])]),e._v(" "),r("p",[e._v("When credentials are stored in a filesystem, the following rules apply:")]),e._v(" "),r("ul",[r("li",[r("p",[e._v("Credentials stored in local localjceks:// files are loaded in the process reading in the configuration. For use in a YARN application, this means that they must be visible across the entire cluster, in the local filesystems of the hosts.")])]),e._v(" "),r("li",[r("p",[e._v("Credentials stored with the jceks:// provider can be stored in the cluster filesystem, and so visible across the cluster —but not in the filesystem which requires the specific credentials for their access.")])])]),e._v(" "),r("p",[e._v("To wrap filesystem URIs with a jceks URI follow these steps:")]),e._v(" "),r("ol",[r("li",[e._v("Take a filesystem URI such as hdfs://namenode:9001/users/alice/secrets.jceks")]),e._v(" "),r("li",[e._v("Place jceks:// in front of the URL: jceks://hdfs://namenode:9001/users/alice/secrets.jceks")]),e._v(" "),r("li",[e._v("Replace the second 😕/ string with an @ symbol: jceks://hdfs@namenode:9001/users/alice/secrets.jceks")])]),e._v(" "),r("p",[e._v("Examples")]),e._v(" "),r("p",[e._v("For a local filesystem, a path such as file:///tmp/secrets.jceks would become: jceks://file/tmp/secrets.jceks")]),e._v(" "),r("table",[r("thead",[r("tr",[r("th",[e._v("Path URI")]),e._v(" "),r("th",[e._v("jceks URI")])])]),e._v(" "),r("tbody",[r("tr",[r("td",[e._v("hdfs://namenode.example.org:9001/user/alice/secret.jceks")]),e._v(" "),r("td",[e._v("jceks://hdfs@namenode.example.org:9001/user/alice/secret.jceks")])]),e._v(" "),r("tr",[r("td",[e._v("file:///tmp/secrets.jceks")]),e._v(" "),r("td",[e._v("jceks://file/tmp/secret.jceks")])]),e._v(" "),r("tr",[r("td",[e._v("s3a://container1/secrets/secret.jceks")]),e._v(" "),r("td",[e._v("jceks://s3a@container1/secrets/secret.jceks")])]),e._v(" "),r("tr",[r("td",[e._v("wasb://account@container/secret.jceks")]),e._v(" "),r("td",[e._v("jceks://wasb@account@container/secret.jceks")])]),e._v(" "),r("tr",[r("td",[e._v("abfs://account@container/secret.jceks")]),e._v(" "),r("td",[e._v("jceks://abfs@account@container/secret.jceks")])]),e._v(" "),r("tr",[r("td",[e._v("https://user:pass@service/secret.jceks?token=aia")]),e._v(" "),r("td",[e._v("jceks://https@user:pass@service/secret.jceks?token=aia")])])])]),e._v(" "),r("p",[e._v("Note that to avoid infinite recursion, filesystems such as abfs, s3a, adls and wasb explicitly exclude keystores stored on paths in their own filesystem schemes, even if they are stored in a container which uses a different set of credentials from those being looked up.")]),e._v(" "),r("p",[e._v("As an example, you cannot use credentials stored in s3a://shared/secrets/secret.jceks to read the credentials for the container s3a://private/ .")]),e._v(" "),r("h4",{attrs:{id:"keystore-passwords"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#keystore-passwords"}},[e._v("#")]),e._v(" Keystore Passwords")]),e._v(" "),r("p",[e._v("Keystores in Java are generally protected by passwords. The primary method of protection of the keystore-based credential providers are OS-level file permissions and any other policy based access protection that may exist for the target filesystem. While the password is not a primary source of protection, it is very important to understand the mechanics required and options available for managing these passwords. It is also very important to understand all the parties that will need access to the password used to protect the keystores in order to consume them at runtime.")]),e._v(" "),r("h5",{attrs:{id:"options"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#options"}},[e._v("#")]),e._v(" Options")]),e._v(" "),r("table",[r("thead",[r("tr",[r("th",[e._v("Option")]),e._v(" "),r("th",[e._v("Description")]),e._v(" "),r("th",[e._v("Notes")])])]),e._v(" "),r("tbody",[r("tr",[r("td",[e._v("Default password")]),e._v(" "),r("td",[e._v("This is a harcoded password of “none”.")]),e._v(" "),r("td",[e._v("This is a hardcoded password in an open source project and as such has obvious disadvantages. However, the mechanics section will show that it is simpler and consequently nearly as secure as the other more complex options.")])]),e._v(" "),r("tr",[r("td",[e._v("Environment variable")]),e._v(" "),r("td",[e._v("HADOOP_CREDSTORE_PASSWORD")]),e._v(" "),r("td",[e._v("This option uses an environment variable to communicate the password that should be used when interrogating all of the keystores that are configured in the hadoop.security.credential.provider.path configuration property. All of the keystore based providers in the path will need to be protected by the same password.")])]),e._v(" "),r("tr",[r("td",[e._v("Password-file")]),e._v(" "),r("td",[e._v("hadoop.security.credstore.java-keystore-provider.password-file")]),e._v(" "),r("td",[e._v("This option uses a “side file” that has its location configured in the hadoop.security.credstore.java-keystore-provider.password-file configuration property to communicate the password that should be used when interrogating all of the keystores that are configured in the hadoop.security.credential.provider.path configuration property.")])])])]),e._v(" "),r("h5",{attrs:{id:"mechanics"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#mechanics"}},[e._v("#")]),e._v(" Mechanics")]),e._v(" "),r("p",[e._v("Extremely important to consider that all of the runtime consumers of the credential being protected (mapreduce jobs/applications) will need to have access to the password used to protect the keystore providers. Communicating this password can be done a number of ways and they are described in the Options section above.")]),e._v(" "),r("table",[r("thead",[r("tr",[r("th",[e._v("Keystore Password")]),e._v(" "),r("th",[e._v("Description")]),e._v(" "),r("th",[e._v("Sync Required")]),e._v(" "),r("th",[e._v("Clear Text")]),e._v(" "),r("th",[e._v("File Permissions")])])]),e._v(" "),r("tbody",[r("tr",[r("td",[e._v("Default Password")]),e._v(" "),r("td",[e._v("Hardcoded password is the default. Essentially, when using the default password for all keystore-based credential stores, we are leveraging the file permissions to protect the credential store and the keystore password is just a formality of persisting the keystore.")]),e._v(" "),r("td",[e._v("No")]),e._v(" "),r("td",[e._v("Yes")]),e._v(" "),r("td",[e._v("No (documented)")])]),e._v(" "),r("tr",[r("td",[e._v("Environment Variable")]),e._v(" "),r("td",[e._v("The HADOOP_CREDSTORE_PASSWORD environment variable must be set to the custom password for all keystores that may be configured in the provider path of any process that needs to access credentials from a keystore-based credential provider. There is only one env variable for the entire path of comma-separated providers. It is difficult to know the passwords required for each keystore and it is suggested that the same be used for all keystore-based credential providers to avoid this issue. Setting the environment variable will likely require it to be set from a script or some other clear text storage mechanism. Environment variables for running processes are available from various unix commands.")]),e._v(" "),r("td",[e._v("Yes")]),e._v(" "),r("td",[e._v("Yes")]),e._v(" "),r("td",[e._v("No")])]),e._v(" "),r("tr",[r("td",[e._v("Password File")]),e._v(" "),r("td",[e._v("hadoop.security.credstore.java-keystore-provider.password-file configuration property must be set to the location of the “side file” that contains the custom password for all keystores that may be configured in the provider path. Any process that needs to access credentials from a keystore-based credential provider will need to have this configuration property set to the appropriate file location. There is only one password-file for the entire path of comma separated providers. It is difficult to know the passwords required for each keystore and it is therefore suggested that the same be used for all keystore-based credential providers to avoid this issue. Password-files are additional files that need to be managed, store the password in clear text and need file permissions to be set such that only those that need access to them have it. If file permissions are set inappropriately the password to access the keystores is available in clear text.")]),e._v(" "),r("td",[e._v("Yes")]),e._v(" "),r("td",[e._v("Yes")]),e._v(" "),r("td",[e._v("Yes")])])])]),e._v(" "),r("p",[e._v("The use of the default password means that no additional communication/synchronization to runtime consumers needs to be done. The default password is known but file permissions are the primary protection of the keystore.")]),e._v(" "),r("p",[e._v("When file permissions are thwarted, unlike “side files”, there are no standard tools that can expose the protected credentials - even with the password known. Keytool requires a password that is six characters or more and doesn’t know how to retrieve general secrets from a keystore. It is also limited to PKI keypairs. Editors will not reveal the secrets stored within the keystore, nor will cat, more or any other standard tools. This is why the keystore providers are better than “side file” storage of credentials.")]),e._v(" "),r("p",[e._v("That said, it is trivial for someone to write code to access the credentials stored within a keystore-based credential provider using the API. Again, when using the default password, the password is merely a formality of persisting the keystore. The only protection is file permissions and OS level access policy.")]),e._v(" "),r("p",[e._v("Users may decide to use a password “side file” to store the password for the keystores themselves and this is supported. It is just really important to be aware of the mechanics required for this level of correctness.")]),e._v(" "),r("h4",{attrs:{id:"disabling-fallback-to-plain-text"}},[r("a",{staticClass:"header-anchor",attrs:{href:"#disabling-fallback-to-plain-text"}},[e._v("#")]),e._v(" Disabling fallback to plain text")]),e._v(" "),r("p",[e._v("The Credentials.getPassword() operation falls back to using entries in the configuration XML files if there are no credential providers, or if a key cannot be found.")]),e._v(" "),r("p",[e._v("This action can be disabled by changing the configuration option hadoop.security.credential.clear-text-fallback from true to false:")]),e._v(" "),r("pre",[r("code",[e._v("<property>\n  <name>hadoop.security.credential.clear-text-fallback</name>\n  <value>false</value>\n  <description>\n    true or false to indicate whether or not to fall back to storing credential\n    password as clear text. The default value is true. This property only works\n    when the password can't not be found from credential providers.\n  </description>\n</property>\n")])]),e._v(" "),r("p",[e._v("Once set, all configuration options looked up via the getPassword() API must be served via a credential provider.")])])}),[],!1,null,null,null);t.default=s.exports}}]);