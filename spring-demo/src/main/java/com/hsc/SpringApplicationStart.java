package com.hsc;

import com.hsc.controller.OrderController;
import com.hsc.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: SpringApplicationStart
 * @Author: heshanchi
 * @CreateDate: 2021/7/1
 * @Description:
 */
public class SpringApplicationStart {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
//        UserController userController = context.getBean("userController", UserController.class);
//        System.out.println(userController.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderController orderController = context.getBean(OrderController.class);
        // context.destroy();
        context.stop();
    }

}
