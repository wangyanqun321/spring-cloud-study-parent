# spring cloud 学习项目
## eureka 注册中心
## Ribbon 负载均衡
## feign 声明式服务调用
- feign 封装了ribbon
### feign 入门
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