package com.web.shop.service.impl;

import com.web.shop.entity.Product;
import com.web.shop.repository.ProductRepository;
import com.web.shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService implements IProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public long countProduct(int productTypeId) {
        return productRepository.countProductByProductTypeId(productTypeId);
    }
}
