package org.elsys_bg.biznis.mappers.impl;

import org.elsys_bg.biznis.entity.Product;
import org.elsys_bg.biznis.entity.ProductCatalog;
import org.elsys_bg.biznis.mappers.ProductMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {
    @Override
    public Product mapToProduct(String productName, double price, ProductCatalog productCatalog) {
        Product product = new Product();
        product.setName(productName);
        product.setPrice(price);
        product.setProductCatalog(productCatalog);
        return product;
    }
}
