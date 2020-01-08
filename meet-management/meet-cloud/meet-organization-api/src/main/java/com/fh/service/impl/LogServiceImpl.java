package com.fh.service.impl;

import com.fh.beans.LogBean;
import com.fh.dao.LogDao;
import com.fh.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("logService")
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public void addLog(LogBean logBean) {
        logDao.insert(logBean);
    }

}
