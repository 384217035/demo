package com.hsc.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ProjectName: spring-cloud-demo
 * @ClassName: MySeltorImport
 * @Author: heshanchi
 * @CreateDate: 2021/7/5
 * @Description:
 */
public class MyImportSelector implements ImportSelector {

    /**
     * 实现 ImportSelector 的 selectImports, 是根据传入的 注解信息, 进行处理并返回一堆类的全限定路径, 让Spring进行加载
     * @param annotationMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {"com.hsc.config.MyCustomImportSelectorConfig"};
    }

}
