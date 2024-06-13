package com.lixiameng.boot3kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-26 02:03
 */
@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic thingTopic() {
        return TopicBuilder.name("thing").partitions(1).compact().build();
    }

}
