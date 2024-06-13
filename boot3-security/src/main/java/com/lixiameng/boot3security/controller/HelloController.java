package com.lixiameng.boot3security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-26 22:48
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    @PreAuthorize("hasAnyAuthority('write')")
    public String hello(){
        System.out.println("spring security!");
        return "spring security!";
    }
}
