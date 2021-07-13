package com.hsc.dao;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: OrderDao
 * @Author: heshanchi
 * @CreateDate: 2021/7/2
 * @Description:
 */
public interface OrderDao {

    String getOrder();

    String getOrderById(String id);
}
