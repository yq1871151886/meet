package com.fh.controller;

import com.fh.service.RoleService;
import com.fh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public class RoleContrller {

    @Autowired
    private RoleService roleService;
}
