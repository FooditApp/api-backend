package com.kedai.kedaibe.controller;

import com.kedai.kedaibe.entity.Merchant;
import com.kedai.kedaibe.entity.Product;
import com.kedai.kedaibe.repository.MerchantRepository;
//import com.kedai.kedaibe.service.MerchantService;
import com.kedai.kedaibe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/foodit")
public class MerchantController {
    @Autowired
    private MerchantRepository merchantRepository;


    // ADD MERCHANT
    @PostMapping(path = "/merchant/add")
    public String addMerchant(
            @RequestParam String name,
            @RequestParam String info,
            @RequestParam String contact) {
        Merchant m = new Merchant();
        m.setName(name);
        m.setInfo(info);
        m.setMerchantContact(contact);
        merchantRepository.save(m);
        return "Merchant saved";
    }

    // GET MERCHANT
    @GetMapping(path = "/merchants")
    public @ResponseBody Iterable<Merchant> getMerchant() {
        return merchantRepository.findAll();
    }
}