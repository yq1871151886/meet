package com.fh.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("meet_venue")
public class Room {

   @TableId("venueId")
   private Integer venueId; //会议室id

   @TableField("venueName")
   private String venueName;//会议地址

   @TableField("roomNumber")
   private Integer roomNumber;//房间号
   @TableField("seating")
   private Integer seating;//标准座位数
   @TableField("equipment")
   private String equipment;//会议室功能
   @TableField("other")
   private String other; //其他说明




}
