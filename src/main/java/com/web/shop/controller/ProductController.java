package com.web.shop.controller;

import com.web.shop.entity.Product;
import com.web.shop.entity.request.SearchProduct;
import com.web.shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/product")
@CrossOrigin(origins = "*")
@Validated
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping("getall/allproduct")
    public ResponseEntity<?> getAllProduct() {
        List<Product> entity = productService.getAllProduct();
        return new ResponseEntity<List<Product>>(entity, HttpStatus.OK);
    }

    @GetMapping("getall/producttype")
    public ResponseEntity<?> getAllProductByProductType(@RequestBody SearchProduct searchProduct) {
        List<Product> entity = productService.getAllProductByProductType(searchProduct);
        return new ResponseEntity<List<Product>>(entity, HttpStatus.OK);
    }

    @GetMapping("count/producttype")
    public ResponseEntity<?> count(@RequestParam int productTypeId) {
        long rs = productService.countProduct( productTypeId);
        return new ResponseEntity<Long>(rs, HttpStatus.OK);
    }
}
