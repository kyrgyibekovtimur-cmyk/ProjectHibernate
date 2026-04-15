package org.example.service;

import org.example.entity.Product;

import java.util.List;

public interface ProductService {
    void saveProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByPriceGreaterThan(double price);
}
