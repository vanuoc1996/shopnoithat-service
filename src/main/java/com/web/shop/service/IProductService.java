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

    List<Product> searchProduct(SearchProduct searchProduct);

    Product getProductByProductId(int ProductId);

    long countProduct(int productTypeId);

    void creatProduct(Product product);

    void deleteProduct(int productId);
}
