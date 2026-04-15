package org.example;


import org.example.service.ProductService;
import org.example.service.serviceImpl.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ProductService productService = new ProductServiceImpl();

    }
}
