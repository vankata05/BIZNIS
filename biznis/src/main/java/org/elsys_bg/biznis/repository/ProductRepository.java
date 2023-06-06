package org.elsys_bg.biznis.repository;

import org.elsys_bg.biznis.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    @Query("SELECT p FROM Product p WHERE p.product = :product")
    Product findByProduct(String product);

    default boolean productExists(String productName){
        Product product = findByProduct(productName);
        return product != null;
    }
}