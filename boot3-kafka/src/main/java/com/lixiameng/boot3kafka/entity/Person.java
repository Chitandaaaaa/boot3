package com.lixiameng.boot3kafka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-26 01:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    String name;
    String phone;
    int age;
}
