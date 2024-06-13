package com.lixiameng.boot.service;

import com.lixiameng.boot.event.HelloEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-23 01:50
 */
@Service
public class EatService implements ApplicationListener<HelloEvent> {

    public void eat(){
        System.out.println("吃了么");
    }

//    @Order(11111) // 数字越大执行顺序越靠后
    @Override
    public void onApplicationEvent(HelloEvent helloEvent) {
        System.out.println("监听到helloEvent："+helloEvent.getSource().toString());
        eat();
    }
}
