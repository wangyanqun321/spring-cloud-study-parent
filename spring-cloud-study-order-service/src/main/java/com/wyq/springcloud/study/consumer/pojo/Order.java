package com.wyq.springcloud.study.consumer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Order {

    private Long id;

    private List<Product> products;

}
