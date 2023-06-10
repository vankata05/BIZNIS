package org.elsys_bg.biznis.mappers;

import org.elsys_bg.biznis.entity.AvailableProducts;
import org.springframework.stereotype.Component;

@Component
public interface AvailableProductsMapper {
    AvailableProducts mapToAvailableProducts();
}
