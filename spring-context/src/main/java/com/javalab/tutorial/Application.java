package com.javalab.tutorial;

import com.javalab.tutorial.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("Application#main");

        LOGGER.info("Initializing context");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        LOGGER.info("Initializing customer");
        Customer customer = context.getBean("customer", Customer.class);

        LOGGER.info(customer.toString());
    }
}
