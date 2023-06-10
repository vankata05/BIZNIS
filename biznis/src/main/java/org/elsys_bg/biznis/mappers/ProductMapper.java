package org.elsys_bg.biznis.mappers;

import org.elsys_bg.biznis.entity.Product;
import org.elsys_bg.biznis.entity.ProductCatalog;
import org.springframework.stereotype.Component;

@Component
public interface ProductMapper {
    Product mapToProduct(String productName, double price, ProductCatalog productCatalog);
}
