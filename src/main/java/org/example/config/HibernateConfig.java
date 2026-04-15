package org.example.config;

import org.example.entity.Product;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateConfig {
public static SessionFactory getSession(){
    Properties properties = new Properties();
    properties.put(Environment.JAKARTA_JDBC_URL,"jdbc:postgresql://localhost:5432/postgres");
    properties.put(Environment.JAKARTA_JDBC_USER,"postgres");
    properties.put(Environment.JAKARTA_JDBC_PASSWORD,"1111");
    properties.put(Environment.HBM2DDL_AUTO,"update");
    properties.put(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
    properties.put(Environment.SHOW_SQL,true);

    Configuration configuration = new Configuration();
    configuration.addProperties(properties);
    configuration.addAnnotatedClass(Product.class);

    return configuration.buildSessionFactory();
}
}
