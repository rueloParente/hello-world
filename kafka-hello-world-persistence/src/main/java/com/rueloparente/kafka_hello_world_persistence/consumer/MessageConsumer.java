package com.rueloparente.kafka_hello_world_persistence.consumer;

import com.rueloparente.kafka_hello_world_persistence.dto.CreateMessage;
import com.rueloparente.kafka_hello_world_persistence.persistence.MessageSpringRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageConsumer {
    private MessageSpringRepository messageSpringRepository;

    public MessageConsumer(MessageSpringRepository messageSpringRepository) {
        this.messageSpringRepository = messageSpringRepository;
    }

    @KafkaListener(topics = "my-topic", groupId = "my-group-id")
    public void listen(CreateMessage message) {
        Message messageEntity = new Message(message.getMessage(), message.getTopic());
        messageSpringRepository.save(messageEntity);
    }

    public List<Message> getAllMessages() {
        return messageSpringRepository.findAll();
    }


}
