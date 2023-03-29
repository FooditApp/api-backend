package com.kedai.kedaibe.controller;

import com.kedai.kedaibe.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/foodit")
public class CartController {
    @Autowired
    private CartRepository cartRepository;
}
