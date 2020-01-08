package com.fh.service;

import com.fh.beans.User;

public interface UserService {
    User getUserByLoginName(String loginName);
}
