package com.fh.service;

import com.fh.beans.Permissions;
import com.fh.enumbean.ResponseServer;

import java.util.List;
import java.util.Map;

public interface PermissionsService {
    List<Map<String,Object>> queryPermissionsService();
    ResponseServer insertPermissions(Permissions permissions);
    ResponseServer updatePermissions(Permissions permissions);
}
