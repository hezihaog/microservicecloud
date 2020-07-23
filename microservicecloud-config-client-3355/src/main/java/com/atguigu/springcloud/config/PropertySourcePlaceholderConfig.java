package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/23 4:34 下午
 * <p>
 * 解决Spring的@Value注解在当前的yml配置文件中，没有找到属性时报错
 */
@Configuration
public class PropertySourcePlaceholderConfig {
    /**
     * 忽略没有找到属性，因为我们的配置在拉取远程配置后进行动态配置的，本地文件中没有
     */
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setIgnoreUnresolvablePlaceholders(true);
        return configurer;
    }
}