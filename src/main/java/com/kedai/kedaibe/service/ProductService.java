package com.kedai.kedaibe.service;

import com.kedai.kedaibe.entity.Product;
import com.kedai.kedaibe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Optional<Product> getProductsByMerchantId(Long id) {
        return productRepository.findByMerchantId(id);
    }
}
