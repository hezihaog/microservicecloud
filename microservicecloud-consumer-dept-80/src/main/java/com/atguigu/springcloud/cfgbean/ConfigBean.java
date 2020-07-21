package com.atguigu.springcloud.cfgbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/21 5:27 下午
 * <p>
 * 配置类
 */
@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}