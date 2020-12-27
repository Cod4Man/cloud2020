package com.codeman.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/8 22:15
 * @version: 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLogLevel() {
        return Logger.Level.FULL;
    }
}
