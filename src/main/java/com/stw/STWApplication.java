package com.stw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class STWApplication {

    //java -jar xxx.jar --spring.profiles.active=dev 执行启动模式
    public static void main(String[] args) {
        SpringApplication.run(STWApplication.class, args);
    }
}
