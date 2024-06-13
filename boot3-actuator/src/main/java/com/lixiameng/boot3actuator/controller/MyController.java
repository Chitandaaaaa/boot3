package com.lixiameng.boot3actuator.controller;

import org.springframework.stereotype.Component;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-26 23:53
 */
@Component
public class MyController {


    public int isMyControllerHealth(){
        return 1;
    }
}
