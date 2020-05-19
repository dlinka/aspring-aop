package com.cr.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAspect {

    @Before(value = "execution(* com.cr.UserService.getUserByUid(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("before start");
        //获取目标方法参数
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        //改变方法的参数无效
        args[0] = 2;
        System.out.println("before end");
    }

}
