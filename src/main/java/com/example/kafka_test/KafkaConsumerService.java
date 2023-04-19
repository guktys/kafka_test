package com.example.kafka_test;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}