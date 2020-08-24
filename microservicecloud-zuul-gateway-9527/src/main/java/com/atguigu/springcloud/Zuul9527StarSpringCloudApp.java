package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/23 11:45 上午
 * <p>
 * 网关
 */
@SpringBootApplication
//标识当前服务为Zuul网关
@EnableZuulProxy
public class Zuul9527StarSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527StarSpringCloudApp.class, args);
    }
}