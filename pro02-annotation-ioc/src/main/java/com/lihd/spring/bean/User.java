package com.lihd.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 22:32
 */
@Component
public class User {

    //@Autowired
    public User(@Autowired Book book) {
        this.book = book;
    }

    private Book book;

    public Book getBook() {
        return book;
    }


    //@Autowired
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "User{" +
                "book=" + book +
                '}';
    }
}
