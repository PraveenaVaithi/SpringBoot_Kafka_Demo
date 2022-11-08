package com.example.SpringBoot_Kafka_Demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendMsgtoTopic(String message){
        kafkaTemplate.send("myFirstTopic",message);
    }
}
