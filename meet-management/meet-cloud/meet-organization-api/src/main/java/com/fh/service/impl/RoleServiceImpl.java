package com.fh.service.impl;

import com.fh.beans.Role;
import com.fh.dao.RoleDao;
import com.fh.enumbean.ResponseServer;
import com.fh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("roleService")
public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleDao roleDao;

    /**
     * 为用户增加角色
     * 先删除
     * 在循环增加
     */
    @Override
    public ResponseServer addUserRole(Integer userId, String[] roleList) {
        roleDao.deleteRoleById(userId);
        for (int i = 0; i < roleList.length; i++) {
            roleDao.saveUserRole(Integer.valueOf(roleList[i]), userId);
        }
        return ResponseServer.success();
    }

    /**
     * 用户的id 可为null(查询所有)
     * 获取所有是角色和用户默认选中的角色
     *
     * @param userId
     * @return
     */
    @Override
    public ResponseServer getRoleByUserId(Integer userId) {
        List<Map<String, Object>> maps = roleDao.selectRoleList(userId);
        return ResponseServer.success(maps);
    }

    /**
     * 增加
     * @param roleName
     * @return
     */
    @Override
    public ResponseServer addRole(String roleName) {
        Role role = Role.gerRole();
        role.setRoleName(roleName);
        int insert = roleDao.insert(role);
        System.out.println("service增加了"+insert+"条数据。");
        return ResponseServer.success();
    }
}
