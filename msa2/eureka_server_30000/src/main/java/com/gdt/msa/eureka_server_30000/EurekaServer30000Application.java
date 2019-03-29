package com.gdt.msa.eureka_server_30000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer30000Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer30000Application.class, args);
    }
}
