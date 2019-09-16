package com.snmi.repository;

import com.snmi.model.Customer;
import java.util.List;

/**
 * Customer repository interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface CustomerRepository {

    List<Customer> findAll();

}
