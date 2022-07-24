package com.lihd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.Callable;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/27 23:03
 */
@Controller
public class AsyncController {

    @ResponseBody
    @RequestMapping("/async02")
    public DeferredResult<Object> async02(){
        DeferredResult<Object> result = new DeferredResult<>(8000L,"error");

        DeferredResultQueue.add(result);

        return result;
    }


    @ResponseBody
    @RequestMapping("/async03")
    public String addInfo(){
        DeferredResult<Object> result = DeferredResultQueue.get();

        result.setResult("success");
        return "addInfo";
    }


    @ResponseBody
    @RequestMapping("/async")
    public Callable<String> async01(){

        System.out.println("主线程开始 " + Thread.currentThread().getName() + " : " + System.currentTimeMillis());

        Callable<String> stringCallable = new Callable<String>() {
            @Override
            public String  call() throws Exception {
                Thread.sleep(1000);
                System.out.println("副线程结束 " + Thread.currentThread().getName() + " : " + System.currentTimeMillis());
                return "success";
            }
        };
        System.out.println("主线程结束 " + Thread.currentThread().getName() + " : " + System.currentTimeMillis());

        return stringCallable;
    }

}
