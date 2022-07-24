package com.lihd.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/27 22:09
 */
@WebServlet(value = "/async",asyncSupported = true)
public class AsyncHelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        System.out.println("主线程结束 " + Thread.currentThread().getName() + " : " + System.currentTimeMillis());

        AsyncContext asyncContext = req.startAsync();

        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                System.out.println("异步线程开始 " + Thread.currentThread().getName() + " : " + System.currentTimeMillis());

                try {
                    Thread.sleep(5000);
                    asyncContext.complete();
                    ServletResponse response = asyncContext.getResponse();
                    PrintWriter asyncWriter = response.getWriter();
                    System.out.println("异步线程结束 " + Thread.currentThread().getName() + " : " + System.currentTimeMillis());
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("主线程结束 " + Thread.currentThread().getName() + " : " + System.currentTimeMillis());

    }
}
