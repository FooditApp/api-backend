package com.kedai.kedaibe.controller;

import com.kedai.kedaibe.entity.Product;
import com.kedai.kedaibe.repository.MerchantRepository;
import com.kedai.kedaibe.repository.ProductRepository;
import com.kedai.kedaibe.repository.ProductSummary;
import com.kedai.kedaibe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST CONTROLLER
 * CORS allow all origin
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/foodit")
public class ProductController {
    // AUTOWIRED REPOSITORY
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    private MerchantRepository merchantRepository;

    // GET merchant products endpoint

    /**
     *
     * @param id Merchant id (return all product by merchant id)
     */
    @GetMapping(path = "/merchant/{id}/products")
    public @ResponseBody List<ProductSummary> getProductsByMerchantId(@PathVariable String id) {
        return productService.getProductsByMerchantId(Long.parseLong(id));
    }

    // POST merchant product endpoint
    /**
     *
     * @param id Merchant id (post new product to a merchant specified by merchant id)
     * @param name Product name
     * @param desc Product description
     * @param price Product price
     *
     */
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

    // Get products endpoint
    @GetMapping(path = "/products")
    public @ResponseBody Iterable<ProductSummary> getProduct() {
        return productRepository.findAllProjectedBy();
    }
}
