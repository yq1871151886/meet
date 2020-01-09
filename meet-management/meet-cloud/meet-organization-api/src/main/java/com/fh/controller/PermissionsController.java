package com.fh.controller;

import com.fh.beans.Permissions;
import com.fh.enumbean.ResponseServer;
import com.fh.service.PermissionsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(value = "权限",description = "权限")
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
    @ApiOperation(value = "获取权限树")
    //@ApiImplicitParam(name = "name", value = "名称", paramType = "query", required = true, dataType = "String")
    @GetMapping
    public ResponseServer queryPerminssions(){
        ResponseServer responseServer = permissionsService.queryPermissionsService();
        return responseServer;
    }

    /**
     * 权限增加
     * @param permissions
     * @return
     */
    @ApiOperation(value = "权限增加")
    //@ApiImplicitParam(name = "name", value = "名称", paramType = "query", required = true, dataType = "String")
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
    @ApiOperation(value = "权限修改")
    //@ApiImplicitParam(name = "name", value = "名称", paramType = "query", required = true, dataType = "String")
    @PostMapping
    public ResponseServer updatePermissions(Permissions permissions){
        ResponseServer responseServer = permissionsService.updatePermissions(permissions);
        return responseServer;
    }


}
