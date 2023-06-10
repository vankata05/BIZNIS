package org.elsys_bg.biznis.service;

import java.util.Map;

public interface AvailableProductsService {
    void addProduct(Long productId, int quantity);

    void removeProduct(Long productId);

    boolean hasProduct(Long productId);

    int getProductQuantity(Long productId);

    Map<Long, Integer> getAllProducts();
}
