package com.arjunnigam.productservice.services;
import java.util.*;
import com.arjunnigam.productservice.models.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getSingleProduct(Long productId);
    Product createProduct(Product product);

    Product replaceProduct(Long productId, Product product);
}
