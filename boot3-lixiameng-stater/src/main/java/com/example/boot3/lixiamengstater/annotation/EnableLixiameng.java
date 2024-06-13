package com.example.boot3.lixiamengstater.annotation;

import com.example.boot3.lixiamengstater.LixiamengAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({LixiamengAutoConfiguration.class})
public @interface EnableLixiameng {
}
