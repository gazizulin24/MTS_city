package org.gazizulin.iot_connector_service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${topics.kafka.params}", groupId = "${groups.kafka.params}")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
        // TODO: будущая логика обработки полученного сообщения о изменении параметра датчика из kafka
    }
}
