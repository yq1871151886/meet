package com.fh.controller;

import com.fh.enumbean.ResponseServer;
import com.fh.mailsend.MailAnnotation;
import com.fh.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户",description = "用户")
@RestController
@RequestMapping("user")
@CrossOrigin(maxAge = 3600, origins = "http://localhost:8080")
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
    @ApiOperation(value = "为用户增加角色")
    @PutMapping
    @MailAnnotation(mailNum = "894627269@qq.com")
    public ResponseServer addUserRole(
            Integer userId,
            String[] roleList
        ) throws RuntimeException {
        if (StringUtils.isEmpty(userId) && StringUtils.isEmpty(roleList)) {
            return ResponseServer.error();
        }
        return roleService.addUserRole(userId, roleList);
    }

}
