package com.learning.kafkaConsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

@Configuration
@EnableKafka
//Notes:: class level annotation,
// it tells to do all configuration setup required to start a kafka consumer
public class KafkaConsumerConfig {

    private final ConsumerFactory<String, String> consumerFactory;

    public KafkaConsumerConfig(ConsumerFactory<String, String> consumerFactory) {
        this.consumerFactory = consumerFactory;
    }
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory);
        return factory;
    }
}
