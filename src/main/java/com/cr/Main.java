package com.cr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        UserService userService = context.getBean(UserService.class);

        System.out.println("------");
        User user = userService.getUserByUid(1);
        System.out.println(user);


        System.out.println("------");
        user = userService.updateUser(user);
        System.out.println(user);

        //userService.getUsers();
    }

}
