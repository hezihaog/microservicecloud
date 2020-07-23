package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/23 11:09 上午
 * <p>
 */
@SpringBootApplication
//开启HystrixDashboard仪表盘
@EnableHystrixDashboard
public class DeptConsumerDashboardApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboardApp.class, args);
    }
}