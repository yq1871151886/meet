package com.fh.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("meet_meeting_registration")
@Data
public class Registration implements Serializable {
    @TableId(value = "regularMeetingId",type = IdType.AUTO)
    public Integer regularMeetingId; //例会id

    @TableField("meetingId")
    public Integer meetingId; //会议类型ID

    @TableField("meetingTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date meetingTime; //会议时间

    @TableField("securityClassification")
    public Integer securityClassification; //密级 1非密 2机密

    @TableField("emcee")
    public String emcee; //主持人

    @TableField("venueId")
    public Integer venueId; //会议地点

    @TableField("undertaker")
    public String undertaker; //承办人

    @TableField("notification")
    public Integer notification; //是否发送通知：1 是 2否

    @TableField("feedbackTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date feedbackTime; //反馈时间

    @TableField("materialNote")
    public String materialNote; //材料备注

    @TableField("topicId")
    public Integer topicId; //议题名称ID

    @TableField("reporter")
    public String reporter; //汇报人

    @TableField("meetingMaterial")
    public String meetingMaterial; //会议材料

    @TableField("userId")
    public String userId;//参加议题讨论人员,多个人员id 逗号隔开

    @TableField("meetingName")
    public String meetingName;
}
