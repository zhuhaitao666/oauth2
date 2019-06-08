package com.example.spirngsecurityoauth2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.spirngsecurityoauth2server.mapper")
public class SpirngSecurityOauth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpirngSecurityOauth2ServerApplication.class, args);
        /*
            启动授权服务器
         */
    }
}
