package com.techstore.techstore.model;

import com.techstore.techstore.enums.StatusOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;
    private double amountOrder;
    @Enumerated(EnumType.STRING)
    private StatusOrder statusOrder;
    private Date dateOrder;
    private Date dateShipping;
    private String addressShipping;


    @ManyToOne
    @JoinColumn(name = "Client_id")
    private Client client;

}
