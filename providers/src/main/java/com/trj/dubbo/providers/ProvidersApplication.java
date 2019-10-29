package com.trj.dubbo.providers;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "com.trj.dubbo.providers.service")
@SpringBootApplication
public class ProvidersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvidersApplication.class, args);
    }

}
