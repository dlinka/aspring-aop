package com.cr.afterReturing;

import com.cr.User;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterReturningAspect {

    @AfterReturning(value = "execution(* com.cr.UserService.getUserByUid(..))", returning = "user")
    public User afterReturning(User user) {
        System.out.println("after returning");

        //可以修改返回值中的属性
        user.setUsername("CR");

        //返回值不会改变
        user = new User(2, "zj");

        return user;
    }

}
