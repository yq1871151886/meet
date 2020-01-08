package com.fh.controller;

import com.fh.enumbean.ResponseServer;
import com.fh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private RoleService roleService;


    /**
     * 为用户增加角色
     *
     * @param userId
     * @param roleList
     * @return
     */
    @PutMapping
    public ResponseServer addUserRole(Integer userId, String[] roleList) {
        if(StringUtils.isEmpty(userId) && StringUtils.isEmpty(roleList)){
            return ResponseServer.error();
        }
        return roleService.addUserRole(userId, roleList);
    }

}
