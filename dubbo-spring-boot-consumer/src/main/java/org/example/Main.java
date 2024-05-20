package org.example;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class Main {
    public static void main(String[] args) {
        System.setProperty("zookeeper.sasl.client", "false");
        SpringApplication.run(Main.class, args);
    }
}