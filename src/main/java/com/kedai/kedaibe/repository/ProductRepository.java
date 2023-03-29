package com.kedai.kedaibe.repository;

import com.kedai.kedaibe.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<ProductSummary> findByMerchantId(Long id);

    List<ProductSummary> findAllProjectedBy();
}
