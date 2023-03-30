package com.kedai.kedaibe.repository;

import com.kedai.kedaibe.entity.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Long> {
    Location findLocationById(Long id);
}
