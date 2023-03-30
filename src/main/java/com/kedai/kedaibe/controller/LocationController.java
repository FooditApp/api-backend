package com.kedai.kedaibe.controller;

import com.kedai.kedaibe.entity.Location;
import com.kedai.kedaibe.entity.Merchant;
import com.kedai.kedaibe.repository.LocationRepository;
import com.kedai.kedaibe.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// REST CONTROLLER FOR LOCATION
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/foodit")
public class LocationController {
    @Autowired
    private MerchantRepository merchantRepository;
    @Autowired
    private LocationRepository locationRepository;

    // GET MERCHANT BY LOCATION ID
    @PostMapping(path = "/location/{id}")
    public @ResponseBody Iterable<Merchant> getMerchantByLocation(@PathVariable String id) {
        return merchantRepository.findMerchantByLocationId(Long.parseLong(id));
    }
}
