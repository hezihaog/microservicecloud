package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
//启动该微服务时，自动加载我们的自定义的Ribbon配置类，从而配置生效
//注意MySelfRule配置类不能放到包扫描的包及其自包下，否则锁引用到所有微服务，就不能单独配置了，所以我们新建一个myrule包来放
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class, args);
    }
}