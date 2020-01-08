package com.fh.mapper;

import com.fh.beans.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface IRoomMapper {
 Long getCount();

 List<Room> queryRoom(@Param("map") Map map);

}
