package com.hsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author : heshanchi
 * @projectName: spring-cloud-demo
 * @className: com.Starter
 * @desctiption:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Starter {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Starter.class, args);
        System.out.println(applicationContext.getEnvironment().getProperty("jdbc.url"));
        System.out.println(applicationContext.getEnvironment().getProperty("redis.url"));
    }

}
