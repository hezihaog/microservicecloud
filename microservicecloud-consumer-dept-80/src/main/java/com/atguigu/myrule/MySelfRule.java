package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/22 9:40 下午
 * <p>
 */
@Configuration
public class MySelfRule {
    /**
     * 配置负载均衡算法策略
     */
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}