package com.abcedu.ssm.user.service;

import com.abcedu.ssm.user.service.bo.User;

import java.util.List;

public interface UserService {

    public int insert(User user);

    public int update(User user);

    public int delete(int id);

    public User get(int id);

    public List<User> list();
}
