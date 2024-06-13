package com.lixiameng.springdoc.controller;

import com.lixiameng.springdoc.entity.Person;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 11:41
 */
@RestController
@Tag(name = "打招呼管理",description = "打招呼管理描述")
public class HelloController {

    @Operation(summary = "打招呼",description = "打招呼描述")
    @GetMapping("/hello")
    public String hello(Person person){
        return "hello";
    }
}
