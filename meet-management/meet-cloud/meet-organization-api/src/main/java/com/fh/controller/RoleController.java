package com.fh.controller;

import com.fh.enumbean.ResponseServer;
import com.fh.service.RoleService;
import com.fh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 用户的id 获取所有是角色和用户默认选中的角色
     *
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public ResponseServer getRoleByUserId(@PathVariable("userId") Integer userId) {
        return roleService.getRoleByUserId(userId);
    }


}
