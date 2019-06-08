package com.example.springsecurityoauth2resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.springsecurityoauth2resource.mapper")
public class SpringSecurityOauth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOauth2ResourceApplication.class, args);
    }

}
