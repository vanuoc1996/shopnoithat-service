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
<<<<<<< Updated upstream
    public List<Product> getAllProductByProductType(SearchProduct searchProduct) {
        int productTypeId = searchProduct.getProductTypeId();
=======
    public Product getProductByProductId(int productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public List<Product> searchProduct(SearchProduct searchProduct) {

>>>>>>> Stashed changes
        String productCode = searchProduct.getProductCode();
        String productName = searchProduct.getProductName();
        long priceNewMin = searchProduct.getPriceNewMin();
        long priceNewMax = searchProduct.getPriceNewMax();
<<<<<<< Updated upstream
        long a = searchProduct.
        return productRepository.findByProductTypeId( productCode, productName, priceNewMin, priceNewMax);
=======
        return productRepository.searchProduct(productCode, productName, priceNewMin, priceNewMax);
>>>>>>> Stashed changes
    }

    @Override
    public long countProduct(int productTypeId) {
        return productRepository.countProductByProductTypeId(productTypeId);
    }
}
