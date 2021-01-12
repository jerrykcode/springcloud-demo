package com.jerrykcode.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
@EnableEurekaClient
public class DeptConsumer_8008 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8008.class);
    }
}
