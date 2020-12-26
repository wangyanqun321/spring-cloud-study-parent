package com.wyq.springcloud.study.provider.controller;

import com.wyq.springcloud.study.provider.pojo.Product;
import com.wyq.springcloud.study.provider.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        Product product = productService.getById(id);
        System.out.println(product);
        return product;
    }
}
