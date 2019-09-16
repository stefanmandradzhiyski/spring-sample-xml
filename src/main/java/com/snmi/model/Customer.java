package com.snmi.model;

/**
 * Customer entity
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Customer {

    /**
     * Variables
     */
    private String firstName;
    private String lastName;

    /**
     * Default constructor
     */
    public Customer() {}

    /**
     * Getters and setters
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
