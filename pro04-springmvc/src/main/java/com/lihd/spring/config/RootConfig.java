package com.lihd.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/27 17:35
 */

//不要包含 控制层组件
@Configuration
@ComponentScan(basePackages = "com.lihd.spring",
        excludeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})}
)
@EnableWebMvc
public class RootConfig{

}
