package com.wyq.springcloud.study.consumer.service;

import com.wyq.springcloud.study.consumer.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("service-provider")
public interface ProductService {

    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable("id") Long id);

}
