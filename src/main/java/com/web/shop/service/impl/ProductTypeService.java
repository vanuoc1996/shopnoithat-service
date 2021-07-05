package com.web.shop.service.impl;

import com.web.shop.entity.ProductType;
import com.web.shop.repository.ProductTypeRepository;
import com.web.shop.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductTypeService implements IProductTypeService {
  @Autowired
    ProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> getAllProductType() {
        return productTypeRepository.findAll();
    }
}
