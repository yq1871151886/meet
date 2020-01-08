package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.beans.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface RoleDao extends BaseMapper<Role> {

    List<Role> selectRoleList(Integer userId);

    void saveUserRole(@Param("userId") Integer userId,@Param("valueOf") Integer valueOf);
}
