package com.hsc.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
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

    @NacosValue("${get.test.value:abc}")
    private String msg;

    @GetMapping("/test")
    public String get(){
        String message = this.msg;
        System.out.println(message);
        return message;
    }

}
