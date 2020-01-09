package com.fh.service;

import com.fh.bean.MeetingAgendaBean;
import com.fh.enumbean.ResponseServer;
import com.fh.utils.PageBean;

public interface IMeetingAgendaService {
    ResponseServer initMeeting();

    void addMeeting(MeetingAgendaBean meetingAgenda);

    PageBean<MeetingAgendaBean> meetingPage(PageBean<MeetingAgendaBean> page, MeetingAgendaBean meetingAgendaBean);
}
