package com.learning.kafkaConsumer.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthStatus implements HealthIndicator {

    @Override
    public Health health() {
        Health health = Health.status("hey it is rpb").build();
        //logger.info("Health Status : {}", health.getStatus());
        return health;
    }
}
