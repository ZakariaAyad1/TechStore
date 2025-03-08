package com.techstore.techstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
//@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
public class Client extends User{

    @OneToOne(mappedBy = "client" , cascade = CascadeType.ALL)
    //@JoinColumn(name = "cart_id") // Foreign key in Client table
    private Cart cart;

    @OneToMany(mappedBy = "client" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;


}
