package org.elsys_bg.biznis.repository;

import org.elsys_bg.biznis.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByEmail(String email);

    // Additional methods if needed

}
