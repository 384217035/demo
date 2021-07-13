package com.hsc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: demo
 * @ClassName: XmlAspect
 * @Author: heshanchi
 * @CreateDate: 2021/7/12
 * @Description:
 */
public class XmlAspect {

    public void testXmlBefore(JoinPoint point) {
        System.out.println("XML 前置 切面请求开始");
        MethodSignature signature = (MethodSignature) point.getSignature();
        System.out.println("XML 前置 切面请求开始--method: " + signature.getMethod());
        if (point.getArgs() != null) {
            List<Object> args = Arrays.asList(point.getArgs());
            System.out.println("参数: " + args);
        }
    }

    public void testXmlBeforeWithId(String id) {
        System.out.println("XML 前置带参 切面请求开始");
        System.out.println("XML 前置带参 切面 参数: " + id);
    }

    public void testXmlAfter() {
        System.out.println("XML 最终通知切面 请求开始");
    }

    public void testXmlAfterReturn(Object result) {
        if (result != null) {
            System.out.println("XML 后置 切面请求开始, 返回参数: " + result.toString());
        }
        System.out.println("XML 后置 切面请求开始");
    }

    public void testXmlAfterException(Throwable e) {
        System.out.println("XML 异常 切面请求开始");
        e.printStackTrace();
    }

}
