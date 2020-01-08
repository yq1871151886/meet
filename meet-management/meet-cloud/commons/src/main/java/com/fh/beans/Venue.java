package com.fh.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.aspectj.weaver.ast.Var;

/*
会议室地址实体
 */
@TableName("meet_venue")
@Data
public class Venue {

    @TableId(value = "venueId",type = IdType.AUTO)
    public Integer venueId; //会议地址ID

    @TableField("venueName")
    public String venueName; //会议地址

    @TableField("roomNumber")
    public Integer roomNumber; //房间号

    @TableField("seating")
    public Integer seating; //标准座位数

    @TableField("maxSeating")
    public Integer maxSeating; //最多座位数

    @TableField("equipment")
    public String equipment; //会议室功能

    @TableField("other")
    public String other; //其他说明

}
