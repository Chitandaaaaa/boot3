package com.lixiameng.boot3.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 02:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private String name;
    private int age;
    private String phone;
}
