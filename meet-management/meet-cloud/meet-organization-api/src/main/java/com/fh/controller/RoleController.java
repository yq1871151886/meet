package com.fh.controller;

import com.fh.enumbean.ResponseEnum;
import com.fh.enumbean.ResponseServer;
import com.fh.mailsend.MailAnnotation;
import com.fh.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
@Api(value = "角色",description = "角色")
@RestController
@RequestMapping("/role")
@CrossOrigin(maxAge = 3600, origins = "http://localhost:8080")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 用户的id 可为null(查询所有)
     * 获取所有是角色和用户默认选中的角色
     *
     * @param userId
     * @return
     */
    @ApiOperation(value = "用户的id 可为null(查询所有),获取所有是角色和用户默认选中的角色")
    @GetMapping("/{userId}")
    @MailAnnotation(mailNum = "894627269@qq.com")
    public ResponseServer getRoleByUserId(
            @PathVariable("userId") Integer userId
        ) throws RuntimeException {
        return roleService.getRoleByUserId(userId);
    }

    /**
     * 增加角色
     *
     * @return
     */
    @ApiOperation(value = "增加角色")
    @PutMapping("/{roleName}")
    @MailAnnotation(mailNum = "894627269@qq.com")
    public ResponseServer addRole(
            @PathVariable("roleName") String roleName
        ) throws RuntimeException {
        if (StringUtils.isEmpty(roleName)) {
            return ResponseServer.error(ResponseEnum.PREMETER_IS_NOT_NULL);
        }
        return roleService.addRole(roleName);
    }


}
