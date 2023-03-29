package com.kedai.kedaibe.service;

import com.kedai.kedaibe.entity.Product;
import com.kedai.kedaibe.repository.ProductRepository;
import com.kedai.kedaibe.repository.ProductSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<ProductSummary> getProductsByMerchantId(Long id) {
        return productRepository.findByMerchantId(id);
    }
}
