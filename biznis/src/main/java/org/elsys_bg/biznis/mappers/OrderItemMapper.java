package org.elsys_bg.biznis.mappers;

import org.elsys_bg.biznis.entity.OrderItem;
import org.springframework.stereotype.Component;

@Component
public interface OrderItemMapper {
    OrderItem mapToOrderItem(Long productId, int quantity);
}
