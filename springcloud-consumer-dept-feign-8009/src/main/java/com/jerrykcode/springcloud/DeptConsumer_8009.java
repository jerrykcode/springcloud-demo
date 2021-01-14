package com.jerrykcode.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = {"org.jerrykcode.springcloud"})
@EnableEurekaClient
@ComponentScan("com.jerrykcode.springcloud")
public class DeptConsumer_8009 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8009.class);
    }
}
