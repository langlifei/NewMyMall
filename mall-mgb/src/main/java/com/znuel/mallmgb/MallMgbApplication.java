package com.znuel.mallmgb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.znuel.mallmgb.mapper")
public class MallMgbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMgbApplication.class, args);
    }

}
