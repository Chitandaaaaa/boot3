package com.lixiameng.boot.listener;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.AvailabilityState;
import org.springframework.context.ApplicationListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-23 02:14
 */
public class MyAvailabilityChangeEventListener implements ApplicationListener<AvailabilityChangeEvent> {

    @Override
    public void onApplicationEvent(AvailabilityChangeEvent event) {
        System.out.println("监听AvailabilityChangeEvent，并获取状态："+event.getState());
    }
}
