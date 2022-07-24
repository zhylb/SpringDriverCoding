package com.lihd.spring.aop;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/25 16:24
 */
public class HelloAop {

    public void sayHello(){
        System.out.println("Hello AOP!");
    }

    public String getStr(String a,Integer b){
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < b; i++) {
            c.append(a);
        }
//        int x = 1/0;
        return c.toString();
    }

}
