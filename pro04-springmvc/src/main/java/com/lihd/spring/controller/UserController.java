package com.lihd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/27 18:49
 */
@Controller
public class UserController {

    @RequestMapping("/")
    public String  index(){
        return "index";
    }

}
