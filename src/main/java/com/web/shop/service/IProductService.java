package com.web.shop.service;

import com.web.shop.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface IProductService {
    List<Product> getAllProduct();

    long countProduct(int productTypeId);
}
