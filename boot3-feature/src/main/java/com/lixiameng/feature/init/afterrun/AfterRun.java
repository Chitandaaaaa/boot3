package com.lixiameng.feature.init.afterrun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @program: boot3
 * @description:
 * 服务启动后执行
 * 同时该方法也可以接受参数，可以根据项目启动时: java -jar demo.jar arg1 arg2 arg3 传入的参数进行一些处理。
 * @author: lixiameng
 * @create: 2024-06-22 21:58
 */
@Component
public class AfterRun implements CommandLineRunner, Ordered {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("服务已启动完成！开始执行初始化业务！CommandLineRunner");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
