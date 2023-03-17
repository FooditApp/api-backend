package com.kedai.kedaibe.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    // PRODUCT ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    public Long getId() {
        return id;
    }

    // PRODUCT NAME
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // PRODUCT PRICE
    private Integer productPrice;

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    // PRODUCT DESCRIPTION
    private String productDesc;

    public String getProductDescription() {
        return productDesc;
    }

    public void setProductDescription(String productDesc) {
        this.productDesc = productDesc;
    }

    // RELATIONSHIP

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "merchant_id", referencedColumnName = "merchant_id")
    @JsonIgnore
    private Merchant merchant;

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
        merchant.getProducts().add(this);
    }

}