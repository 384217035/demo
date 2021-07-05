package com.hsc.aop;

import com.hsc.service.impl.OrderServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: LogAspect
 * @Author: heshanchi
 * @CreateDate: 2021/7/5
 * @Description:
 */

/**
 *
 */
@Aspect
@Component
@Order(1)
public class TestAspect {

    /**
     *
     * @param point
     */
    @Before(value = "execution(public * com.hsc.service.impl.*.*(..))")
    public void testBefore(JoinPoint point) {
        System.out.println("前置切点方法开始");
    }

    @After(value = "execution(public * com.hsc.service.impl.*.*(..))")
    public void testAfter() {
        System.out.println("后置切点方法开始");
    }

    @AfterThrowing(value = "execution(public * com.hsc.service.impl.*.*(..))")
    public void testThrowing() {
        System.out.println("异常切点方法开始");
    }

}
