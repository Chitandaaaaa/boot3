package com.lixiameng.boot3security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @program: boot3
 * @description:
 * @author: lixiameng
 * @create: 2024-02-26 22:39
 */
@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(registry -> {
            registry.requestMatchers("/").permitAll() //所有人都可以访问
                    .anyRequest().authenticated();  //其他所有需求都认证。
        });

        // 设置其他请求的表单登录
        httpSecurity.formLogin(httpSecurityFormLoginConfigurer -> {
            httpSecurityFormLoginConfigurer.loginPage("/login").permitAll();
        });

        return httpSecurity.build();
    }

    @Bean
    UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {

        // 设置账号
        UserDetails zhangsan =
                User.withUsername("zhangsan").password(passwordEncoder.encode("123")).roles("业务").authorities("read").build();
        UserDetails lisi =
                User.withUsername("lisi").password(passwordEncoder.encode("123")).roles("业务1").authorities("write").build();
        UserDetails wangwu =
                User.withUsername("wangwu").password(passwordEncoder.encode("123")).roles("业务1").authorities("read").build();

        return new InMemoryUserDetailsManager(zhangsan,lisi,wangwu);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
