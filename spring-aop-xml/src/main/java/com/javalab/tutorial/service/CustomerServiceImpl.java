package com.javalab.tutorial.service;

import com.javalab.tutorial.api.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerServiceImpl implements CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl() {
        LOGGER.info("CustomerServiceImpl#CustomerServiceImpl");
    }

    @Override
    public void findAllCustomer() {
        LOGGER.info("CustomerServiceImpl#findAllCustomer");
    }

    @Override
    public void findCustomerById() {
        LOGGER.info("CustomerServiceImpl#findCustomerById");
    }
}