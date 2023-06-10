package org.elsys_bg.biznis.service;

import org.elsys_bg.biznis.entity.OrderItem;

import java.util.List;
import java.util.Optional;

public interface OrderItemService {
    OrderItem createOrderItem(OrderItem orderItem);

    List<OrderItem> getAllOrderItems();

    Optional<OrderItem> getOrderItemById(Long id);

    OrderItem updateOrderItem(OrderItem updatedOrderItem);

    void deleteOrderItem(Long id);
}
