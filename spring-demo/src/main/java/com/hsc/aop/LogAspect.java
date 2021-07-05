package com.hsc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: LogAspect
 * @Author: heshanchi
 * @CreateDate: 2021/7/5
 * @Description:
 */
@Aspect
@Component
@Order(1)
public class LogAspect {



}
