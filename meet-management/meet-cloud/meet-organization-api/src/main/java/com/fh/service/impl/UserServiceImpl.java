package com.fh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.beans.User;
import com.fh.dao.UserDao;
import com.fh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByLoginName(String loginName) {
        QueryWrapper q = new QueryWrapper();
        q.eq("loginName",loginName);
        return userDao.selectOne(q);
    }


}
