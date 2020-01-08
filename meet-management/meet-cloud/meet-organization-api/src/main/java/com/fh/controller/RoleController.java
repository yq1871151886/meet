package com.fh.controller;

import com.fh.enumbean.ResponseEnum;
import com.fh.enumbean.ResponseServer;
import com.fh.logaop.LogAnnotation;
import com.fh.service.RoleService;
import com.fh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
@CrossOrigin(maxAge = 3600,origins ="http://localhost:8080" )
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
    @GetMapping("/{userId}")
    public ResponseServer getRoleByUserId(@PathVariable("userId") Integer userId) {
        return roleService.getRoleByUserId(userId);
    }

    /**
     * 增加角色
     *
     * @return
     */
    @PutMapping("/{roleName}")
    public ResponseServer addRole(@PathVariable("roleName") String roleName){
        if(StringUtils.isEmpty(roleName)){
            return ResponseServer.error(ResponseEnum.PREMETER_IS_NOT_NULL);
        }
        return roleService.addRole(roleName);
    }


}
