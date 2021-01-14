package com.jerrykcode.springcloud;

import com.jerrykcode.rule.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = RuleConfig.class)
public class DeptConsumer_8008 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8008.class);
    }
}
