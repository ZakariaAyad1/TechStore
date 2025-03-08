package com.techstore.techstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    private String nameProduct;
    private String descriptionProduct;
    private double priceProduct;
    private int stockProduct;
    private String imageProduct;

    @ManyToOne
    @JoinColumn(name = "Category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
