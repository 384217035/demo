package com.hsc.controller;

import com.hsc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: OrderController
 * @Author: heshanchi
 * @CreateDate: 2021/7/2
 * @Description:
 */

@Controller
@Component
public class OrderController {


    private String initParam;

    @Lazy
    // @Autowired 自动注入, 加上@Qualifier指定注入 beanName 的bean
    @Autowired
    @Qualifier("orderService")

    // @Resource 相当于 上面两个注解结合, 但是本身是Java自带注解, 通过name 指定注入beanName
    @Resource(name = "orderService")
    private OrderService orderService;


    public String getOrder() {
        String order = orderService.getOrder();
        System.out.println(order);
        return order;
    }

    @PostConstruct()
    public void init() {
        System.out.println("进行执行 init 方法");
        this.initParam = "initParam";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("执行 Bean 销毁方法");
        this.initParam = null;
    }

}
