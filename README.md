# springkafka

Demonstrate essential functionalities of using Kafka with Spring 

### Run a producer consumer app

```bash 
   1. cd <kafka_directory>
   2. bin/windows/zookeeper-server-start.bat config/zookeeper.properties
   3. bin/windows/kafka-server-start.bat config/server.properties
   4. run the spring app
   5. Optional run another consumer from terminal 
        bin/windows/kafka-console-consumer.bat --topic myKafkaTopic --from-beginning --bootstrap-server localhost:9092
```

### Run log
```bash 
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.3\lib\idea_rt.jar=60067:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\urmis\IdeaProjects\springkafka\target\classes;C:\Users\urmis\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.6.3\spring-boot-starter-web-2.6.3.jar;C:\Users\urmis\.m2\repository\org\springframework\boot\spring-boot-starter\2.6.3\spring-boot-starter-2.6.3.jar;C:\Users\urmis\.m2\repository\org\springframework\boot\spring-boot\2.6.3\spring-boot-2.6.3.jar;C:\Users\urmis\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.6.3\spring-boot-autoconfigure-2.6.3.jar;C:\Users\urmis\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.6.3\spring-boot-starter-logging-2.6.3.jar;C:\Users\urmis\.m2\repository\ch\qos\logback\logback-classic\1.2.10\logback-classic-1.2.10.jar;C:\Users\urmis\.m2\repository\ch\qos\logback\logback-core\1.2.10\logback-core-1.2.10.jar;C:\Users\urmis\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.17.1\log4j-to-slf4j-2.17.1.jar;C:\Users\urmis\.m2\repository\org\apache\logging\log4j\log4j-api\2.17.1\log4j-api-2.17.1.jar;C:\Users\urmis\.m2\repository\org\slf4j\jul-to-slf4j\1.7.33\jul-to-slf4j-1.7.33.jar;C:\Users\urmis\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\urmis\.m2\repository\org\yaml\snakeyaml\1.29\snakeyaml-1.29.jar;C:\Users\urmis\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.6.3\spring-boot-starter-json-2.6.3.jar;C:\Users\urmis\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.13.1\jackson-databind-2.13.1.jar;C:\Users\urmis\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.13.1\jackson-annotations-2.13.1.jar;C:\Users\urmis\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.13.1\jackson-core-2.13.1.jar;C:\Users\urmis\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.13.1\jackson-datatype-jdk8-2.13.1.jar;C:\Users\urmis\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.13.1\jackson-datatype-jsr310-2.13.1.jar;C:\Users\urmis\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.13.1\jackson-module-parameter-names-2.13.1.jar;C:\Users\urmis\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.6.3\spring-boot-starter-tomcat-2.6.3.jar;C:\Users\urmis\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.56\tomcat-embed-core-9.0.56.jar;C:\Users\urmis\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.56\tomcat-embed-el-9.0.56.jar;C:\Users\urmis\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.56\tomcat-embed-websocket-9.0.56.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-web\5.3.15\spring-web-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-beans\5.3.15\spring-beans-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-webmvc\5.3.15\spring-webmvc-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-aop\5.3.15\spring-aop-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-expression\5.3.15\spring-expression-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\kafka\spring-kafka\2.8.2\spring-kafka-2.8.2.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-context\5.3.15\spring-context-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-messaging\5.3.15\spring-messaging-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-tx\5.3.15\spring-tx-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\retry\spring-retry\1.3.1\spring-retry-1.3.1.jar;C:\Users\urmis\.m2\repository\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;C:\Users\urmis\.m2\repository\org\apache\kafka\kafka-clients\3.0.0\kafka-clients-3.0.0.jar;C:\Users\urmis\.m2\repository\com\github\luben\zstd-jni\1.5.0-2\zstd-jni-1.5.0-2.jar;C:\Users\urmis\.m2\repository\org\lz4\lz4-java\1.7.1\lz4-java-1.7.1.jar;C:\Users\urmis\.m2\repository\org\xerial\snappy\snappy-java\1.1.8.1\snappy-java-1.1.8.1.jar;C:\Users\urmis\.m2\repository\org\slf4j\slf4j-api\1.7.33\slf4j-api-1.7.33.jar;C:\Users\urmis\.m2\repository\com\google\code\findbugs\jsr305\3.0.2\jsr305-3.0.2.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-core\5.3.15\spring-core-5.3.15.jar;C:\Users\urmis\.m2\repository\org\springframework\spring-jcl\5.3.15\spring-jcl-5.3.15.jar org.ayan.SpringKafkaApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.3)

2023-10-14 17:01:21.066  INFO 21104 --- [           main] org.ayan.SpringKafkaApplication          : Starting SpringKafkaApplication using Java 17.0.8 on LAPTOP-9J7VTNFQ with PID 21104 (C:\Users\urmis\IdeaProjects\springkafka\target\classes started by urmis in C:\Users\urmis\IdeaProjects\springkafka)
2023-10-14 17:01:21.068  INFO 21104 --- [           main] org.ayan.SpringKafkaApplication          : No active profile set, falling back to default profiles: default
2023-10-14 17:01:21.917  INFO 21104 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-10-14 17:01:21.926  INFO 21104 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-10-14 17:01:21.926  INFO 21104 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.56]
2023-10-14 17:01:21.990  INFO 21104 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-10-14 17:01:21.991  INFO 21104 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 873 ms
2023-10-14 17:01:22.531  INFO 21104 --- [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	bootstrap.servers = [localhost:9092]
	client.dns.lookup = use_all_dns_ips
	client.id = 
	connections.max.idle.ms = 300000
	default.api.timeout.ms = 60000
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS

2023-10-14 17:01:22.637  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.0.0
2023-10-14 17:01:22.638  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 8cb0a5e9d3441962
2023-10-14 17:01:22.638  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1697283082636
2023-10-14 17:01:22.875  INFO 21104 --- [| adminclient-1] o.a.kafka.common.utils.AppInfoParser     : App info kafka.admin.client for adminclient-1 unregistered
2023-10-14 17:01:22.880  INFO 21104 --- [| adminclient-1] org.apache.kafka.common.metrics.Metrics  : Metrics scheduler closed
2023-10-14 17:01:22.880  INFO 21104 --- [| adminclient-1] org.apache.kafka.common.metrics.Metrics  : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2023-10-14 17:01:22.880  INFO 21104 --- [| adminclient-1] org.apache.kafka.common.metrics.Metrics  : Metrics reporters closed
2023-10-14 17:01:22.902  INFO 21104 --- [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 5000
	auto.offset.reset = latest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = use_all_dns_ips
	client.id = consumer-firstGroup-1
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = firstGroup
	group.instance.id = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	internal.throw.on.fetch.stable.offset.unsupported = false
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor, class org.apache.kafka.clients.consumer.CooperativeStickyAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 45000
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.apache.kafka.common.serialization.StringDeserializer

2023-10-14 17:01:22.938  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.0.0
2023-10-14 17:01:22.938  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 8cb0a5e9d3441962
2023-10-14 17:01:22.938  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1697283082938
2023-10-14 17:01:22.939  INFO 21104 --- [           main] o.a.k.clients.consumer.KafkaConsumer     : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Subscribed to topic(s): myKafkaTopic
2023-10-14 17:01:22.959  INFO 21104 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-10-14 17:01:22.963  INFO 21104 --- [ntainer#0-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Cluster ID: InQOiR-kSga7txdDxrH_sw
2023-10-14 17:01:22.964  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Discovered group coordinator LAPTOP-9J7VTNFQ:9092 (id: 2147483647 rack: null)
2023-10-14 17:01:22.966  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] (Re-)joining group
2023-10-14 17:01:22.971  INFO 21104 --- [           main] org.ayan.SpringKafkaApplication          : Started SpringKafkaApplication in 2.235 seconds (JVM running for 2.543)
2023-10-14 17:01:22.979  INFO 21104 --- [           main] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values: 
	acks = -1
	batch.size = 16384
	bootstrap.servers = [localhost:9092]
	buffer.memory = 33554432
	client.dns.lookup = use_all_dns_ips
	client.id = producer-1
	compression.type = none
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = true
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.class = class org.apache.kafka.clients.producer.internals.DefaultPartitioner
	receive.buffer.bytes = 32768
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.apache.kafka.common.serialization.StringSerializer

2023-10-14 17:01:22.983  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Request joining group due to: need to re-join with the given member-id
2023-10-14 17:01:22.983  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] (Re-)joining group
2023-10-14 17:01:22.986  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Successfully joined group with generation Generation{generationId=7, memberId='consumer-firstGroup-1-0bc8e023-1fab-4b9d-bc37-874d3c65c127', protocol='range'}
2023-10-14 17:01:22.988  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Finished assignment for group at generation 7: {consumer-firstGroup-1-0bc8e023-1fab-4b9d-bc37-874d3c65c127=Assignment(partitions=[myKafkaTopic-0])}
2023-10-14 17:01:22.993  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Successfully synced group in generation Generation{generationId=7, memberId='consumer-firstGroup-1-0bc8e023-1fab-4b9d-bc37-874d3c65c127', protocol='range'}
2023-10-14 17:01:22.993  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Notifying assignor about the new Assignment(partitions=[myKafkaTopic-0])
2023-10-14 17:01:22.995  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Adding newly assigned partitions: myKafkaTopic-0
2023-10-14 17:01:22.998  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.0.0
2023-10-14 17:01:22.998  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 8cb0a5e9d3441962
2023-10-14 17:01:22.998  INFO 21104 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1697283082998
2023-10-14 17:01:23.004  INFO 21104 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: InQOiR-kSga7txdDxrH_sw
2023-10-14 17:01:23.008  INFO 21104 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-firstGroup-1, groupId=firstGroup] Setting offset for partition myKafkaTopic-0 to the committed offset FetchPosition{offset=204, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[LAPTOP-9J7VTNFQ:9092 (id: 0 rack: null)], epoch=0}}
2023-10-14 17:01:23.010  INFO 21104 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : firstGroup: partitions assigned: [myKafkaTopic-0]
Listener received : Hello Kafka 0
Listener received : Hello Kafka 1
Listener received : Hello Kafka 2
Listener received : Hello Kafka 3
Listener received : Hello Kafka 4
Listener received : Hello Kafka 5
Listener received : Hello Kafka 6
Listener received : Hello Kafka 7
Listener received : Hello Kafka 8
Listener received : Hello Kafka 9
Listener received : Hello Kafka 10
Listener received : Hello Kafka 11
Listener received : Hello Kafka 12
Listener received : Hello Kafka 13
Listener received : Hello Kafka 14
Listener received : Hello Kafka 15
Listener received : Hello Kafka 16
Listener received : Hello Kafka 17
Listener received : Hello Kafka 18
Listener received : Hello Kafka 19
Listener received : Hello Kafka 20
Listener received : Hello Kafka 21
Listener received : Hello Kafka 22
Listener received : Hello Kafka 23
Listener received : Hello Kafka 24
Listener received : Hello Kafka 25
Listener received : Hello Kafka 26
Listener received : Hello Kafka 27
Listener received : Hello Kafka 28
Listener received : Hello Kafka 29
Listener received : Hello Kafka 30
Listener received : Hello Kafka 31
Listener received : Hello Kafka 32
Listener received : Hello Kafka 33
Listener received : Hello Kafka 34
Listener received : Hello Kafka 35
Listener received : Hello Kafka 36
Listener received : Hello Kafka 37
Listener received : Hello Kafka 38
Listener received : Hello Kafka 39
Listener received : Hello Kafka 40
Listener received : Hello Kafka 41
Listener received : Hello Kafka 42
Listener received : Hello Kafka 43
Listener received : Hello Kafka 44
Listener received : Hello Kafka 45
Listener received : Hello Kafka 46
Listener received : Hello Kafka 47
Listener received : Hello Kafka 48
Listener received : Hello Kafka 49
Listener received : Hello Kafka 50
Listener received : Hello Kafka 51
Listener received : Hello Kafka 52
Listener received : Hello Kafka 53
Listener received : Hello Kafka 54
Listener received : Hello Kafka 55
Listener received : Hello Kafka 56
Listener received : Hello Kafka 57
Listener received : Hello Kafka 58
Listener received : Hello Kafka 59
Listener received : Hello Kafka 60
Listener received : Hello Kafka 61
Listener received : Hello Kafka 62
Listener received : Hello Kafka 63
Listener received : Hello Kafka 64
Listener received : Hello Kafka 65
Listener received : Hello Kafka 66
Listener received : Hello Kafka 67
Listener received : Hello Kafka 68
Listener received : Hello Kafka 69
Listener received : Hello Kafka 70
Listener received : Hello Kafka 71
Listener received : Hello Kafka 72
Listener received : Hello Kafka 73
Listener received : Hello Kafka 74
Listener received : Hello Kafka 75
Listener received : Hello Kafka 76
Listener received : Hello Kafka 77
Listener received : Hello Kafka 78
Listener received : Hello Kafka 79
Listener received : Hello Kafka 80
Listener received : Hello Kafka 81
Listener received : Hello Kafka 82
Listener received : Hello Kafka 83
Listener received : Hello Kafka 84
Listener received : Hello Kafka 85
Listener received : Hello Kafka 86
Listener received : Hello Kafka 87
Listener received : Hello Kafka 88
Listener received : Hello Kafka 89
Listener received : Hello Kafka 90
Listener received : Hello Kafka 91
Listener received : Hello Kafka 92
Listener received : Hello Kafka 93
Listener received : Hello Kafka 94
Listener received : Hello Kafka 95
Listener received : Hello Kafka 96
Listener received : Hello Kafka 97
Listener received : Hello Kafka 98
Listener received : Hello Kafka 99
```

### Run log for optional second consumer in terminal
![img_2.png](img_2.png)

