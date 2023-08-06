package com.learning.kafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "my-topic-2p")
    //Notes:: it is method level annotation.
    // It tells tha following method should be called for given topic to work as consumer
    public void listen(String message) {
        // Process the received message
        System.out.println("Received message: " + message);
    }
}
