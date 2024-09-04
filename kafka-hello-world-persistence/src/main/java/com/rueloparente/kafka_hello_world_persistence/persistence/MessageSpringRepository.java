package com.rueloparente.kafka_hello_world_persistence.persistence;

import com.rueloparente.kafka_hello_world_persistence.consumer.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageSpringRepository extends JpaRepository<Message, Long> {
}
