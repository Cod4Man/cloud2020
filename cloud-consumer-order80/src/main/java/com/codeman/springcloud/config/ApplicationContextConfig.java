package com.codeman.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/11/30 22:18
 * @version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    // 开启负载均衡
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
