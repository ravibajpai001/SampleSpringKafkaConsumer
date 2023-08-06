package com.learning.kafkaConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerApplication {

	// Some helpful commands for local setup in windows
	// Go to c:\kafka
	//Starting zookeeper : bin\windows\zookeeper-server-start.bat config\zookeeper.properties
	//Starting kafka broker: bin\windows\kafka-server-start.bat config\server.properties
	//Create new topic:bin\windows\kafka-topics.bat --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
	//produce message: bin\windows\kafka-console-producer.bat --topic my-topic --bootstrap-server localhost:9092
	//consume message: bin\windows\kafka-console-consumer.bat --topic my-topic --bootstrap-server localhost:9092 --from-beginning


	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}
