package com.trj.dubbo.consumers;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo(scanBasePackages = "com.trj.dubbo.consumers.action")
@ComponentScan(value = {"com.trj.dubbo.consumers.action"})
@SpringBootApplication
public class ConsumersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumersApplication.class, args);
    }

}
