package com.hsc.config;

import com.hsc.service.OrderService;
import com.hsc.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: XmlBeanExample
 * @Author: heshanchi
 * @CreateDate: 2021/7/5
 * @Description:
 */
public class XmlBeanExample {

    private List<String> list;

    private UserService userService;

    private OrderService orderService;

    private Map<String, Object> map;

    public void initMethod() {
        System.out.println("XmlBeanExample init ... ");
    }

    public void destoryMethod() {
        System.out.println("XmlBeanExample destory ... ");
    }

    public XmlBeanExample() {
    }

    public XmlBeanExample(List<String> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public String toString() {
        return "XmlBeanExample{" +
                "list=" + list +
                ", userService=" + userService +
                ", orderService=" + orderService +
                ", map=" + map +
                '}';
    }
}
