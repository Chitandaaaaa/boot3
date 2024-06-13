package com.lixiameng.boot;

import com.example.boot3.lixiamengstater.LixiamengAutoConfiguration;
import com.example.boot3.lixiamengstater.annotation.EnableLixiameng;
import com.example.boot3.lixiamengstater.controller.StarterController;
import com.example.boot3.lixiamengstater.entity.Lixiameng;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@Import(LixiamengAutoConfiguration.class) // 在META-INF中配置了自动导入的文件。就不需要
//@EnableLixiameng
public class Boot3CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot3CoreApplication.class, args);
    }

}
