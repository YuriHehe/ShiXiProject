package com.pro.dao;

import com.pro.vo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}