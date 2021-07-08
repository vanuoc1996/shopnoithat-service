package com.web.shop.service;

import com.web.shop.entity.Product;
import com.web.shop.entity.request.SearchProduct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface IProductService {
    List<Product> getAllProduct();

    List<Product> getAllProductByProductType(SearchProduct searchProduct);

    long countProduct(int productTypeId);
}
