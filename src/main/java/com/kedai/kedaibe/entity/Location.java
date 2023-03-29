package com.kedai.kedaibe.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String address;
    public String getAddress() {
        return address;
    }
    private String lon;
    public String getLong() {
        return lon;
    }
    public void setLong(String lon) {
        this.lon = lon;
    }

    private String lat;
    public String getLat() {
        return lat;
    }
    public void setLat(String lat) {
        this.lat = lat;
    }

    @OneToMany(mappedBy = "location")
    private List<Merchant> merchants;
    public List<Merchant> getMerchants() {
        return merchants;
    }
    public void setMerchants(List<Merchant> merchants) {
        this.merchants = merchants;
    }
}
