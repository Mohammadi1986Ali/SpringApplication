package com.javalab.tutorial.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CustomerServiceImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImplTest.class);
    static ApplicationContext context;

    @BeforeAll
    static void setup() {
        LOGGER.info("Setting test environment");
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void whenCustomerObjectCreatedByApplicationContext_thenCustomerMustBeCreated() {
        LOGGER.info("CustomerServiceImplTest#whenCustomerObjectCreatedByApplicationContext_thenCustomerMustBeCreated");
        CustomerServiceImpl customerService = context.getBean("customerService", CustomerServiceImpl.class);
        customerService.findCustomerById();
        customerService.findAllCustomer();
    }
}