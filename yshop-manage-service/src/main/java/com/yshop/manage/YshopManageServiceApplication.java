package com.yshop.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.yshop.manage.mapper")
public class YshopManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YshopManageServiceApplication.class, args);
    }

}
