package com.hsc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: HealthController
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
@RestController
public class HealthController {

    @Value("${spring.application.name}")
    private String serverName;

    @RequestMapping("/")
    public String check() {
        return serverName + " ok....";
    }

}
