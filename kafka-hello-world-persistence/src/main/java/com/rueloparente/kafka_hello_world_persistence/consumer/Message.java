package com.rueloparente.kafka_hello_world_persistence.consumer;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstText;
    private String secondText;

    public Message() {
    }

    public Message (String message, String topic) {
        this.firstText = message;
        this.secondText = topic;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + firstText + '\'' +
                ", topic='" + secondText + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstText() {
        return firstText;
    }

    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    public String getSecondText() {
        return secondText;
    }

    public void setSecondText(String secondText) {
        this.secondText = secondText;
    }
}
