package com.nishant.springbootconcepts.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PersonWebConfiguration implements WebMvcConfigurer {

    @Value(value = "${api.allowed-origins}")
    String allowedOrigins;


    HandlerInterceptor httpHandlerInterceptor;

    @Autowired
    public void setHttpHandlerInterceptor(HandlerInterceptor httpHandlerInterceptor) {
        this.httpHandlerInterceptor = httpHandlerInterceptor;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(allowedOrigins.split(","))
                .allowedMethods("GET","POST");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(httpHandlerInterceptor);
    }
}