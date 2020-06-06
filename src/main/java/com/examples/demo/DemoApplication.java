package com.examples.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        int intCode = (int)(Math.random()*900000)+100000;
        String checkCode = Integer.toString(intCode);

        SpringApplication.run(DemoApplication.class, args);
    }
}
