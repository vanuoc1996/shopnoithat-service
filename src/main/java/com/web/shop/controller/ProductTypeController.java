package com.web.shop.controller;

import com.web.shop.entity.ProductType;
import com.web.shop.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/producttype")
@CrossOrigin(origins = "*")
@Validated
public class ProductTypeController {
    @Autowired
    IProductTypeService productTypeService;

    @GetMapping
    public ResponseEntity<?> getAllVoteProduct() {
        List<ProductType> entity = productTypeService.getAllProductType();
        return new ResponseEntity<List<ProductType>>(entity, HttpStatus.OK);
    }
}
