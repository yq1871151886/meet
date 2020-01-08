package com.fh.service;

import com.fh.enumbean.ResponseServer;

public interface RoleService {
    ResponseServer addUserRole(Integer userId, String[] roleList);

    ResponseServer getRoleByUserId(Integer userId);
}
