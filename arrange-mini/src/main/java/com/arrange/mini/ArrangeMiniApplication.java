package com.arrange.mini;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@SpringBootConfiguration
@MapperScan(value = "com.arrange.mini.mapper")
public class ArrangeMiniApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArrangeMiniApplication.class, args);
    }

}
