package com.fh.mapper;

import com.fh.beans.Room;
import com.fh.utils.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IRoomMapper {
 Long getCount();

 List<Room> queryRoom(@Param("page") PageBean<Room> page);

}
