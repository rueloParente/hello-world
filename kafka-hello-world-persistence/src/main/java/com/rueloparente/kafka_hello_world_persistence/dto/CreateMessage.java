package com.rueloparente.kafka_hello_world_persistence.dto;

public class CreateMessage {
    private String message;
    private String topic;

    @Override
    public String toString() {
        return "CreateMessage{" +
                "message='" + message + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
    public CreateMessage() {
    }

    public CreateMessage(String message, String topic) {
        this.message = message;
        this.topic = topic;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public String getTopic() {
        return topic;
    }
}
