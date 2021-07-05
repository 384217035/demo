package com.hsc.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: ImportBeanDefinitionRegistrar
 * @Author: heshanchi
 * @CreateDate: 2021/7/5
 * @Description:
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    // 根据传入的注解信息, 与 bdRegistry 等等。可以进行 Bean 的注册， 就是说走自己的注册流程。 其中 AOP 相关组件加载就是通过这种方式进行加载的。
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

    }
}
