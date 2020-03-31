package com.kuang.service;

import com.kuang.pojo.User;

public interface UserService {
    User queryUserById(String id);
    User queryUser(User user);
    int addUesr(User user);
}
