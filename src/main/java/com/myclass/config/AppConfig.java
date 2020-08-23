package com.myclass.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Khai báo lớp này là lớp cấu hình
@EnableWebMvc // Kích hoạt các annotion của spring mvc
@ComponentScan(basePackages = "com.myclass")
public class AppConfig implements WebMvcConfigurer {
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("WEB-INF/views/", ".jsp");
    }
}
