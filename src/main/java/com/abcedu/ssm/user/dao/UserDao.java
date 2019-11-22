package com.abcedu.ssm.user.dao;

import com.abcedu.ssm.user.service.bo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {

    public int insert(User user);

    public int update(User user);

    public int delete(int id);

    public User get(int id);

    public List<User> list();

    public int count();
}
