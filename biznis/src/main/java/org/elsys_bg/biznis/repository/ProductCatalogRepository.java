package org.elsys_bg.biznis.repository;

import org.elsys_bg.biznis.entity.ProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCatalogRepository extends JpaRepository<ProductCatalog, Long> {
}
