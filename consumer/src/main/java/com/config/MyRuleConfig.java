package com.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRuleConfig {

    @Bean
    public IRule myRule(){
        //使用自定义的负载均衡策略
        return new MyRule();
    }
}
