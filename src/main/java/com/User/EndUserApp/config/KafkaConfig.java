package com.User.EndUserApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig{

    @KafkaListener(topics = AppConstants.LOC_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
    public void updateLoc(String value){
        System.out.println("Location received: "+value);
    }


    @KafkaListener(topics = AppConstants.LOC_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID+1)
    public void updateLoc1(String value){
        System.out.println("Location received1111: "+value);
    }
}
