package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/21 6:47 下午
 * <p>
 */
@SpringBootApplication
//配置Eureka客户端
@EnableEurekaClient
//配置使用Feign客户端，配置要扫描的包
@EnableFeignClients(basePackages = "com.atguigu.springcloud")
public class DeptConsumer80FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80FeignApp.class, args);
    }
}