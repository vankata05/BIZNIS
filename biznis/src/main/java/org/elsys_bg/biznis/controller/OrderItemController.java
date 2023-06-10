package org.elsys_bg.biznis.controller;

import org.elsys_bg.biznis.entity.OrderItem;
import org.elsys_bg.biznis.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {
    private final OrderItemService orderItemService;

    @Autowired
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.createOrderItem(orderItem);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItemById(@PathVariable Long id) {
        Optional<OrderItem> orderItem = orderItemService.getOrderItemById(id);
        if (orderItem.isPresent()) {
            return orderItem.get();
        } else {
            throw new IllegalArgumentException("Order item not found with ID: " + id);
        }
    }

    @PutMapping("/{id}")
    public OrderItem updateOrderItem(@PathVariable Long id, @RequestBody OrderItem updatedOrderItem) {
        Optional<OrderItem> orderItem = orderItemService.getOrderItemById(id);
        if (orderItem.isPresent()) {
            updatedOrderItem.setId(id);
            return orderItemService.updateOrderItem(updatedOrderItem);
        } else {
            throw new IllegalArgumentException("Order item not found with ID: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteOrderItem(id);
    }
}
