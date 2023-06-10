package org.elsys_bg.biznis.entity;

import java.util.HashMap;
import java.util.Map;

public class AvailableProducts {
    private Map<Long, Integer> products;

    public AvailableProducts() {
        this.products = new HashMap<>();
    }

    public void addProduct(Long productId, int quantity) {
        if (productId <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid product ID or quantity");
        }
        products.put(productId, quantity);
    }

    public void removeProduct(Long productId) {
        if (productId <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        products.remove(productId);
    }

    public boolean hasProduct(Long productId) {
        if (productId <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        return products.containsKey(productId);
    }

    public int getProductQuantity(Long productId) {
        if (productId <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        return products.getOrDefault(productId, 0);
    }

    public Map<Long, Integer> getAllProducts() {
        return new HashMap<>(products);
    }
}
