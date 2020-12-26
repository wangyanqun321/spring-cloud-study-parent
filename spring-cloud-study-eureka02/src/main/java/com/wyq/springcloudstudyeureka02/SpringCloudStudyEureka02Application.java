package com.wyq.springcloudstudyeureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudStudyEureka02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStudyEureka02Application.class, args);
    }

}
