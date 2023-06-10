package org.elsys_bg.biznis.mappers.impl;

import org.elsys_bg.biznis.entity.ProductCatalog;
import org.elsys_bg.biznis.mappers.ProductCatalogMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductCatalogMapperImpl implements ProductCatalogMapper {
    @Override
    public ProductCatalog mapToProductCatalog(String catalogName) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.setName(catalogName);
        return productCatalog;
    }
}
