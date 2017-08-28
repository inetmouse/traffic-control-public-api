package com.cabonline.traffic.control;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class Runner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Runner.class)
                .web(true)
                .run(args);
    }
}
