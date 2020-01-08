package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.beans.Role;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository
@CacheNamespace(size=512)
public interface RoleDao extends BaseMapper<Role> {

    List<Map<String, Object>> selectRoleList(@Param("userId") Integer userId);

    void saveUserRole(@Param("userId") Integer userId,@Param("valueOf") Integer valueOf);

    void deleteRoleById(Integer userId);
}
