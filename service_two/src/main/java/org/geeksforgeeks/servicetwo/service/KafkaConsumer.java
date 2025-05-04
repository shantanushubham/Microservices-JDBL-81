package org.geeksforgeeks.servicetwo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "jdbl-81", groupId = "service-two-group")
    public void consume(String message) {
        System.out.println("Received message in Service Two: " + message);
    }

}
