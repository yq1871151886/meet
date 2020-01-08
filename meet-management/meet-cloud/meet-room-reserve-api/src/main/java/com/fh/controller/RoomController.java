package com.fh.controller;

import com.fh.beans.Room;
import com.fh.mapper.IRoomMapper;
import com.fh.service.IRoomService;
import com.fh.util.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/room")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class RoomController {



       @Autowired
       private IRoomService iroomService;

       @Autowired
       private IRoomMapper iroomMapper;

     // @GetMapping("/queryRoom")
     @RequestMapping("/queryRoom")
      public Object queryRoom(@RequestParam Map map){
      List<Room> emp = iroomService.getMap(map);
      Long count = iroomMapper.getCount();
      Map tempMap = new HashMap();
      tempMap.put("code",0);
      tempMap.put("msg","");
      tempMap.put("count",count);
      tempMap.put("data",emp);
      return tempMap;
      }




}
