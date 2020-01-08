package com.fh.beans;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("meet_role")
@Data
public class Role implements Serializable {
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

    private Role(){}
    private static Role role;
    public static Role gerRole(){
        if(role == null){
            synchronized (role){
                if(role == null){
                    role = new Role();
                }
            }
        }
        return role;
    }

}
