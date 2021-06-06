package com.hsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : heshanchi
 * @projectName: spring-cloud-demo
 * @className: com.hsc.Starter
 * @desctiption:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Starter {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }

}
