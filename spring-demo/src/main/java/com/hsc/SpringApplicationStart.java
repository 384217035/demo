package com.hsc;

import com.hsc.controller.OrderController;
import com.hsc.controller.UserController;
import com.hsc.dao.entry.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: SpringApplicationStart
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public class SpringApplicationStart {

//    public static void main(String[] args) {
////        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
////        UserController userController = context.getBean("userController", UserController.class);
////        System.out.println(userController.getName());
//
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderController orderController = context.getBean(OrderController.class);
//        orderController.getOrderById("111");
//        //System.out.println(orderController.getOrderById("111"));
////        try {
////            System.out.println(orderController.getOrder());
////        } catch (Exception e) {
////        }
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserController userController = context.getBean(UserController.class);
        //System.out.println(userController.getNameById(1));
        //System.out.println("获取所有用户信息 -------- ");
        //List<User> allUser = userController.getAllUser();
        //System.out.println(allUser);
        //System.out.println("添加数据 -------- ");
        //System.out.println("成功 " + userController.insertUser(toInsertUser()) + "条");
        //System.out.println("更新数据 -------- ");
        //System.out.println("成功 " + userController.updatetUser(toUpdateUser()) + "条");
        System.out.println("删除数据 -------- ");
        System.out.println("成功 " + userController.deleteUser(1) + "条");

    }

    private static User toInsertUser() {
        User user = new User();
        user.setName("千年老妖");
        user.setAge(1000);
        return user;
    }

    private static User toUpdateUser() {
        User user = new User();
        user.setId(3);
        user.setName("万年老妖");
        user.setAge(10000);
        return user;
    }

}
