package com.test.service;

import com.test.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    static User findByName(String loginName) {
        return null;
    }
}
