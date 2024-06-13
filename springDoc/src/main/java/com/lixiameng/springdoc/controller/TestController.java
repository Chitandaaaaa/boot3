package com.lixiameng.springdoc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 12:44
 */
@Tag(name= "测试类",description = "测试类描述")
@Controller
public class TestController {
    @Operation(summary = "测试方法",description = "测试方法描述")
    @GetMapping("/test/{aa}")
    public String test(@PathVariable("aa") @Parameter(description = "aaaa描述") String a){
        return "hello";
    }
}
