package com.wyq.springcloud.study.consumer;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudStudyConsumerApplication {

    @Bean
    public Logger.Level getLog() {
        return Logger.Level.FULL;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStudyConsumerApplication.class, args);
    }

}
