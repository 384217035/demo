package com.hsc.service;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: OrderService
 * @Author: heshanchi
 * @CreateDate: 2021/7/2
 * @Description:
 */
public interface OrderService {

    String getOrder();

    String getOrderById(String id);
}
