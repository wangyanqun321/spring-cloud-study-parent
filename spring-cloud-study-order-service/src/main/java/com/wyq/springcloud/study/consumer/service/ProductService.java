package com.wyq.springcloud.study.consumer.service;

import com.wyq.springcloud.study.consumer.fallback.ProductServiceFallbackFactory;
import com.wyq.springcloud.study.consumer.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "product-service", fallbackFactory = ProductServiceFallbackFactory.class)
public interface ProductService {

    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable("id") Long id);

}
