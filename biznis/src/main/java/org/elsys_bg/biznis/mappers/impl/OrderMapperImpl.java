package org.elsys_bg.biznis.mappers.impl;

import org.elsys_bg.biznis.entity.Order;
import org.elsys_bg.biznis.entity.OrderItem;
import org.elsys_bg.biznis.mappers.OrderMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderMapperImpl implements OrderMapper {
    @Override
    public Order mapToOrder(Long customerId, List<OrderItem> orderItems) {
        Order order = new Order();
        order.setCustomerId(customerId);
        order.setOrderItems(orderItems);
        return order;
    }
}
