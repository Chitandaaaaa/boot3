package com.lixiameng.boot3security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableMethodSecurity // 开启方法级别security权限注解
public class Boot3SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot3SecurityApplication.class, args);
    }

}
