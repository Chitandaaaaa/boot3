package com.lixiameng.boot3rpc.controller;

import com.lixiameng.boot3rpc.service.HelloService;
import com.lixiameng.boot3rpc.util.WebClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 22:32
 */
@RestController
public class RpcController {

    @Autowired
    WebClientUtil webClientUtil;

    @GetMapping("/rpc/hello1")
    public Mono<String> rpcHello1(){
        return webClientUtil.get("http://127.0.0.1:8080/hello1");
    }


    @Autowired
    HelloService helloService;

    @GetMapping("/rpc/hello2")
    public Mono<String> rpcHello2(@RequestParam String value){
        return helloService.hello2(value);
    }

}
