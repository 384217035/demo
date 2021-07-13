package com.hsc.aop;

import com.hsc.service.impl.OrderServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

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


    @Pointcut(value = "execution(public * com.hsc.service.impl.*.*(..)) && args(id)", argNames = "id")
    public void myPointcut(String id){};


    /*
     * 这里 相同类型相同切面的 通知. 按方法名进行排序执行
     */

    @Before(value = "myPointcut(id)")
    public void testBefore2(JoinPoint point, String id) {
        System.out.println("请求开始2");
        MethodSignature signature = (MethodSignature) point.getSignature();
        System.out.println("请求开始2--method: " + signature.getMethod());
        System.out.println("id: " + id);
        if (point.getArgs() != null) {
            List<Object> args = Arrays.asList(point.getArgs());
            System.out.println("参数: " + args);
        }
    }

    //@Before(value = "execution(public * com.hsc.service.impl.*.*(..)) && args(id)", argNames = "id")
    @Before(value = "myPointcut(id)")
    public void testBefore(JoinPoint point, String id) {
        System.out.println("请求开始");
        MethodSignature signature = (MethodSignature) point.getSignature();
        System.out.println("请求开始--method: " + signature.getMethod());
        System.out.println("id: " + id);
        if (point.getArgs() != null) {
            List<Object> args = Arrays.asList(point.getArgs());
            System.out.println("参数: " + args);
        }
    }

    @After(value = "execution(public * com.hsc.service.impl.*.*(..))")
    public void testAfter() {
        System.out.println("后置切点方法开始");
    }

    @AfterThrowing(value = "execution(public * com.hsc.service.impl.*.*(..))", throwing = "e")
    public void testThrowing(JoinPoint point, Throwable e) {
        System.out.println("异常切点方法开始");
        e.printStackTrace();

    }

    @AfterReturning(value = "execution(public * com.hsc.service.impl.*.*(..))", returning = "result")
    public void testAfterReturn(String result) {
        System.out.println("返回结果: " + result);
        System.out.println("返回切点方法开始");
    }

}
