package com.fh.service.impl;

import com.fh.bean.MeetingAgendaBean;
import com.fh.bean.MeetingNameBean;
import com.fh.bean.MeetingUnitBean;
import com.fh.dao.MeetingAgendaDao;
import com.fh.enumbean.ResponseServer;
import com.fh.service.IMeetingAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MeetingAgendaServiceImpl implements IMeetingAgendaService {

    @Autowired
    MeetingAgendaDao meetingAgendaDao;


    @Override
    public ResponseServer initMeeting() {
        ResponseServer success = null;
        try{
            List<MeetingUnitBean> meetingUnit=meetingAgendaDao.initMeetingUnit();
            List<MeetingNameBean> meetingName=meetingAgendaDao.initMeetingName();
            Map<String ,Object> map=new HashMap();
            map.put("meetingUnit",meetingUnit);
            map.put("meetingName",meetingName);
            success= ResponseServer.success(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return success;
    }

    @Override
    public void addMeeting(MeetingAgendaBean meetingAgenda) {
        meetingAgendaDao.addMeeting(meetingAgenda);
    }
}
