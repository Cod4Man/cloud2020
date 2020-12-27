package com.codeman.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/3 22:17
 * @version: 1.0
 */
@SpringBootApplication
// Eureka服务注册中心
@EnableEurekaServer
public class EurekaMain7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7003.class, args);
    }
}
