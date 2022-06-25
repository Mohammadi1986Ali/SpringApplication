package com.javalab.tutorial;

import com.javalab.tutorial.service.CustomerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        LOGGER.info("Application#main");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerServiceImpl customerService = context.getBean("customerServiceImpl", CustomerServiceImpl.class);
        customerService.findCustomerById();
        customerService.findAllCustomer();
    }
}
