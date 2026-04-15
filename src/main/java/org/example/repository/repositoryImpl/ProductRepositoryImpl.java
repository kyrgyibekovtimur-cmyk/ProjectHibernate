package org.example.repository.repositoryImpl;

import org.example.config.HibernateConfig;
import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.example.service.ProductService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
private final SessionFactory sessionFactory = HibernateConfig.getSession();
    @Override
    public void saveProduct(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(product);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public Product getProductById(Long id) {
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Product product=session.find(Product.class,id);
        session.getTransaction().commit();
        session.close();
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Product> products = session.createQuery("select p from Product as p", Product.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return products;
    }

    @Override
    public void updateProduct(Long id, Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Product updateProduct = session.find(Product.class,id);
        updateProduct.setName(product.getName());
        updateProduct.setDuration(product.getDuration());
        updateProduct.setPrice(product.getPrice());
        session.merge(updateProduct);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void deleteProduct(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Product product = session.find(Product.class, id);
        session.remove(product);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public List<Product> getProductsByCategory(String category) {
Session session =sessionFactory.openSession();
session.beginTransaction();
List<Product> products=session.createQuery("select p from Product as p where p.name=:name",Product.class).setParameter("name",category).getResultList();
session.getTransaction().commit();
session.close();
return products;
    }

    @Override
    public List<Product> getProductsByPriceGreaterThan(double price) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Product> products = session.createQuery("select p from Product as p where p.price>:price", Product.class).setParameter("price", price).getResultList();
        session.getTransaction().commit();
        session.close();
        return products;

    }
}
