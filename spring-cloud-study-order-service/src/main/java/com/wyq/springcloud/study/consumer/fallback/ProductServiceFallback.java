package com.wyq.springcloud.study.consumer.fallback;

import com.wyq.springcloud.study.consumer.pojo.Product;
import com.wyq.springcloud.study.consumer.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceFallback implements ProductService {

    @Override
    public Product getProductById(Long id) {
        System.out.println("调用熔断方法：ProductServiceFallback.getProductById");
        return new Product();
    }
}
