package com.lihd.spring.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/26 14:59
 */
@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addUser(){
        String sql = "insert into user(name,password) values(?,?)";
        String name = UUID.randomUUID().toString().substring(0,5);
        String password = "123456";
        jdbcTemplate.update(sql,name,password);
    }


}
