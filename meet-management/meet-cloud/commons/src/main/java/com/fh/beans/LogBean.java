package com.fh.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("meet_log")
public class LogBean {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("who")
    private String user;

    @TableField("logintime")
    @DateTimeFormat(pattern = "yyyy-MM-dd:hh:mm:ss")
    private Date logintime;

    @TableField("parameter")
    private String parameter;

    @TableField("methodName")
    private String methodName;

    @TableField("theIp")
    private String theIp;

    @TableField("info")
    private String info;//描述

    @TableField("time")
    private Integer time; //访问执行时间

    @TableField("status")
    private Integer status;

    private LogBean(){}
    private static LogBean logBean;
    public static LogBean gerLogBean(){
        if(logBean == null){
            synchronized (logBean){
                if(logBean == null){
                    logBean = new LogBean();
                }
            }
        }
        return logBean;
    }


}
