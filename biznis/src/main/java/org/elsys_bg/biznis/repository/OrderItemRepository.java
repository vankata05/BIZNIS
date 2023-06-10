package org.elsys_bg.biznis.repository;

import org.elsys_bg.biznis.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Additional methods if needed
}
