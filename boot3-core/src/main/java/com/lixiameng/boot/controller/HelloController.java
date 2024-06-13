package com.lixiameng.boot.controller;

import com.lixiameng.boot.event.HelloEvent;
import com.lixiameng.boot.event.MyEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-23 01:36
 */
@RestController
public class HelloController {

//    @Autowired
//    private MyEventPublisher myEventPublisher;

    @Autowired
    private ApplicationEventPublisher myEventPublisher;

    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello!");

//        myEventPublisher.setEvent(new HelloEvent("你好"));
        myEventPublisher.publishEvent(new HelloEvent("你好"));

    }

    @GetMapping("/hello1")
    public String hello1(){
        return "hello1";
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam String value) {
        return "hello2:" + value;
    }

}
