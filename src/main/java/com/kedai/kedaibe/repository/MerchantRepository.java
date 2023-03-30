package com.kedai.kedaibe.repository;

import com.kedai.kedaibe.entity.Merchant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Repository Interface for Merchant List
 */
@Repository
public interface MerchantRepository extends CrudRepository<Merchant, Long> {
    Merchant findMerchantById(Long id);

    List<Merchant> findMerchantByLocationId(Long id);


}
