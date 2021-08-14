package com.example.tdd;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @ClassName RestConfig
 * @Author 10932
 * @Date 8/13/2021 7:48 AM
 **/
@Configuration
public class RestConfig implements WebMvcConfigurer {
    @Resource
    private ResetInterceptor resetInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(resetInterceptor);
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
