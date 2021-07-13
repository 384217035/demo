package com.hsc;

import com.hsc.config.MyImportBeanDefinitionRegistrar;
import com.hsc.config.MyImportSelector;
import org.springframework.context.annotation.*;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: AppConfig
 * @Author: heshanchi
 * @CreateDate: 2021/7/2
 * @Description:
 */

/*
 * @CpmponentScan 主要是配置扫包路径, 另外也可以通过 @CpmponentScans 指定多个 @CpmponentScan
 */
@ComponentScan("com.hsc")
/*
 * @Import 可以让Spring加载指定的类，主要分三种情况
 *      * 1。普通类，直接创建 BeanDefinition 交给Spring管理, 在平时业务开发中最常用的方法
 *      * 2. 实现 ImportSelector 接口, 重写 selectImports 方法,
 *          * 方法返回的是需要让Spring进行加载的类的全限定类名, Spring会在所有已知的配置类扫描完之后, 在进行该信息的加载
 *      * 3. 实现 ImportBeanDefinitionRegistrar, 可以自己定义进行 Bean 的注册
 */
@Import(value = {MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})

/*
 * @ImportResource 放在配置类中，可以导入我们指定的Spring配置文件, 一般都是导入 xml, 然后通过 xml 加载不同的配置文件
 *   * 其中写法为 classpath:XXXX,  classpath*:XXX
 *   * 写法的区别为  带*, 扫描的时候 引入依赖的所有 classpath的指定配置文件, 不带星则扫描本服务的配置文件
 */
@ImportResource(value = {"classpath:spring-context.xml"})

/*
 * @PropertySource 放在配置类中，可以导入我们指定的properties文件, 用法与 @ImportResource 相似
 *      * 其中 有一个聚合注解 @PropertySources 一次导入多个 @PropertySource
 */
@PropertySource(value = {"classpath:custom.properties"})

/*
 * 表示切面可以进行自动代理
 * *    proxyTargetClass: 默认为 false ,使用 jdk动态代理模式, 配置为 true 时则使用 cglib 动态代理模式
 * *    exposeProxy: 是否保留代理类. 默认为 false , 如果为true 。可以通过 AopContext 获取当前执行类类的代理类
 */
@EnableAspectJAutoProxy(proxyTargetClass = false, exposeProxy = false)
public class AppConfig {



}
