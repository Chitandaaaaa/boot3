package com.lixiameng.boot3rpc.util;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 22:23
 */
@Component
public class WebClientUtil {

    private static WebClient webClient = WebClient.create();

    public Mono<String> get(String url){
        Mono<String> stringMono =
                webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);

        return stringMono;
    }

}
