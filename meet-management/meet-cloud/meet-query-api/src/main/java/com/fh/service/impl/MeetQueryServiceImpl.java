package com.fh.service.impl;

import com.fh.dao.MeetQueryDao;
import com.fh.service.MeetQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetQueryServiceImpl implements MeetQueryService {
    @Autowired
    private MeetQueryDao meetQueryDao;
}
