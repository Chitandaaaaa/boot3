package com.lixiameng.boot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-23 01:38
 */
public class HelloEvent extends ApplicationEvent {

    public HelloEvent(String conversation) {
        super(conversation);
    }
}
