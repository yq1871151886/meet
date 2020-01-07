package com.fh.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("meet_permissions")
@Data
public class Permissions {
    /**
     * CREATE TABLE `meet_permissions` (
     *   `permissionsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
     *   `permissionsName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '权限名称',
     *   `pid` int(11) DEFAULT NULL,
     *   PRIMARY KEY (`permissionsId`)
     */
    @TableId(value = "permissionsId",type = IdType.AUTO)
    private Integer permissionsId;

    @TableField("permissionsName")
    private String permissionsName;

    @TableField("pid")
    private Integer pid;
}
