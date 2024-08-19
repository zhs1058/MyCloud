package com.zhs.server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhs.entity.User;

/**
 * Created by 89704 on 2024/8/16.
 */
public interface IUser  extends IService<User> {

    void saveUser(User user);
}
