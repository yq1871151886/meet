package com.fh.service;

import com.fh.beans.Room;
import com.fh.utils.PageBean;

public interface IRoomService {

 PageBean<Room> queryRoom(PageBean<Room> page);
}
