package com.web.shop.repository;

import com.web.shop.entity.Product;
import com.web.shop.entity.request.SearchProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    long countProductByProductTypeId(int productTypeId);

    @Query(value = "select * from Product where productCode like %:productCode% and productName like %:productName% " +
            "and priceNew between :priceNewMin and :priceNewMax", nativeQuery = true)
    List<Product> findByProductTypeId( @Param("productCode") String productCode, @Param("productName")String productName,
                                      @Param("priceNewMin")long priceNewMin, @Param("priceNewMax")long priceNewMax);
}
