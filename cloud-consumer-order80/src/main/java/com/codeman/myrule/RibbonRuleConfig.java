package com.codeman.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/6 22:04
 * @version: 1.0
 */
@Configuration
public class RibbonRuleConfig {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
