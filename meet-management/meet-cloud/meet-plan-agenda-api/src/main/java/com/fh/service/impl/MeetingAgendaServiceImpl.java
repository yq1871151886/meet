package com.fh.service.impl;

import com.fh.bean.MeetingAgendaBean;
import com.fh.bean.MeetingNameBean;
import com.fh.bean.MeetingUnitBean;
import com.fh.dao.MeetingAgendaDao;
import com.fh.enumbean.ResponseServer;
import com.fh.service.IMeetingAgendaService;
import com.fh.utils.PageBean;
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

    @Override
    public PageBean<MeetingAgendaBean> meetingPage(PageBean<MeetingAgendaBean> page, MeetingAgendaBean meetingAgendaBean) {

        try {
            Long count=meetingAgendaDao.meetingPageCount(meetingAgendaBean);
            page.setRecordsFiltered(count);
            page.setRecordsTotal(count);
            page.setData(meetingAgendaDao.meetingPage(page,meetingAgendaBean));

        }catch (Exception e){
            e.printStackTrace();
        }
        return page;
    }
}
