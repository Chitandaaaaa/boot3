package com.lixiameng.springdoc.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 15:39
 */
@Configuration
public class SwaggerConfig {


    /**
     * @Description: 分组配置
     * @param:
     * @return:
     * @throws
     */
    @Bean
    public GroupedOpenApi publicApi(){
        return GroupedOpenApi.builder()
                .group("打招呼分组")
                .pathsToMatch("/hello/**")
                .build();
    }


    /**
     * @Description: 分组配置
     * @param:
     * @return:
     * @throws
     */
    @Bean
    public GroupedOpenApi testApi(){
        return GroupedOpenApi.builder()
                .group("测试分组")
                .pathsToMatch("/test/**")
                .build();
    }


    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                .info(new Info().title("SpringShop API")
                        .description("Spring shop sample application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringShop Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }
}
