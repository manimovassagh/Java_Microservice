package com.github.manimovassagh.customer.services;


import com.github.manimovassagh.customer.models.Customer;
import com.github.manimovassagh.customer.models.CustomerRegistrationRequest;

public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email()).build();

        //TODO: check if email is valid
        //TODO: check if email is not taken
        //TODO: store the customer data in database


    }
}
