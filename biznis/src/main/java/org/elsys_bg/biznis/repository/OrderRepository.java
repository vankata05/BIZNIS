package org.elsys_bg.biznis.repository;

import org.elsys_bg.biznis.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByItemName(String itemName);

    List<Order> findByItemNameContainingIgnoreCase(String itemName);

    List<Order> findByItemNameAndIdGreaterThan(String itemName, Long id);
}
