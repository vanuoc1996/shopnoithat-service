package com.web.shop.service;

import com.web.shop.entity.ProductTypeSub;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface IProductTypeSubService {

    List<ProductTypeSub> getAllProductTypeSub();
}
