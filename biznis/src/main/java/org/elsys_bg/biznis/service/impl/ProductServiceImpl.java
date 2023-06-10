package org.elsys_bg.biznis.service;

import org.elsys_bg.biznis.entity.Product;
import org.elsys_bg.biznis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        validateProduct(product);
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID value");
        }
        return productRepository.findById(id);
    }

    @Override
    public Product updateProduct(Product updatedProduct) {
        validateProduct(updatedProduct);
        if (updatedProduct.getId() == null || updatedProduct.getId() <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        return productRepository.save(updatedProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID value");
        }
        productRepository.deleteById(id);
    }

    private void validateProduct(Product product) {
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }
}
