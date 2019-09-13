package com.iiht.assignment.service.impl;

import com.iiht.assignment.entity.SysUser;
import com.iiht.assignment.mapper.UserMapper;
import com.iiht.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser loadUserByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public void updateUser(SysUser sysUser) {
        userMapper.update(sysUser);
    }

    @Override
    public void register(SysUser sysUser) {
        sysUser.setRole("ROLE_user");
        userMapper.insert(sysUser);
    }

}
