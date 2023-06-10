package org.elsys_bg.biznis.service.impl;

import org.elsys_bg.biznis.entity.Order;
import org.elsys_bg.biznis.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl {
    private OrderRepository orderRepository;

    @Autowired
    public void OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        // Additional business logic if needed before saving the order
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public List<Order> getOrdersByItemName(String itemName) {
        return orderRepository.findByItemName(itemName);
    }

    public List<Order> searchOrdersByItemName(String itemName) {
        return orderRepository.findByItemNameContainingIgnoreCase(itemName);
    }

    public List<Order> getOrdersByItemNameAndIdGreaterThan(String itemName, Long id) {
        return orderRepository.findByItemNameAndIdGreaterThan(itemName, id);
    }

    public Order updateOrder(Order updatedOrder) {
        // Additional business logic if needed before updating the order
        return orderRepository.save(updatedOrder);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
