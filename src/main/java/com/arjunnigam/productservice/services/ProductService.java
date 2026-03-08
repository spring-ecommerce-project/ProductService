package com.arjunnigam.productservice.services;
import java.util.*;

import com.arjunnigam.productservice.exceptions.ProductNotFoundException;
import com.arjunnigam.productservice.models.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getSingleProduct(Long productId) throws ProductNotFoundException;
    Product createProduct(Product product);

    Product replaceProduct(Long productId, Product product);
}
