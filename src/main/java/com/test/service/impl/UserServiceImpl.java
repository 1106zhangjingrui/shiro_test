package com.test.service.impl;

import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author zjr
 * @Date 2018/6/8 17:16
 * @Version
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private  UserService userService;


}
