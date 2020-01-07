package com.fh.beans;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("meet_role")
@Data
public class Role {
    /**
     * CREATE TABLE `meet_role` (
     *   `roleId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
     *   `roleName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色名称',
     *   PRIMARY KEY (`roleId`)
     */
    @TableId(value = "roleId",type = IdType.AUTO)
    private Integer roleId;

    @TableField(value = "roleName")
    private String roleName;

}
