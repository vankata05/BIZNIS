package org.elsys_bg.biznis.controller;

import org.elsys_bg.biznis.entity.Product;
import org.elsys_bg.biznis.entity.ProductCatalog;
import org.elsys_bg.biznis.service.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product-catalogs")
public class ProductCatalogController {
    private final ProductCatalogService productCatalogService;

    @Autowired
    public ProductCatalogController(ProductCatalogService productCatalogService) {
        this.productCatalogService = productCatalogService;
    }

    @PostMapping
    public ProductCatalog createProductCatalog(@RequestBody ProductCatalog productCatalog) {
        return productCatalogService.createProductCatalog(productCatalog);
    }

    @GetMapping
    public List<ProductCatalog> getAllProductCatalogs() {
        return productCatalogService.getAllProductCatalogs();
    }

    @GetMapping("/{id}")
    public ProductCatalog getProductCatalogById(@PathVariable Long id) {
        Optional<ProductCatalog> productCatalog = productCatalogService.getProductCatalogById(id);
        if (productCatalog.isPresent()) {
            return productCatalog.get();
        } else {
            throw new IllegalArgumentException("Product catalog not found with ID: " + id);
        }
    }

    @PutMapping("/{id}")
    public ProductCatalog updateProductCatalog(@PathVariable Long id, @RequestBody ProductCatalog updatedProductCatalog) {
        Optional<ProductCatalog> productCatalog = productCatalogService.getProductCatalogById(id);
        if (productCatalog.isPresent()) {
            updatedProductCatalog.setId(id);
            return productCatalogService.updateProductCatalog(updatedProductCatalog);
        } else {
            throw new IllegalArgumentException("Product catalog not found with ID: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProductCatalog(@PathVariable Long id) {
        productCatalogService.deleteProductCatalog(id);
    }

    @PostMapping("/{id}/products")
    public void addProductToCatalog(@PathVariable Long id, @RequestBody Product product) {
        productCatalogService.addProductToCatalog(id, product);
    }

    @DeleteMapping("/{id}/products/{productId}")
    public void removeProductFromCatalog(@PathVariable Long id, @PathVariable Long productId) {
        productCatalogService.removeProductFromCatalog(id, productId);
    }
}
