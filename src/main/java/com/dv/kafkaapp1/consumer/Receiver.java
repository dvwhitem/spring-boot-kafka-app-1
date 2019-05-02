package com.dv.kafkaapp1.consumer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    @KafkaListener(topics = "${app.topic.name}")
    public void listen(@Payload String message) {
        log.info("received message='{}'", message);
    }
}
