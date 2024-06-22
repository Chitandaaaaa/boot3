package com.lixiameng.feature.init.afterrun;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: boot3
 * @description:
 *
 *  最常用
 *  服务启动后，执行。
 *  @Order 可以配置顺序
 *
 *
 * @author: lixiameng
 * @create: 2024-06-22 23:14
 */
@Component
@Order(5)
public class AfterRun2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("服务已启动完成！开始执行初始化业务！ApplicationRunner");
    }
}
