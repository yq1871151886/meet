package com.fh.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("meet_draft_notice")
@Data
public class User {
    /**
     * CREATE TABLE `meet_draft_notice` (
     *  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
     *   `loginName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '登录名称',
     *   `userName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名称',
     *   `passWord` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户密码',
     *   PRIMARY KEY (`userId`)
     */
    @TableId(value = "userId",type = IdType.AUTO)
    private Integer userId;

    @TableField("loginName")
    private String loginName;

    @TableField("userName")
    private String userName;

    @TableField("password")
    private String password;





}
