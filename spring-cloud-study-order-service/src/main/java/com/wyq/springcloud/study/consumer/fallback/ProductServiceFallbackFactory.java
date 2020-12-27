package com.wyq.springcloud.study.consumer.fallback;

import com.wyq.springcloud.study.consumer.pojo.Product;
import com.wyq.springcloud.study.consumer.service.ProductService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceFallbackFactory implements FallbackFactory<ProductService> {
    Logger logger = LoggerFactory.getLogger(ProductServiceFallbackFactory.class);
    @Override
    public ProductService create(Throwable throwable) {
        logger.error("容错处理，异常如下：", throwable);
        return id -> new Product();
    }
}
