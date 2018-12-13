package com.test.mapper;

import com.test.entity.User;

public interface UserMapper {
    User findByName(String loginName);
}
