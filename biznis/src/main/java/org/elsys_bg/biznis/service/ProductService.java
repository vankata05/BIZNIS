package org.elsys_bg.biznis.service;

import org.elsys_bg.biznis.entity.Product;

import java.util.List;

public interface ProductService{
    List<Product> findAll();

    Product save(Product product);

    void delete(Product product);

    Product updateProduct(Product admin);
}
