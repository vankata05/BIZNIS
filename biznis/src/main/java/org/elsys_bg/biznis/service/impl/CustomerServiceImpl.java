package org.elsys_bg.biznis.service.impl;

import org.elsys_bg.biznis.entity.Customer;
import org.elsys_bg.biznis.repository.CustomerRepository;
import org.elsys_bg.biznis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        validateCustomer(customer);
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found with ID: " + id));
    }

    @Override
    public Customer updateCustomer(Customer updatedCustomer) {
        validateCustomer(updatedCustomer);
        return customerRepository.save(updatedCustomer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    private void validateCustomer(Customer customer) {
        if (customer.getName() == null || customer.getName().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (customer.getEmail() == null || !customer.getEmail().matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
            throw new IllegalArgumentException("Invalid email format");
        }
    }
}
