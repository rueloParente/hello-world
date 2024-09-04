package com.rueloparente.kafka_hello_world_persistence.controller;

import com.rueloparente.kafka_hello_world_persistence.consumer.MessageConsumer;
import com.rueloparente.kafka_hello_world_persistence.dto.CreateMessage;
import com.rueloparente.kafka_hello_world_persistence.consumer.Message;
import com.rueloparente.kafka_hello_world_persistence.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KafkaController {
        @Autowired
        private MessageProducer messageProducer;
        @Autowired
        private MessageConsumer messageConsumer;

        @PostMapping("/send")
        public String sendMessage(@RequestBody CreateMessage message) {
            messageProducer.sendMessage("my-topic", message);
            return "Message sent: " + message;
        }

        @GetMapping("/messages")
        public List<Message> getAllMessages() {
            return messageConsumer.getAllMessages();
        }

}
