package com.lixiameng.boot.service;

import com.lixiameng.boot.event.HelloEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-23 01:37
 */
@Service
public class WelcomeService {
    public WelcomeService(EatService eatService) {
        super();
        System.out.println("调用EatService构造器");
        System.out.println("获取其他注册bean类"+eatService);
    }
    public WelcomeService() {
        super();
        System.out.println("调用无参构造器");
    }
    public void welcome(){
        System.out.println("welcome!");
    }

    @Order(0)
    @EventListener
    private void onApplicationEvent(HelloEvent helloEvent){
        System.out.println("监听到helloEvent："+helloEvent.getSource().toString());
        welcome();
    }
}
