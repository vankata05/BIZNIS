package org.elsys_bg.biznis.service.impl;

import org.elsys_bg.biznis.entity.AvailableProducts;
import org.elsys_bg.biznis.service.AvailableProductsService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AvailableProductsServiceImpl implements AvailableProductsService {
    private final AvailableProducts availableProducts;

    public AvailableProductsServiceImpl(AvailableProducts availableProducts) {
        this.availableProducts = availableProducts;
    }

    @Override
    public void addProduct(Long productId, int quantity) {
        availableProducts.addProduct(productId, quantity);
    }

    @Override
    public void removeProduct(Long productId) {
        availableProducts.removeProduct(productId);
    }

    @Override
    public boolean hasProduct(Long productId) {
        return availableProducts.hasProduct(productId);
    }

    @Override
    public int getProductQuantity(Long productId) {
        return availableProducts.getProductQuantity(productId);
    }

    @Override
    public Map<Long, Integer> getAllProducts() {
        return availableProducts.getAllProducts();
    }
}
