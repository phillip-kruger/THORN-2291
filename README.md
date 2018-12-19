# THORN-2291
Reproducing THORN-2291

Simple JAX-RS Service that list all config values.

Test via http://localhost:8080/thorn-2291/api/all

## Testing via maven.

    mvn -Pthorntail clean install

This will build and create a fat jar and then run the jar. All working as expected. 

    --- thorntail-maven-plugin:2.2.1.Final:package (2) @ thorn-2291 ---
    Scanning for needed Thorntail fractions with mode: when_missing
    Detected fractions: cdi:2.2.1.Final, jaxrs-jsonp:2.2.1.Final, jsonp:2.2.1.Final, microprofile-openapi:2.2.1.Final, undertow:2.2.1.Final
    Adding fractions: bean-validation:2.2.1.Final, cdi-config:2.2.1.Final, cdi:2.2.1.Final, container:2.2.1.Final, ee:2.2.1.Final, io:2.2.1.Final, jaxrs-jsonp:2.2.1.Final, jaxrs:2.2.1.Final, jsonp:2.2.1.Final, logging:2.2.1.Final, microprofile-config:2.2.1.Final, microprofile-openapi:2.2.1.Final, request-controller:2.2.1.Final, transactions:2.2.1.Final, undertow:2.2.1.Final
    Resolving 80 out of 306 artifacts
    Repackaging .war: /home/phillip/NetBeansProjects/other/THORN-2291/target/thorn-2291.war
    Repackaged .war: /home/phillip/NetBeansProjects/other/THORN-2291/target/thorn-2291.war

    --- exec-maven-plugin:1.6.0:exec (1) @ thorn-2291 ---
    WARNING: An illegal reflective access operation has occurred
    WARNING: Illegal reflective access by __redirected.__SAXParserFactory (file:/home/phillip/NetBeansProjects/other/THORN-2291/target/thorn-2291-thorntail.jar) to constructor com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl()
    WARNING: Please consider reporting this to the maintainers of __redirected.__SAXParserFactory
    WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
    WARNING: All illegal access operations will be denied in a future release
    2018-12-19 11:22:21,766 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:      MicroProfile Config - STABLE          io.thorntail:microprofile-config:2.2.1.Final
    2018-12-19 11:22:21,778 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:                  Elytron - STABLE          io.thorntail:elytron:2.2.1.Final
    2018-12-19 11:22:21,778 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:          Bean Validation - STABLE          io.thorntail:bean-validation:2.2.1.Final
    2018-12-19 11:22:21,778 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:                   JAX-RS - STABLE          io.thorntail:jaxrs:2.2.1.Final
    2018-12-19 11:22:21,778 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:                      CDI - STABLE          io.thorntail:cdi:2.2.1.Final
    2018-12-19 11:22:21,778 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:             Transactions - STABLE          io.thorntail:transactions:2.2.1.Final
    2018-12-19 11:22:21,778 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:                  Logging - STABLE          io.thorntail:logging:2.2.1.Final
    2018-12-19 11:22:21,779 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:     MicroProfile OpenAPI - STABLE          io.thorntail:microprofile-openapi:2.2.1.Final
    2018-12-19 11:22:21,779 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:        CDI Configuration - STABLE          io.thorntail:cdi-config:2.2.1.Final
    2018-12-19 11:22:21,779 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:                 Undertow - STABLE          io.thorntail:undertow:2.2.1.Final
    2018-12-19 11:22:21,779 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:                   JSON-P - STABLE          io.thorntail:jsonp:2.2.1.Final
    2018-12-19 11:22:21,779 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:       JAX-RS with JSON-P - STABLE          io.thorntail:jaxrs-jsonp:2.2.1.Final
    2018-12-19 11:22:22,969 INFO  [org.jboss.msc] (main) JBoss MSC version 1.2.7.SP1
    2018-12-19 11:22:23,033 INFO  [org.jboss.as] (MSC service thread 1-7) WFLYSRV0049: Thorntail 2.2.1.Final (WildFly Core 3.0.8.Final) starting
    2018-12-19 11:22:23,056 INFO  [org.wildfly.swarm] (MSC service thread 1-7) THORN0019: Install MSC service for command line args: [-s, /home/phillip/NetBeansProjects/other/THORN-2291/target/project-defaults.yml, -Sdev, -Dconfigsource.yaml.pollForChanges=true]
    2018-12-19 11:22:23,388 INFO  [org.wildfly.security] (ServerService Thread Pool -- 11) ELY00001: WildFly Elytron version 1.1.6.Final
    2018-12-19 11:22:23,406 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 18) WFLYRS0016: RESTEasy version 3.0.24.Final
    2018-12-19 11:22:23,408 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 20) WFLYSEC0002: Activating Security Subsystem
    2018-12-19 11:22:23,407 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 21) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
    2018-12-19 11:22:23,407 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 16) WFLYNAM0001: Activating Naming Subsystem
    2018-12-19 11:22:23,413 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Current PicketBox version=5.0.2.Final
    2018-12-19 11:22:23,414 INFO  [org.xnio] (ServerService Thread Pool -- 19) XNIO version 3.5.4.Final
    2018-12-19 11:22:23,423 INFO  [org.wildfly.extension.microprofile.config] (ServerService Thread Pool -- 24) EMPCONF0001: Activating Eclipse MicroProfile Config Subsystem
    2018-12-19 11:22:23,446 INFO  [org.xnio.nio] (ServerService Thread Pool -- 19) XNIO NIO Implementation Version 3.5.4.Final
    2018-12-19 11:22:23,451 INFO  [org.jboss.as.naming] (MSC service thread 1-8) WFLYNAM0003: Starting Naming Service
    2018-12-19 11:22:23,461 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 19) WFLYIO001: Worker 'default' has auto-configured to 16 core threads with 128 task threads based on your 8 available processors
    2018-12-19 11:22:23,463 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0003: Undertow 1.4.18.Final starting
    2018-12-19 11:22:23,551 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0012: Started server default-server.
    2018-12-19 11:22:23,552 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-8) WFLYUT0018: Host default-host starting
    2018-12-19 11:22:23,575 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-6) WFLYUT0006: Undertow HTTP listener default listening on [0:0:0:0:0:0:0:0]:8080
    2018-12-19 11:22:23,629 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
    2018-12-19 11:22:23,630 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: Thorntail 2.2.1.Final (WildFly Core 3.0.8.Final) started in 707ms - Started 125 of 130 services (21 services are lazy, passive or on-demand)
    2018-12-19 11:22:23,848 INFO  [org.wildfly.swarm.runtime.deployer] (main) deploying thorn-2291.war
    2018-12-19 11:22:23,862 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0027: Starting deployment of "thorn-2291.war" (runtime-name: "thorn-2291.war")
    2018-12-19 11:22:25,826 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.thorn-2291.war" is using a private module ("org.jboss.jts") which may be changed or removed in future versions without notice.
    2018-12-19 11:22:25,827 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: Deployment "deployment.thorn-2291.war" is using a private module ("org.jboss.jts") which may be changed or removed in future versions without notice.
    2018-12-19 11:22:25,836 INFO  [org.jboss.weld.deployer] (MSC service thread 1-8) WFLYWELD0003: Processing weld deployment thorn-2291.war
    2018-12-19 11:22:25,877 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-8) HV000001: Hibernate Validator 5.3.5.Final
    **2018-12-19 11:22:25,939 INFO  [org.microprofileext.config.source.base.file.AbstractUrlBasedSource] (MSC service thread 1-8) Loading [properties] MicroProfile ConfigSource**
    **2018-12-19 11:22:25,940 INFO  [org.microprofileext.config.source.base.file.AbstractUrlBasedSource] (MSC service thread 1-8) Using [file:/home/phillip/NetBeansProjects/other/THORN-2291/application.properties] as properties URL**
    2018-12-19 11:22:25,940 WARNING [org.microprofileext.config.source.base.file.AbstractUrlBasedSource] (MSC service thread 1-8) Unable to read URL [file:/home/phillip/NetBeansProjects/other/THORN-2291/application.properties] - /home/phillip/NetBeansProjects/other/THORN-2291/application.properties (No such file or directory)
    2018-12-19 11:22:25,973 INFO  [org.jboss.weld.Version] (MSC service thread 1-1) WELD-000900: 2.4.3 (Final)
    2018-12-19 11:22:26,296 INFO  [io.smallrye.openapi.api.OpenApiDocument] (ServerService Thread Pool -- 8) OpenAPI document initialized: io.smallrye.openapi.api.models.OpenAPIImpl@56edb00c
    2018-12-19 11:22:26,391 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 8) RESTEASY002225: Deploying javax.ws.rs.core.Application: class com.github.phillipkruger.thorn2291.ApplicationConfig$Proxy$_$$_WeldClientProxy
    2018-12-19 11:22:26,405 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 8) WFLYUT0021: Registered web context: '/thorn-2291' for server 'default-server'
    2018-12-19 11:22:26,427 INFO  [org.jboss.as.server] (main) WFLYSRV0010: Deployed "thorn-2291.war" (runtime-name : "thorn-2291.war")
    2018-12-19 11:22:26,432 INFO  [org.wildfly.swarm] (main) THORN99999: Thorntail is Ready

## Testing via Thorntail Runner

