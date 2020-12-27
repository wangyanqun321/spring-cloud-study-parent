package com.wyq.springcloud.study.consumer.service;

import com.wyq.springcloud.study.consumer.pojo.Order;
import com.wyq.springcloud.study.consumer.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private ProductService productService;

    public Order getOrder(Long id) {
        Product product = productService.getProductById(id);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        return new Order(1L, productList);
    }

}
