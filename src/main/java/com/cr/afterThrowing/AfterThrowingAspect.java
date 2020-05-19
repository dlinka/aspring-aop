package com.cr.afterThrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowingAspect {

    @AfterThrowing(value = "execution(* com.cr.UserService.getUsers(..))", throwing = "exception")
    public void log(Throwable exception) {
        System.out.println("after throwing");
        System.out.println(exception);
    }

}
