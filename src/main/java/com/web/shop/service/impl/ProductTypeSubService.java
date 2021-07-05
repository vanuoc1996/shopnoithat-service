package com.web.shop.service.impl;

import com.web.shop.entity.ProductTypeSub;
import com.web.shop.repository.ProductTypeSubRepository;
import com.web.shop.service.IProductTypeSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductTypeSubService implements IProductTypeSubService {
    @Autowired
    ProductTypeSubRepository productTypeSubRepository;

    @Override
    public List<ProductTypeSub> getAllProductTypeSub() {
        return productTypeSubRepository.findAll();
    }
}
