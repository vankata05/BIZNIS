package org.elsys_bg.biznis.service;

import org.elsys_bg.biznis.entity.Product;
import org.elsys_bg.biznis.entity.ProductCatalog;

import java.util.List;
import java.util.Optional;

public interface ProductCatalogService {
    ProductCatalog createProductCatalog(ProductCatalog productCatalog);

    List<ProductCatalog> getAllProductCatalogs();

    Optional<ProductCatalog> getProductCatalogById(Long id);

    ProductCatalog updateProductCatalog(ProductCatalog updatedProductCatalog);

    void deleteProductCatalog(Long id);

    void addProductToCatalog(Long catalogId, Product product);

    void removeProductFromCatalog(Long catalogId, Long productId);
}
