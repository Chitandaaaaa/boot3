package com.lixiameng.boot3actuator.conponent;

import com.lixiameng.boot3actuator.controller.MyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @program: boot3
 * @description: 自定义健康监控
 *    实现  HealthIndicator
 *    继承  AbstractHealthIndicator
 *
 *
 * @author: lixiameng
 * @create: 2024-02-26 23:57
 */
@Component
public class MyControllerHealthIndicator implements HealthIndicator {

    @Autowired
    MyController myController;

    @Override
    public Health health() {
        int health = myController.isMyControllerHealth();
        if(health ==1){
            return Health.up().withDetail("活","11").build();
        }else {
            return Health.down().withDetail("死","11").build();
        }
    }
}
