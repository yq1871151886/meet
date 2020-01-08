package com.fh.service.impl;

import com.fh.beans.Room;
import com.fh.mapper.IRoomMapper;
import com.fh.service.IRoomService;
import com.fh.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IRoomServiceImpl implements IRoomService {

   @Autowired
   private IRoomMapper iroomMapper;

   @Override
   public PageBean<Room> queryRoom(PageBean<Room> page) {

      Long count = iroomMapper.getCount();

      page.setRecordsFiltered(count);
      page.setRecordsTotal(count);
      page.setData(iroomMapper.queryRoom(page));

      return page;
   }

}
