package org.elsys_bg.biznis.service;

import org.elsys_bg.biznis.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product createProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product updateProduct(Product updatedProduct);

    void deleteProduct(Long id);
}
