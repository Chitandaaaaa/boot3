package com.example.boot3.lixiamengstater.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 03:03
 */
@ConfigurationProperties(prefix = "lixiameng")
@Data
@Component
public class Lixiameng {

    String name = "lxiameng默认配置";
    int age=0;
    String phone="111111111默认电话";

    @Override
    public String toString() {
        return "Lixiameng{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
