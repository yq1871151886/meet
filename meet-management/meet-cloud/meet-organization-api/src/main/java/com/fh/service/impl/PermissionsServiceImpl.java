package com.fh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.beans.Permissions;
import com.fh.dao.PermissionsDao;
import com.fh.enumbean.ResponseEnum;
import com.fh.enumbean.ResponseServer;
import com.fh.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("permissionsService")
public class PermissionsServiceImpl implements PermissionsService {
    @Autowired
    private PermissionsDao permissionsDao;

    /**
     * 获取权限树的方法
     * 首先从
     * @return
     */
    public List<Map<String,Object>> queryPermissionsService(){
        QueryWrapper<Permissions> queryWrapper = new QueryWrapper<Permissions>();
        List<Permissions> permissions = permissionsDao.selectList(queryWrapper);
        return getPermissions(0,permissions);
    }

    @Override
    public ResponseServer insertPermissions(Permissions permissions) {
        permissionsDao.insert(permissions);
        return ResponseServer.success(ResponseEnum.PERMISSIONS_ADD_SUCCESS);
    }

    @Override
    public ResponseServer updatePermissions(Permissions permissions) {
        permissionsDao.updateById(permissions);
        return ResponseServer.success(ResponseEnum.PERMISSIONS_UPDATE_SUCCESS);
    }

    private List<Map<String,Object>> getPermissions(Integer pid,List<Permissions> permissions){
        List<Map<String,Object>>  list = new ArrayList<Map<String,Object>>();
        Integer i = 0;
        permissions.forEach(permission ->{
            Map<String,Object> map = null;
            if (pid.equals(permission.getPid())){
                map = new HashMap<String, Object>();
                map.put("id",permission.getPermissionsId());
                map.put("name",permission.getPermissionsName());
                map.put("children",getPermissions(permission.getPermissionsId(),permissions));
                if (i.equals(permission.getPid())){
                    map.put("iconOpen","/commons/orgimg/1_open.png");
                    map.put("iconClose","/commons/orgimg/organ.png");
                }else {
                    map.put("icon","/commons/orgimg/dept2.png");
                }
            }
            if (map!=null){
                list.add(map);
            }
        });
        return list;
    }


}
