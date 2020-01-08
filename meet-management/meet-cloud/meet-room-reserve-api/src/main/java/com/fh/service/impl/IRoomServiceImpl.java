package com.fh.service.impl;

import com.fh.beans.Room;
import com.fh.mapper.IRoomMapper;
import com.fh.service.IRoomService;
import com.fh.util.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IRoomServiceImpl implements IRoomService {

   @Autowired
   private IRoomMapper iroomMapper;

//   @Override
//   public PageBean<Room> queryRoom(PageBean<Room> page) {
//
//      Long count = iroomMapper.getCount();
//
//      page.setRecordsFiltered(count);
//      page.setRecordsTotal(count);
//      page.setData(iroomMapper.queryRoom(page));
//
//      return page;
//   }

//   @Override
//   public Layui queryRoom(Layui layui) {
//      Long count = iroomMapper.getCount();
//      layui.put("count",count);
//      List<Room> rooms = iroomMapper.queryRoom();
//      layui.put("data",rooms);
//      return layui;
//   }

   @Override
   public List<Room> getMap(Map map) {

      int pageNo = map.get("pageNo") == null ? 1:Integer.valueOf(map.get("pageNo")+ "");
      int pageSize = map.get("pageSize") == null ? 1:Integer.valueOf(map.get("pageSize")+ "");

      map.put("start",(pageNo-1)*pageSize);
      map.put("end",pageNo*pageSize+1);

      return iroomMapper.queryRoom(map);
   }
}
