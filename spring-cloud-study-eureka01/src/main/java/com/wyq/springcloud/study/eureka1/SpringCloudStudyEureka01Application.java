package com.wyq.springcloud.study.eureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudStudyEureka01Application {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStudyEureka01Application.class, args);
    }

}
