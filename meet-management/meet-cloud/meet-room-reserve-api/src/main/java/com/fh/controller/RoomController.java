package com.fh.controller;

import com.fh.beans.Room;
import com.fh.service.IRoomService;
import com.fh.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class RoomController {



 @Autowired
 private IRoomService iroomService;


 @GetMapping("/queryRoom")
 public PageBean<Room> queryRoom(PageBean<Room> page){
  return iroomService.queryRoom(page);
 }




}
