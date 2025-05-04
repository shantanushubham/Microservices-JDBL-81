package org.geeksforgeeks.serviceone.controllers;

import org.geeksforgeeks.serviceone.dao.ResponseDao;
import org.geeksforgeeks.serviceone.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    private final KafkaProducer kafkaProducer;

    @Autowired
    public ServiceOneController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/first_name")
    public ResponseEntity<ResponseDao> getFirstName() {
        this.kafkaProducer.sendMessage("Hi! I am Shantanu");
        return ResponseEntity.ok(new ResponseDao("Shantanu"));
    }

}
