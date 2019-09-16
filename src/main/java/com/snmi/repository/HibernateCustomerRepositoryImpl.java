package com.snmi.repository;

import com.snmi.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import java.util.ArrayList;
import java.util.List;

/**
 * Customer repository implementation
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository{

    /**
     * Variables (Can be set by field dependency injection)
     */
    @Value("${dbUsername}")
    private String dbUsername;

    /**
     * Find all method
     * @return the created customer
     */
    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Stefan");
        customer.setLastName("Mandradzhiyski");

        customers.add(customer);

        return customers;
    }

    /**
     * Setting the username (Can be set by setter dependency injection)
     * @param dbUsername take the username
     */
    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

}
