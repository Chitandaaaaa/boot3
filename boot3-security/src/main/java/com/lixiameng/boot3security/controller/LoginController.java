package com.lixiameng.boot3security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-26 22:48
 */
@Controller
public class LoginController {

    @GetMapping ("/login")
    public String login(){
        return "login";
    }
}
