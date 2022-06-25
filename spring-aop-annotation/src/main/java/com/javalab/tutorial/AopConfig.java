package com.javalab.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(AopConfig.class);

    public AopConfig() {
        LOGGER.info("AopConfig#AopConfig");
    }
}
