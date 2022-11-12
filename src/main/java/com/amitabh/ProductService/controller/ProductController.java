package com.amitabh.ProductService.controller;

import com.amitabh.ProductService.model.ProductRequest;
import com.amitabh.ProductService.model.ProductResponse;
import com.amitabh.ProductService.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest) {
        long productId = productService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") long priductId) {
        ProductResponse productResponse = productService.getProductById(priductId);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);

    }


}
