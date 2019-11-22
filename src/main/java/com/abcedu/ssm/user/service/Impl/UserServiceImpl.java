package com.abcedu.ssm.user.service.Impl;

import com.abcedu.ssm.user.dao.UserDao;
import com.abcedu.ssm.user.service.UserService;
import com.abcedu.ssm.user.service.bo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: Test01
 * @description:
 * @author: Every
 * @create: 2019-11-16 15:04
 **/
@Service
public class UserServiceImpl implements UserService{

    private static final Logger log4j2 = LogManager.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDaoImpl;

    @Override
    @Transactional
    public int insert(User user) {
        return userDaoImpl.insert(user);
    }

    @Override
    @Transactional
    public int update(User user) {
        return userDaoImpl.update(user);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return userDaoImpl.delete(id);
    }

    @Override
    public User get(int id) {
        return userDaoImpl.get(id);
    }

    @Override
    public List<User> list() {
        return userDaoImpl.list();
    }
}
