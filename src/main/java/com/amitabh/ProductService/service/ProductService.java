package com.amitabh.ProductService.service;

import com.amitabh.ProductService.model.ProductRequest;
import com.amitabh.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long priductId);
}
