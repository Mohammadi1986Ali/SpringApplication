package com.javalab.tutorial.service;

import com.javalab.tutorial.api.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    private static Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Override
    public void findAllCustomer() {
        LOGGER.info("CustomerServiceImpl#findAllCustomer");
    }

    @Override
    public void findCustomerById() {
        LOGGER.info("CustomerServiceImpl#findCustomerById");
    }
}
