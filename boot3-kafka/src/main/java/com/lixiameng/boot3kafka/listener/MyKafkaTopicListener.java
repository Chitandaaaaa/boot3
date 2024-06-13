package com.lixiameng.boot3kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-26 02:09
 */
@Configuration
public class MyKafkaTopicListener {


    /**
     * @Description: 从服务启动后开始监听消息，启动之前的消息无法被监听
     * @param:
     * @return:
     * @throws
     */
    @KafkaListener(topics = "news",groupId = "hh")
    public void newsListener(ConsumerRecord record) {
        String topic = record.topic();
        Object key = record.key();
        Object value = record.value();
        System.out.println("topic" + topic + "  key" + key + "  value" + value);
    }



    /**
     * @Description: 可以设置具体的监听偏移量，即全量监听消息
     * @param:
     * @return:
     * @throws
     */
    @KafkaListener(topicPartitions = {
            @TopicPartition(topic = "news",partitionOffsets = {
                    @PartitionOffset(partition = "0",initialOffset = "0")
            })
    })
    public void newsListener1(ConsumerRecord record) {
        String topic = record.topic();
        Object key = record.key();
        Object value = record.value();
        System.out.println("=========topic" + topic + "  key" + key + "  value" + value);
    }
}
