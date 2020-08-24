package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/21 3:53 下午
 * <p>
 * 使用配置中心改造后的，服务提供方Provider
 */
@SpringBootApplication
//表示当前为Eureka的客户端
@EnableEurekaClient
//开启服务发现
@EnableDiscoveryClient
public class ConfigClientDeptProvider8001App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientDeptProvider8001App.class, args);
    }
}