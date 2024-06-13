package com.lixiameng.boot3.redis.controller;

import com.lixiameng.boot3.redis.entity.Person;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 02:26
 */
@RestController
public class RedisObjectTestController {

    @Resource
    private RedisTemplate<Object,Object> redisTemplate;

    @GetMapping("/person/save")
    public void savePerson(){
        redisTemplate.opsForValue().set("person",new Person("lixiameng",1,"123123"));
    }


    @GetMapping("/person/get")
    public Person getPerson(){
        Person person = (Person) redisTemplate.opsForValue().get("person");
        return person;
    }
}
