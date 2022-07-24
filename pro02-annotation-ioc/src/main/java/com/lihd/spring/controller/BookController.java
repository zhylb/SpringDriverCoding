package com.lihd.spring.controller;

import com.lihd.spring.service.BookService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 15:58
 */
@Controller
public class BookController {

    @Inject
    //@Resource
    private BookService bookService;


    @Override
    public String toString() {
        return "BookController{" +
                "bookService=" + bookService +
                '}';
    }
}
