package com.example.boot3.lixiamengstater;

import com.example.boot3.lixiamengstater.controller.StarterController;
import com.example.boot3.lixiamengstater.entity.Lixiameng;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-25 03:20
 */
@Configuration
@Import({StarterController.class, Lixiameng.class})
public class LixiamengAutoConfiguration {
}
