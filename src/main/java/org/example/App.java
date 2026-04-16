package org.example;


import org.example.config.HibernateConfig;
import org.example.entity.Product;
import org.example.service.ProductService;
import org.example.service.serviceImpl.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        //System.out.println(HibernateConfig.getSession());
        ProductService productService = new ProductServiceImpl();
//        productService.saveProduct(new Product("iPhone 13", 56898, 999.99, "Electronics"));
//        productService.saveProduct(new Product("Samsung Galaxy S21", 589685, 899.99, "Electronics"));
//        productService.saveProduct(new Product("Sony WH-1000XM4", 68685, 349.99, "Audio"));
//        productService.saveProduct(new Product("Dell XPS 13", 34, 1199.99, "Computers"));
//        productService.saveProduct(new Product("Apple Watch Series 6", 34, 399.99, "Wearables"));
//
        System.out.println(productService.getProductsByCategory("Audio"));


    }
}
