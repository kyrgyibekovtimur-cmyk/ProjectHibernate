package org.example.service.serviceImpl;

import org.example.entity.Product;
import org.example.repository.ProductRepository;

import org.example.repository.repositoryImpl.ProductRepositoryImpl;
import org.example.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
ProductRepository productRepository= new ProductRepositoryImpl();
    @Override
    public void saveProduct(Product product) {
        productRepository.saveProduct(product);

    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public void updateProduct(Long id, Product product) {
        productRepository.updateProduct(id,product);

    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteProduct(id);

    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    @Override
    public List<Product> getProductsByPriceGreaterThan(double price) {
        return productRepository.getProductsByPriceGreaterThan(price);
    }
}
