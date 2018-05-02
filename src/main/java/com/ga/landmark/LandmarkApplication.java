package com.ga.landmark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ga.landmark.mapper")
public class LandmarkApplication {

    public static void main(String[] args) {
        SpringApplication.run(LandmarkApplication.class, args);
    }
}
