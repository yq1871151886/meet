package com.fh.service;

import com.fh.bean.MeetingAgendaBean;
import com.fh.enumbean.ResponseServer;

public interface IMeetingAgendaService {
    ResponseServer initMeeting();

    void addMeeting(MeetingAgendaBean meetingAgenda);
}
