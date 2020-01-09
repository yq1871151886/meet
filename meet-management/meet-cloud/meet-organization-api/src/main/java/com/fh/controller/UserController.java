package com.fh.controller;

import com.fh.enumbean.ResponseServer;
import com.fh.mailsend.MailAnnotation;
import com.fh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
