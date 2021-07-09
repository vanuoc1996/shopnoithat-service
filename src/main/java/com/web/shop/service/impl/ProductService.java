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
    public List<Product> searchProduct(SearchProduct searchProduct) {
        String productCode = searchProduct.getProductCode();
        String productName = searchProduct.getProductName();
        long priceNewMin = searchProduct.getPriceNewMin();
        long priceNewMax = searchProduct.getPriceNewMax();
        return productRepository.searchProduct(productCode, productName, priceNewMin, priceNewMax);
    }

    @Override
    public Product getProductByProductId(int ProductId) {
        return productRepository.findById(ProductId).get();
    }

    @Override
    public long countProduct(int productTypeId) {
        return productRepository.countProductByProductTypeId(productTypeId);
    }

    @Override
    public void creatProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
        Product product = getProductByProductId(productId);
        productRepository.delete(product);
    }
}
