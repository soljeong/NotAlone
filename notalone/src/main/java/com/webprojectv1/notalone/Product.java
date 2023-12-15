package com.webprojectv1.notalone;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    @Column(nullable = false)
    private String productName;

    @Enumerated(value = EnumType.STRING)
    private Category productCategory;

    @Column(nullable = false)
    private double productPrice;

    @Column(nullable = false)
    private double productRating;

    @Column(nullable = false)
    private int productStock;
    
    private String productImage;

}