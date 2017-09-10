package com.thymeleaf.library;

import com.thymeleaf.library.interceptor.WebInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@MapperScan(basePackages = "com.thymeleaf.library.mybatis")
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Configuration
    class WebAppConfigurer extends WebMvcConfigurerAdapter {

        @Autowired(required = false)
        WebInterceptor webInterceptor;

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            if (webInterceptor != null){
                registry.addInterceptor(webInterceptor).addPathPatterns("/**").excludePathPatterns("/login");
            }
            super.addInterceptors(registry);
        }
    }
}
