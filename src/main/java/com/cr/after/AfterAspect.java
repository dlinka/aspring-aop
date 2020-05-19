package com.cr.after;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAspect {

    @After(value = "execution(* com.cr.UserService.getUserByUid(..))")
    public void after() {
        System.out.println("after");
    }

}
