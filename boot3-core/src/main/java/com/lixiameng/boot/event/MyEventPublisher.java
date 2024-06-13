package com.lixiameng.boot.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-23 01:41
 */
@Service
public class MyEventPublisher implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;

    public void setEvent(ApplicationEvent event){
        applicationEventPublisher.publishEvent(event);
    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
