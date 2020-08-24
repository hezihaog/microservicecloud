package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/23 3:22 下午
 * <p>
 * 配置中心
 */
@SpringBootApplication
//标识为Config配置中心
@EnableConfigServer
public class Config3344StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config3344StartSpringCloudApp.class, args);
    }
}