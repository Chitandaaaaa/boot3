package com.lixiameng.boot3rpc.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 22:48
 */
public interface HelloService {

    @GetExchange(url="http://127.0.0.1:8080/hello2")
    Mono<String> hello2(@RequestParam("value") String a);
}
