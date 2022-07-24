package com.lihd.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/25 16:12
 */

@Aspect //说明是切面类
public class MyLogger {
    //execution(public * * (..))
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss : ");

    public String getTime(){
        return simpleDateFormat.format(new Date());
    }

    //execution(* com.lihd.spring.aop..*(..))
    //execution(public * * (..))
    @Pointcut("execution(* com.lihd.spring.aop..*(..))")
    public void pointCut(){
        //空实现即可
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(getTime() + name + "开始执行 参数为 : " + Arrays.toString(args));
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(getTime() + name + "结束执行");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,Exception exception){
        String name = joinPoint.getSignature().getName();
        System.out.println(getTime() + name + "运行发生异常 异常信息 : " + exception);
    }

    @AfterReturning(value = "pointCut()",returning = "ret")
    public void afterReturning(JoinPoint joinPoint,Object ret){
        String name = joinPoint.getSignature().getName();
        System.out.println(getTime() + name + "结束执行 运行结果 " + ret);
    }

}
