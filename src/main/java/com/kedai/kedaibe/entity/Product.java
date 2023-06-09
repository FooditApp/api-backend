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

    // PRODUCT POPULARITY
    private Integer productRating;
    public Integer getProductRating() {
        return productRating;
    }
    public void setProductRating(Integer productRating) {
        this.productRating = productRating;
    }

    private String productImage;
    public String getProductImage() {
        return productImage;
    }
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    /**
     * Relationship (MANY to ONE)
     * merchant id (Merchant) --> merchant id (Product)
     */
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