package com.hsc.controller;

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

    @GetMapping("/test")
    public String get(){
        String result = "111";
        System.out.println(result);
        return result;
    }

}
