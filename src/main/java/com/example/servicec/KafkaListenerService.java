package com.example.servicec;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "my-topic")
    public void listenMessage(String message) {
        System.out.println("Received messages: " + message);
    }
}
