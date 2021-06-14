package com.hsc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : heshanchi
 * @projectName: spring-cloud-demo
 * @className: TestController
 * @desctiption:
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${get.test.value:abc}")
    private String msg;

    @GetMapping("/test")
    public String get(){
        String message = this.msg;
        System.out.println(message);
        return message;
    }

}
