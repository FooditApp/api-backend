package com.kedai.kedaibe.entity.order;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transacation")
public class Transaction {
    // TRANSACTION ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // TABLE NUMBER
    private String tableNumber;

    // PHONE NUMBER
    private Character phoneNumber;
    public Character getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Character phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // ORDER ID
    private String orderId;
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // TRANSACTION DATE
    private Date transactionDate;
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
