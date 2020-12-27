package com.codeman.springcloud.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/12/26 14:21
 * @version: 1.0
 */
@RefreshScope
@Component
public class ValueComponent {
    @Value("${config.info}")
    private String applicationName;

    public String getApplicationName() {
        return applicationName;
    }
}
