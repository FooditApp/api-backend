package com.kedai.kedaibe.controller;

import com.kedai.kedaibe.entity.Product;
import com.kedai.kedaibe.repository.MerchantRepository;
import com.kedai.kedaibe.repository.ProductRepository;
import com.kedai.kedaibe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/foodit")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

    @Autowired
    private MerchantRepository merchantRepository;

    @GetMapping(path = "/merchant/{id}/products")
    public @ResponseBody Optional<Product> getProductsByMerchantId(@PathVariable String id) {
        return productService.getProductsByMerchantId(Long.parseLong(id));
    }

    @PostMapping(path = "/merchant/{id}/products/add")
    public String addProduct(
            @PathVariable String id,
            @RequestParam String name,
            @RequestParam String desc,
            @RequestParam String price) {
        Product p = new Product();
        p.setProductName(name);
        p.setProductDescription(desc);
        p.setProductPrice(Integer.valueOf(price));
        p.setMerchant(merchantRepository.findById(Long.parseLong(id)).get());
        productRepository.save(p);
        return "Product saved";
    }

    @GetMapping(path = "/products")
    public @ResponseBody Iterable<Product> getProduct() {
        return productRepository.findAll();
    }
}
