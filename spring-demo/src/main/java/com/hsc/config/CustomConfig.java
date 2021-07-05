package com.hsc.config;

import com.hsc.service.UserService;
import com.hsc.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: CustomConfig
 * @Author: heshanchi
 * @CreateDate: 2021/7/2
 * @Description:
 */

/*
    @Configuration表示这个类是一个配置类, 在@Configuration注释的类下面, @Bean才会成功
    为了保持 @Bean方法出来的 Bean是单例bean, 呗 @Configuration 都会被代理
 */
//@Configuration
public class CustomConfig {

    @Autowired
    private ApplicationContext context;

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }


    @Bean

    /*
        @DependsOn 表示 DependsOnObjA 依赖于 DependsOnObjB 创建,
        在创建 DependsOnObjA 会把 @DependsOn 指定的 beanName进行创建
     */
    @DependsOn("dependsOnObjB")
    public DependsOnObjA dependsOnObjA(){
        System.out.println( "DependsOnObjA 创建");
        DependsOnObjB bean = context.getBean(DependsOnObjB.class);
        System.out.println("DependsOnObjA 加载 DependsOnObjB + " + bean);
        return new DependsOnObjA();
    }


    @Bean
    public DependsOnObjB dependsOnObjB(){
        System.out.println( "DependsOnObjB 创建");
        return new DependsOnObjB();
    }

}
