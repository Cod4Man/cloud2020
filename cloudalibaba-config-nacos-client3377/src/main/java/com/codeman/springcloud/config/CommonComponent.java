package com.codeman.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/1/5 0:02
 * @version: 1.0
 */
@Component
@RefreshScope
public class CommonComponent {

    @Value("${config.info}")
    private String configInfo;

    public String getConfigInfo() {
        return configInfo;
    }
}
