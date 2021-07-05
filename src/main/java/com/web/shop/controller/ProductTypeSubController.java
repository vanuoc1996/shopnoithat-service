package com.web.shop.controller;

import com.web.shop.entity.ProductTypeSub;
import com.web.shop.service.IProductTypeSubService;
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
@RequestMapping(value = "api/v1/producttypesub")
@CrossOrigin(origins = "*")
@Validated
public class ProductTypeSubController {
    @Autowired
    IProductTypeSubService productTypeSubService;

    @GetMapping("getall")
    public ResponseEntity<?> getAllVoteProduct() {
        List<ProductTypeSub> entity = productTypeSubService.getAllProductTypeSub();
        return new ResponseEntity<List<ProductTypeSub>>(entity, HttpStatus.OK);
    }

    @GetMapping("count")
    public ResponseEntity<?> count() {
        List<ProductTypeSub> entity = productTypeSubService.getAllProductTypeSub();
        return new ResponseEntity<List<ProductTypeSub>>(entity, HttpStatus.OK);
    }


}
