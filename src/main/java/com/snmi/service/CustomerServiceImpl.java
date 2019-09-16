package com.snmi.service;

import com.snmi.model.Customer;
import com.snmi.repository.CustomerRepository;
import java.util.List;

/**
 * Customer service implementation
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class CustomerServiceImpl implements CustomerService{

    /**
     * Variable (Can be set by field dependency injection)
     */
    private CustomerRepository customerRepository;

    /**
     * Default constructor
     */
    public CustomerServiceImpl() {}

    /**
     * Custom constructor which set the customer repository (Can be set by constructor dependency injection)
     * @param customerRepository take the customer repository object
     */
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Find all customers using the customer repository
     * @return return customers list
     */
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    /**
     * Set customer repository (Can be set by setter dependency injection)
     * @param customerRepository take the customer repository
     */
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
