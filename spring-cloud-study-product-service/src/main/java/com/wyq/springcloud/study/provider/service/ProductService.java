package com.wyq.springcloud.study.provider.service;

import com.wyq.springcloud.study.provider.pojo.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {

    // 模拟数据库
    private final Map<Long, Product> productMap = new HashMap<>();

    public ProductService() {
        productMap.put(1L, new Product(1L, "reno5", 10000000, BigDecimal.valueOf(2999)));
        productMap.put(2L, new Product(2L, "reno5 PRO", 100000, BigDecimal.valueOf(3500)));
        productMap.put(3L, new Product(3L, "reno5 PRO+", 10000, BigDecimal.valueOf(3999)));
    }

    public Product getById(Long id) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return productMap.get(id);
    }
}
