package com.lihd.spring.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/23 23:51
 */
public class MyImportSelector implements ImportSelector {

    //AnnotationMetadata 看见好几次了 这里面就是标注@Import类中所有的注解信息
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.lihd.spring.pojo.Red"};
    }
}
