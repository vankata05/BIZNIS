package org.elsys_bg.biznis.mappers;

import org.elsys_bg.biznis.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public interface CustomerMapper {
    Customer mapToCustomer(String firstName, String lastName, String email);
}
