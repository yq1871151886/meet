package com.fh.controller;

import com.fh.beans.Permissions;
import com.fh.enumbean.ResponseServer;
import com.fh.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("permissions")
@CrossOrigin(maxAge = 3600,origins = "http://localhost:8080")
public class PermissionsController {

    @Autowired
    private PermissionsService permissionsService;

    /**
     * 权限查询
     * @return
     */
    @GetMapping
    public List<Map<String,Object>> queryPerminssions(){
        List<Map<String, Object>> list = permissionsService.queryPermissionsService();
        return list;
    }

    /**
     * 权限增加
     * @param permissions
     * @return
     */
    @PutMapping
    public ResponseServer insertPermissions(Permissions permissions){
        ResponseServer responseServer = permissionsService.insertPermissions(permissions);
        return responseServer;
    }

    /**
     * 根据id对权限表进行查询
     * @param permissions
     * @return
     */
    @PostMapping
    public ResponseServer updatePermissions(Permissions permissions){
        ResponseServer responseServer = permissionsService.updatePermissions(permissions);
        return responseServer;
    }


}
