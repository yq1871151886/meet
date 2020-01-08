package com.fh.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/*
* 会议类型实体
* */
@TableName("meet_meetingname")
@Data
public class MeetingType {

    @TableId(value = "meetingId",type = IdType.AUTO)
    public Integer meetingId; //ID

    @TableField("meetingName")
    public String meetingName; //会议类型
}
