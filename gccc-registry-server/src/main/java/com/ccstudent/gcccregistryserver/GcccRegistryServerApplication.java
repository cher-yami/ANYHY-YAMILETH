package com.ccstudent.gcccregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GcccRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcccRegistryServerApplication.class, args);
    }

}
