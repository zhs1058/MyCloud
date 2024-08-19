package com.zhs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * Created by 89704 on 2024/8/14.
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.zhs.*")
public class OrderApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(OrderApplication.class, args);

        while (true) {
            String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            String commonUrl = run.getEnvironment().getProperty("spring.datasource.url");
            String orderServiceName = run.getEnvironment().getProperty("orderService.name");
            System.out.println(format + "-commonUrl: " + commonUrl + " , " + "-orderServiceName: " + orderServiceName);

            TimeUnit.SECONDS.sleep(3);
        }
    }
}