package org.elsys_bg.biznis.service.impl;

import lombok.RequiredArgsConstructor;
import org.elsys_bg.biznis.entity.Product;
import org.elsys_bg.biznis.repository.ProductRepository;
import org.elsys_bg.biznis.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    public final ProductRepository productRepository;

    public Product getById(Long productId){
        return productRepository.getById(productId);
    }

    public Product getByProduct(String product){
        return productRepository.findByProduct(product);
    }

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product){
        return productRepository.save(product);
    }

    @Override
    public void delete(Product product){
        productRepository.delete(product);
    }

    @Override
    public Product updateProduct(Product product) throws NoSuchElementException {
        Product existingProduct = productRepository.findById(Long.valueOf(product.getId())).orElse(null);

        if(existingProduct != null){
            existingProduct.setProduct(product.getProduct());
            productRepository.save(existingProduct);
        }else{
            throw new NoSuchElementException("ERR: Product with ID " + product.getId() + " does not exist.");
        }

        return existingProduct;
    }

    public boolean productExists(String product){
        return productRepository.productExists(product);
    }
}