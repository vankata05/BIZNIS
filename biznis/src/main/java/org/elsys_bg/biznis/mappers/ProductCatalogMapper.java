package org.elsys_bg.biznis.mappers;

import org.elsys_bg.biznis.entity.ProductCatalog;
import org.springframework.stereotype.Component;

@Component
public interface ProductCatalogMapper {
    ProductCatalog mapToProductCatalog(String catalogName);
}
