package com.wyq.springcloud.study.consumer.controller;

import com.wyq.springcloud.study.consumer.pojo.Order;
import com.wyq.springcloud.study.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired(required = false)
    private OrderService orderService;

    @GetMapping("/{id}")
    public Order getById(@PathVariable("id") Long id) {
        return orderService.getOrder(id);
    }

}
