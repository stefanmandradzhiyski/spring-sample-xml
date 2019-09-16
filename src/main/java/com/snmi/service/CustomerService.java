package com.snmi.service;

import com.snmi.model.Customer;
import java.util.List;

/**
 * Customer service interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface CustomerService {

    List<Customer> findAll();

}
