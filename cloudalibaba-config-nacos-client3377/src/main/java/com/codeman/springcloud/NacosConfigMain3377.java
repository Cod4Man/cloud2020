package com.codeman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/1/4 23:53
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain3377.class, args);
    }
}
