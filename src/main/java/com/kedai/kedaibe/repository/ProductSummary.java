package com.kedai.kedaibe.repository;

/**
 * Interface for simplified product list
 */
public interface ProductSummary {
    Long getId();
    String getProductName();
    String getProductPrice();
    Integer getProductRating();
}
