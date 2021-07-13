package com.hsc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: demo
 * @ClassName: LogAspect2
 * @Author: heshanchi
 * @CreateDate: 2021/7/13
 * @Description:
 */
@Aspect
//@Component
@Order(2)
public class LogAspect2 {

    @Around(value = "execution(public * com.hsc.service.impl.*.*(..))")
    public Object logRecord(ProceedingJoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        System.out.println(" 2 -- 环绕通知开始 ....");
        Object result = null;
        try {
            Object[] args = joinPoint.getArgs();
            // 进行参数校验
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        // 日志信息上报等等.....
        System.out.println(" 2 -- 环绕通知结束, 耗时: {"+ (System.currentTimeMillis() - start) +"ms} ....");
        return result;
    }

}
