package com.iiht.assignment.service;

import com.iiht.assignment.entity.SysUser;

public interface UserService  {

     SysUser loadUserByUsername(String username);

    void updateUser(SysUser sysUser);

    void register(SysUser sysUser);
}
