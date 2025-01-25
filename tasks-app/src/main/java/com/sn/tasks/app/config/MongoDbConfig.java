package com.sn.tasks.app.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoDbConfig {

    @Bean
    public MongoClient mongoClient() {
        // Use the corrected connection string with the encoded password
        return MongoClients.create("mongodb+srv://sn_dev:Shreyu66@sn.segyz.mongodb.net/");
    }

    @Bean(name = "mongoTemplate")
    public MongoTemplate mongoTemplate() {
        // Specify the correct database name
        return new MongoTemplate(mongoClient(), "sn_db");
    }
}


