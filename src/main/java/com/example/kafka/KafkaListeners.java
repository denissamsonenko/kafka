package com.example.kafka;

import com.example.kafka.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author : Denis Samsonenko
 * @created : 03.05.2022
 */

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "topic",
            groupId = "groupId"
    )
    void listener(String message){
        System.out.println("Listener received " + message );
    }
}
