package org.elsys_bg.biznis.mappers;

import org.elsys_bg.biznis.entity.Order;
import org.elsys_bg.biznis.entity.OrderItem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderMapper {
    Order mapToOrder(Long customerId, List<OrderItem> orderItems);
}
