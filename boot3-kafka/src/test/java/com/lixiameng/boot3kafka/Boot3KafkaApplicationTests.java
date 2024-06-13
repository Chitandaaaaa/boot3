package com.lixiameng.boot3kafka;

import com.lixiameng.boot3kafka.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.StopWatch;

import java.util.concurrent.CompletableFuture;

@SpringBootTest
class Boot3KafkaApplicationTests {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Test
    void contextLoads() {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        CompletableFuture[] objectCompletableFuture = new CompletableFuture[10000];
        for (int i = 0; i < 10000; i++) {
            CompletableFuture news = kafkaTemplate.send("news", "11-"+i, "123-"+i);
            objectCompletableFuture[i] = news;
        }
        CompletableFuture.allOf(objectCompletableFuture).join();

        stopWatch.stop();

        System.out.println("一共消耗了"+stopWatch.getTotalTimeSeconds());
    }

    @Test
    public void send(){
        CompletableFuture news = kafkaTemplate.send("news", "person", new Person("lixiameng","123111",111));
        news.join();
        System.out.println("==============成功==============");
    }


}
