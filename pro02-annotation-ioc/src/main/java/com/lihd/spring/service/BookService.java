package com.lihd.spring.service;

import com.lihd.spring.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 15:58
 */
@Service
public class BookService {


    @Qualifier("bookDAO")
    @Autowired(required = false)
    private BookDAO bookDAO;

    @Override
    public String toString() {
        return "BookService{" +
                "bookDAO=" + bookDAO +
                '}';
    }
}
