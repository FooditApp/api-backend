package com.kedai.kedaibe.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "merchant")
public class Merchant {
    // MERCHANT ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "merchant_id")
    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //MERCHANT NAME
    private String merchantName;
    public String getMerchantName() {
        return merchantName;
    }
    public void setName(String merchantName) {
        this.merchantName = merchantName;
    }

    // MERCHANT INFO
    private String merchantInfo;
    public String getMerchantInfo() {
        return merchantInfo;
    }
    public void setInfo(String merchantInfo) {
        this.merchantInfo = merchantInfo;
    }

    // MERCHANT CONTACT
    private String merchantContact;
    public String getMerchantContact() {
        return merchantContact;
    }
    public void setMerchantContact(String merchantContact) {
        this.merchantContact = merchantContact;
    }

    // RELATIONSHIP
    @OneToMany(mappedBy = "merchant")
    private List<Product> products;
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", referencedColumnName = "location_id")
    @JsonIgnore
    private Location location;
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
}
