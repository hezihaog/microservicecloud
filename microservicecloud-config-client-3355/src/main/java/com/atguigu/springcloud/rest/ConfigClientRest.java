package com.atguigu.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/23 4:18 下午
 * <p>
 */
@RestController
public class ConfigClientRest {
    /**
     * 服务名称
     */
    @Value("${spring.application.name}")
    private String applicationName;
    /**
     * eureka服务地址
     */
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;
    /**
     * 服务端口号
     */
    @Value("${server.port}")
    private String port;

    /**
     * 获取配置
     */
    @RequestMapping("/config")
    public String getConfig() {
        String str = "applicationName: " + applicationName + "\t eurekaServers: " + eurekaServers + "\t port: " + port;
        System.out.println("********** str: " + str);
        return str;
    }
}