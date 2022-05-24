package com.javalab.tutorial.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectService {

    private static Logger LOGGER = LoggerFactory.getLogger(AspectService.class);

    @Before("execution(* com.javalab.tutorial.service.CustomerServiceImpl+.*(..))")
    public void beforeService() {
        LOGGER.info("AspectService#beforeService");
    }

    @After("execution(* com.javalab.tutorial.service.CustomerServiceImpl+.*(..))")
    public void afterService() {
        LOGGER.info("AspectService#afterService");
    }
}
