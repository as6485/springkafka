# springkafka

Demonstrate essential functionalities of using Kafka with Spring 

### Run a producer app

```bash 
   1. cd <kafka_directory>
   2. bin/windows/zookeeper-server-start.bat config/zookeeper.properties
   3. bin/windows/kafka-server-start.bat config/server.properties
   4. run the spring app
   5. bin/windows/kafka-console-consumer.bat --topic myKafkaTopic --from-beginning --bootstrap-server localhost:9092