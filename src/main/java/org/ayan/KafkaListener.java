package org.ayan;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "myKafkaTopic", groupId = "firstGroup")
    void listener(String data){
        System.out.println("Listener received : "+data);
    }
}
