package com.zhs.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhs.dao.UserMapper;
import com.zhs.entity.User;
import com.zhs.server.IUser;

import org.springframework.stereotype.Service;

/**
 * Created by 89704 on 2024/8/16.
 */
@Service
public class UserImpl extends ServiceImpl<UserMapper, User> implements IUser {

    @Override
    public void saveUser(User user) {

    }
}
