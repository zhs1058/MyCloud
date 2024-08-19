package com.zhs.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhs.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

/**
 * Created by 89704 on 2024/8/16.
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
