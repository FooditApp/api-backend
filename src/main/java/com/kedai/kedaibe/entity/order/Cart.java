package com.kedai.kedaibe.entity.order;

import com.kedai.kedaibe.entity.Product;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    // CART ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long id;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    // TABLE NUMBER
    private String tableNumber;
    public String getTableNumber() {
        return tableNumber;
    }
}
