package com.hsc.controller;

import com.hsc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : heshanchi
 * @projectName: spring-cloud-demo
 * @className: TestController
 * @desctiption:
 */
@RestController
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping("/test")
    public String get(){
        return service.getOrderServiceName();
    }

}
