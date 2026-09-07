package org.telusko.fresh_start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FreshStartApplication {

    public static void main(String[] args) {

        SpringApplication.run(FreshStartApplication.class, args);
        System.out.println("FreshStartApplication started");
        System.out.println("Hello world");
    }

}
