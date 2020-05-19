package com.cr.around;

import com.cr.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {

    @Around(value = "execution(* com.cr.UserService.updateUser(..))")
    public User around(ProceedingJoinPoint jp) throws Throwable {
        User user = (User) jp.proceed();
        //方法返回值
        System.out.println(user);
        //改变返回值
        user.setUid(27);
        user.setUsername("陈润");
        return user;
    }

}
