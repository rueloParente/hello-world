package com.rueloparente.kafka_hello_world_persistence.producer;

import com.rueloparente.kafka_hello_world_persistence.consumer.Message;
import com.rueloparente.kafka_hello_world_persistence.dto.CreateMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
    private KafkaTemplate<String, CreateMessage> kafkaTemplate;

    public MessageProducer(KafkaTemplate<String, CreateMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, CreateMessage message) {
        kafkaTemplate.send(topic, message);
    }
}
