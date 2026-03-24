package com.arjunnigam.productservice.services;
import java.util.*;

import com.arjunnigam.productservice.exceptions.ProductNotFoundException;
import com.arjunnigam.productservice.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ProductService {
    List<Product> getAllProducts();
    Product getSingleProduct(Long productId) throws ProductNotFoundException;
    Product createProduct(Product product);

    Product replaceProduct(Long productId, Product product);

    Page<Product> getProductsByTitle(String title, int pageNumber, int pageSize);
}
