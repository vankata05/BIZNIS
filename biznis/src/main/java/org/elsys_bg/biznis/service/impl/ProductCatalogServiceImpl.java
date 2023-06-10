package org.elsys_bg.biznis.service.impl;

import org.elsys_bg.biznis.entity.Product;
import org.elsys_bg.biznis.entity.ProductCatalog;
import org.elsys_bg.biznis.repository.ProductCatalogRepository;
import org.elsys_bg.biznis.service.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {
    private final ProductCatalogRepository productCatalogRepository;

    @Autowired
    public ProductCatalogServiceImpl(ProductCatalogRepository productCatalogRepository) {
        this.productCatalogRepository = productCatalogRepository;
    }

    @Override
    public ProductCatalog createProductCatalog(ProductCatalog productCatalog) {
        validateProductCatalog(productCatalog);
        return productCatalogRepository.save(productCatalog);
    }

    @Override
    public List<ProductCatalog> getAllProductCatalogs() {
        return productCatalogRepository.findAll();
    }

    @Override
    public Optional<ProductCatalog> getProductCatalogById(Long id) {
        return productCatalogRepository.findById(id);
    }

    @Override
    public ProductCatalog updateProductCatalog(ProductCatalog updatedProductCatalog) {
        validateProductCatalog(updatedProductCatalog);
        return productCatalogRepository.save(updatedProductCatalog);
    }

    @Override
    public void deleteProductCatalog(Long id) {
        productCatalogRepository.deleteById(id);
    }

    @Override
    public void addProductToCatalog(Long catalogId, Product product) {
        Optional<ProductCatalog> catalogOptional = productCatalogRepository.findById(catalogId);
        if (catalogOptional.isPresent()) {
            ProductCatalog productCatalog = catalogOptional.get();
            productCatalog.addProduct(product);
            productCatalogRepository.save(productCatalog);
        } else {
            throw new IllegalArgumentException("Product catalog not found with ID: " + catalogId);
        }
    }

    @Override
    public void removeProductFromCatalog(Long catalogId, Long productId) {
        Optional<ProductCatalog> catalogOptional = productCatalogRepository.findById(catalogId);
        if (catalogOptional.isPresent()) {
            ProductCatalog productCatalog = catalogOptional.get();
            productCatalog.getProducts().removeIf(product -> product.getId().equals(productId));
            productCatalogRepository.save(productCatalog);
        } else {
            throw new IllegalArgumentException("Product catalog not found with ID: " + catalogId);
        }
    }

    private void validateProductCatalog(ProductCatalog productCatalog) {
        if (productCatalog.getName() == null || productCatalog.getName().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
}
