package com.web.shop.repository;

import com.web.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    long countProductByProductTypeId(int productTypeId);
}
