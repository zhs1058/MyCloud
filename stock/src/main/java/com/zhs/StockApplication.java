package com.zhs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 89704 on 2024/8/14.
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.zhs.*")
public class StockApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StockApplication.class, args);
    }
}