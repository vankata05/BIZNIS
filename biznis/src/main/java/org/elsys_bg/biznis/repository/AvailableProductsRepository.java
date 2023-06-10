package org.elsys_bg.biznis.repository;

import org.elsys_bg.biznis.entity.AvailableProducts;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AvailableProductsRepository {
    private final AvailableProducts availableProducts;

    public AvailableProductsRepository(AvailableProducts availableProducts) {
        this.availableProducts = availableProducts;
    }

    public void addProduct(Long productId, int quantity) {
        availableProducts.addProduct(productId, quantity);
    }

    public void removeProduct(Long productId) {
        availableProducts.removeProduct(productId);
    }

    public boolean hasProduct(Long productId) {
        return availableProducts.hasProduct(productId);
    }

    public int getProductQuantity(Long productId) {
        return availableProducts.getProductQuantity(productId);
    }

    public Map<Long, Integer> getAllProducts() {
        return availableProducts.getAllProducts();
    }
}
