package com.kedai.kedaibe.repository;

import com.kedai.kedaibe.entity.order.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
