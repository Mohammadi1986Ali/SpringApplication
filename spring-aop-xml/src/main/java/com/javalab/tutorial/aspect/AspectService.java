package com.javalab.tutorial.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspectService {
    private static Logger LOGGER = LoggerFactory.getLogger(AspectService.class);

    public void beforeService() {
        LOGGER.info("AspectService#beforeService");
        LOGGER.info("Before service");
    }

    public void afterService() {
        LOGGER.info("AspectService#afterService");
        LOGGER.info("After service");
    }
}
