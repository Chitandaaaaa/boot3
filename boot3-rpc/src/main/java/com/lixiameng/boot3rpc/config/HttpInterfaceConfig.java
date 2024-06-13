package com.lixiameng.boot3rpc.config;

import com.lixiameng.boot3rpc.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 22:53
 */
@Configuration
public class HttpInterfaceConfig {

    @Bean
    public HttpServiceProxyFactory getHttpServiceProxyFactory(){
        //1、创建客户端
        WebClient client = WebClient.builder()
//                .baseUrl("https://cn.bing.com")
                .codecs(clientCodecConfigurer -> {
                    clientCodecConfigurer
                            .defaultCodecs()
                            .maxInMemorySize(256*1024*1024);
                    //响应数据量太大有可能会超出BufferSize，所以这里设置的大一点
                })
                .build();
        return HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(client)).build();
    }

    @Bean
    public HelloService helloService(HttpServiceProxyFactory httpServiceProxyFactory) {
        return httpServiceProxyFactory.createClient(HelloService.class);
    }



}
