package com.lixiameng.boot3actuator.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot3
 * @description: 自定义metric指标，名字叫hello.count
 * @author: lixiameng
 * @create: 2024-02-27 00:12
 */
@RestController
public class HelloController {

    Counter counter = null;

    public HelloController(MeterRegistry meterRegistry){
        counter = meterRegistry.counter("hello.count");
    }


    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello");
        counter.increment();
    }


}
