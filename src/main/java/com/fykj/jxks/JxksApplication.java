package com.fykj.jxks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.fykj.jxks.mapper")
public class JxksApplication {
    public static void main(String[] args) {
        SpringApplication.run(JxksApplication.class, args);
    }

}
