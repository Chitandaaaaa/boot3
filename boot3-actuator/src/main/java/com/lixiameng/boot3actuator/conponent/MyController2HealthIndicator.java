package com.lixiameng.boot3actuator.conponent;

import com.lixiameng.boot3actuator.controller.MyController;
import com.lixiameng.boot3actuator.controller.MyController2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
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
public class MyController2HealthIndicator extends AbstractHealthIndicator {

    @Autowired
    MyController2 myController2;


    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        int health = myController2.isMyControllerHealth();
        if(health ==1){
            builder.up().withDetail("活","11");
        }else {
            builder.down().withDetail("死","11");
        }
    }
}
