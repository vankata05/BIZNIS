package org.elsys_bg.biznis.mappers.impl;

import org.elsys_bg.biznis.entity.Customer;
import org.elsys_bg.biznis.mappers.CustomerMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapperImpl implements CustomerMapper {
    @Override
    public Customer mapToCustomer(String firstName, String lastName, String email) {
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        return customer;
    }
}
