package org.elsys_bg.biznis.mappers.impl;

import org.elsys_bg.biznis.entity.AvailableProducts;
import org.elsys_bg.biznis.mappers.AvailableProductsMapper;
import org.springframework.stereotype.Component;

@Component
public class AvailableProductsMapperImpl implements AvailableProductsMapper {
    @Override
    public AvailableProducts mapToAvailableProducts() {
        return new AvailableProducts();
    }
}
