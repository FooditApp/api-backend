package com.kedai.kedaibe.repository;

import com.kedai.kedaibe.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
//    List<Product> findByMerchantId(Long id);
    Optional<Product> findByMerchantId(Long id);
}
