package com.lihd.spring.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/24 15:58
 */
@Repository
public class BookDAO {


    private String bookModel = "red";

    public String getBookModel() {
        return bookModel;
    }

    public void setBookModel(String bookModel) {
        this.bookModel = bookModel;
    }

    @Override
    public String toString() {
        return "BookDAO{" +
                "bookModel='" + bookModel + '\'' +
                '}';
    }


}
