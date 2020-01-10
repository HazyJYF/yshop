package com.yshop.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.yshop.user.mapper")
public class YshopUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YshopUserServiceApplication.class, args);
    }

}
