# spring cloud 学习项目
## eureka 注册中心
## Ribbon 负载均衡
## feign 声明式服务调用
### feign 入门
#### feign是什么
- feign 封装了ribbon
### feign 负载均衡
### feign 请求传参
### feign 性能调优
#### Gzip压缩
#### Http连接池
#### 请求超时
- 全局配置
```yml
ribbon:
  ConnectTimeout: 100
  ReadTimeOut: 100
```
- 局部配置
```yml
service-provider:
  ribbon:
    ConnectTimeout: 500 # 最大连接超时时间
    ReadTimeout: 5000 # 最大读取超时时间
```

## Hystrix
### hystrix简介
### 雪崩效应
### 服务降级
### 服务熔断
### 服务隔离
### 请求合并
### 请求缓存

## Actuator

## Sentinel
### sentinel是什么
随着微服务的流行，服务和服务之间的稳定性变得越来越重要。Sentinel 是面向分布式服务架构的轻量级流量控制产品，主要以流量为切入点，从流量控制、熔断降级、系统负载保护等多个维度来帮助您保护服务的稳定性
### sentinel的历史
### sentinel vs hystrix
### sentinel 核心
### OpenFeign 支持
### RestTemplate 支持
### 客户端接入控制台
### sentinel控制台

## zuul

## gateway

## Sleuth 链路追踪
### 什么是链路追踪
### 什么是Sleuth
### 专业术语
### 实现原理
### 使用ELK分析追踪数据
### 使用Zipkin进行链路追踪
### 入门案例

## Zipkin

## Config

## Bus

## Consul

## Apollo

## Nacos