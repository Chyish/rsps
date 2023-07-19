package com.ethan.rsps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RspsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RspsApplication.class, args);
    }

}
