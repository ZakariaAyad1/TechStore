package com.techstore.techstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCart;


    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<Product> products;

    @OneToOne
    private Client client;

}
