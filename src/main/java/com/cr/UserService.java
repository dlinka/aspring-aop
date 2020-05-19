package com.cr;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserByUid(int uid){
        User user =new User();
        user.setUid(1);
        user.setUsername("cr");
        return user;
    }

    public User updateUser(User user){
        user.setUid(10);
        user.setUsername("CR");
        return user;
    }

    public User getUsers(){
        throw new NullPointerException("不许查询所有用户");
    }

}
