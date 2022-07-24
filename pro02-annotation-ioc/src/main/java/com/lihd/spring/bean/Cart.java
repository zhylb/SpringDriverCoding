package com.lihd.spring.bean;

import com.lihd.spring.bean.Book;
import org.springframework.stereotype.Component;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 22:43
 */

public class Cart {

    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "book=" + book +
                '}';
    }
}
