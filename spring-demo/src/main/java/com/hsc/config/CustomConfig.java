package com.hsc.config;

import com.hsc.service.UserService;
import com.hsc.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: CustomConfig
 * @Author: heshanchi
 * @CreateDate: 2021/7/2
 * @Description:
 */
@Configuration
public class CustomConfig {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

}
