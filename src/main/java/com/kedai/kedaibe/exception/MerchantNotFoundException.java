package com.kedai.kedaibe.exception;

// ADDITIONAL EXCEPTION if merchant not found
public class MerchantNotFoundException extends Exception {
    public MerchantNotFoundException(Long id) {
        super("Merchant not found with id: " + id);
    }
}
