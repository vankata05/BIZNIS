package org.elsys_bg.biznis.service;

import org.elsys_bg.biznis.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    Customer updateCustomer(Customer updatedCustomer);

    void deleteCustomer(Long id);
}
