package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/22 3:11 下午
 * <p>
 * Eureka Server端
 */
@SpringBootApplication
//告诉SpringBoot，本文件为Eureka Server启动类
@EnableEurekaServer
public class ConfigGitEurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigGitEurekaServerApp.class, args);
    }
}