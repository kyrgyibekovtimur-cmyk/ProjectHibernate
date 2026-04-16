package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_gen")
    @SequenceGenerator(name = "product_gen", sequenceName = "product_seq", allocationSize = 1)
    private Long id;
    private String name;
    private int duration;
    private double price;
    private String category;

    public Product(String name, int duration, double price,String category) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.category = category;
    }
}