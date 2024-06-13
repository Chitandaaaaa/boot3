package com.example.boot3.lixiamengstater.controller;

import com.example.boot3.lixiamengstater.entity.Lixiameng;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 03:02
 */
@RestController
public class StarterController {

    @Resource
    private Lixiameng lixiameng;

    @GetMapping("/lixiameng")
    public String getLixiameng(){
        return lixiameng.toString();
    }

    @GetMapping("/lixiameng2")
    public Lixiameng getLixiameng2(){
        return new Lixiameng();
    }

}
