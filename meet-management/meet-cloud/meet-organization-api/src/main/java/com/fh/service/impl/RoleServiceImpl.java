package com.fh.service.impl;

import com.fh.beans.Role;
import com.fh.dao.RoleDao;
import com.fh.enumbean.ResponseServer;
import com.fh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleDao roleDao;

    // 为用户增加角色
    @Override
    public ResponseServer addUserRole(Integer userId, String[] roleList) {
        for (int i = 0; i < roleList.length; i++) {
            roleDao.saveUserRole(userId, Integer.valueOf(roleList[i]));
        }
        return ResponseServer.success();
    }

    //用户的id 获取所有是角色和用户默认选中的角色
    @Override
    public ResponseServer getRoleByUserId(Integer userId) {
        List<Role> roleslist = roleDao.selectRoleList(userId);
        return ResponseServer.success(roleslist);
    }
}
