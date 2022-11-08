package com.example.SpringBoot_Kafka_Demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "myFirstTopic",groupId = "GroupA")
    public void listentoTopic(String message){
        System.out.println("Messages from Producers: "+message);
    }
}
