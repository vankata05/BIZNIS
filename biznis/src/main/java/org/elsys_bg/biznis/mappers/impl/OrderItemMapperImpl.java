package org.elsys_bg.biznis.mappers.impl;

import org.elsys_bg.biznis.entity.OrderItem;
import org.elsys_bg.biznis.mappers.OrderItemMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapperImpl implements OrderItemMapper {
    @Override
    public OrderItem mapToOrderItem(Long productId, int quantity) {
        OrderItem orderItem = new OrderItem();
        orderItem.setProductId(productId);
        orderItem.setQuantity(quantity);
        return orderItem;
    }
}
