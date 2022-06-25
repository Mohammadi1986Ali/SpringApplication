package com.javalab.tutorial;

import com.javalab.tutorial.model.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ApplicationTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);

    static ApplicationContext context;

    @BeforeAll
    static void setup() {
        LOGGER.info("Setting test environment");
        LOGGER.info("Initializing context");
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void whenCustomerObjectCreated_thenCustomerObjectMustBeCreated() {
        LOGGER.info("ApplicationTest#whenCustomerObjectCreated_thenCustomerObjectMustBeCreated");
        Customer customer = new Customer();
        Assertions.assertThat(customer).isNotNull();
    }

    @Test
    void whenCustomerCreatedBySpringContext_thenCustomerPropertiesMustHaveDefaultValue() {
        LOGGER.info("ApplicationTest#whenCustomerCreatedBySpringContext_thenCustomerPropertiesMustHaveDefaultValue");
        Customer customer = context.getBean("customer", Customer.class);
        Assertions.assertThat(customer.getName()).isEqualTo("Ali");
        Assertions.assertThat(customer.getFamily()).isEqualTo("Mohammadi");
        Assertions.assertThat(customer.getAge()).isEqualTo(30);
    }
}