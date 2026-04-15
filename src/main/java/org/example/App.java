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
    public static void main( String[] args )
    {
        //System.out.println(HibernateConfig.getSession());
      ProductService productService = new ProductServiceImpl();
      //productService.saveProduct(new Product("Phone",76,90349.43));
//      productService.saveProduct(new Product("Phone",84,4387743.43));
      //productService.saveProduct(new Product("Phone",84,7000000.43));
      //productService.saveProduct(new Product("Phone",84,3000000.43));
//      productService.saveProduct(new Product("Phone",43,8349483.43));
//      productService.saveProduct(new Product("Phone",9034,943883.43));
        //System.out.println(productService.getProductById(1L));
      //  System.out.println(productService.getAllProducts());
        //productService.updateProduct(3L,new Product("Laptop",43,8349483.43));
        //productService.deleteProduct(2L);
        //System.out.println(productService.getProductsByCategory("Laptop"));
        //System.out.println(productService.getProductsByPriceGreaterThan(1.00));
    }
}
