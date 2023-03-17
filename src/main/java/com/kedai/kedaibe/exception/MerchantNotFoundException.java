package com.kedai.kedaibe.exception;

public class MerchantNotFoundException extends Exception {
    public MerchantNotFoundException(Long id) {
        super("Merchant not found with id: " + id);
    }
}
