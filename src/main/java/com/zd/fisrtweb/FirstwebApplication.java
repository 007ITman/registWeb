package com.zd.fisrtweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstwebApplication.class, args);
    }

    private String startTime() {
        return "2020/06/06";
    }

    private String endTime() {return "";}

}
