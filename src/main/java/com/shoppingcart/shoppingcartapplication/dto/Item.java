package com.shoppingcart.shoppingcartapplication.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;
    @ManyToOne
    private Cart cart;
    @OneToOne
    private Product product;


    public Item(Product product,int quantity) {

        this.product = product;
        this.name = product.getName();
        this.category = product.getCategory();
        this.price = quantity*product.getPrice();
        this.quantity = quantity;
    }


}
