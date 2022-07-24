package com.lihd.spring.controller;

import org.springframework.web.context.request.async.DeferredResult;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/27 23:43
 */
public class DeferredResultQueue {

    private final static Queue<DeferredResult<Object>> queue = new LinkedList<>();

    public static void add(DeferredResult<Object> deferredResult){
        queue.add(deferredResult);
    }

    public static DeferredResult<Object> get(){
        return queue.poll();
    }
}
