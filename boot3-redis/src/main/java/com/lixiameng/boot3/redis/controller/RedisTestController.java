package com.lixiameng.boot3.redis.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-24 23:21
 */
@RestController
public class RedisTestController {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Autowired // 解析时会携带泛型一起解析。
//    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @RequestMapping(method = RequestMethod.GET, path = "/count")
    public String count(){
        Long count = stringRedisTemplate.opsForValue().increment("hello");
        return "访问量："+count;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/string")
    public String string(){
        ValueOperations<String, String> stringValueOperations = stringRedisTemplate.opsForValue();
        Long count = stringValueOperations.increment("hello");
        stringValueOperations.set("string","123123");
        Integer append = stringValueOperations.append("string", "append");
        System.out.println(append);

        return "";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hash")
    public String hash(){
        HashOperations<String, Object, Object> hashOperations = stringRedisTemplate.opsForHash();
        hashOperations.put("hash","aaa","123");
        hashOperations.put("hash","bbb","222");
        hashOperations.put("hash","ccc","333");
        hashOperations.put("hash","ddd","444");
        System.out.println(hashOperations.get("hash", "aaa"));
        System.out.println(hashOperations.hasKey("hash", "aaa"));
        System.out.println(hashOperations.lengthOfValue("hash", "aaa"));
        System.out.println(hashOperations.size("hash"));
        System.out.println(hashOperations.entries("hash")); // 返回map
        hashOperations.keys("hash");

        System.out.println(hashOperations.delete("hash", new String[]{"bbb", "ccc"})); // 删除的数量。
        System.out.println(hashOperations.delete("hash", new String[]{"bbb", "ccc"}));
        return "";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String list(){

        return "";
    }
}
