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

    @GetMapping("getall")
    public ResponseEntity<?> getAllProduct() {
        List<Product> entity = productService.getAllProduct();
        return new ResponseEntity<List<Product>>(entity, HttpStatus.OK);
    }

    @GetMapping("get/{productId}")
    public ResponseEntity<?> getProduct(@PathVariable  int productId) {
        Product entity = productService.getProductByProductId(productId);
        return new ResponseEntity<Product>(entity, HttpStatus.OK);
    }

    @GetMapping("search")
    public ResponseEntity<?> searchProduct(@RequestBody SearchProduct searchProduct) {
        List<Product> entity = productService.searchProduct(searchProduct);
        return new ResponseEntity<List<Product>>(entity, HttpStatus.OK);
    }

    @GetMapping("count")
    public ResponseEntity<?> count(@RequestParam int productTypeId) {
        long rs = productService.countProduct( productTypeId);
        return new ResponseEntity<Long>(rs, HttpStatus.OK);
    }
}
