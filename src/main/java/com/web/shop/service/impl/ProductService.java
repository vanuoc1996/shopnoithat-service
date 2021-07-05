package com.web.shop.service.impl;

import com.web.shop.entity.Product;
import com.web.shop.entity.request.SearchProduct;
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
    public List<Product> getAllProductByProductType(SearchProduct searchProduct) {
        int productTypeId = searchProduct.getProductTypeId();
        String productCode = searchProduct.getProductName();
        String productName = searchProduct.getProductName();
        long priceNewMin = searchProduct.getPriceNewMin();
        long priceNewMax = searchProduct.getPriceNewMax();
        return productRepository.findByProductTypeId(productTypeId, productCode, productName, priceNewMin, priceNewMax);
    }

    @Override
    public long countProduct(int productTypeId) {
        return productRepository.countProductByProductTypeId(productTypeId);
    }
}
