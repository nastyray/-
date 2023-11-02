package com.ray.partnerCampus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ray.partnerCampus.mapper")
public class partnerCampusApplication {

    public static void main(String[] args) {
        SpringApplication.run(partnerCampusApplication.class, args);
    }

}
