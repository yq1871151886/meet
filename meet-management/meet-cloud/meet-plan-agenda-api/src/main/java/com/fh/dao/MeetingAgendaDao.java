package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.bean.MeetingAgendaBean;
import com.fh.bean.MeetingNameBean;
import com.fh.bean.MeetingUnitBean;
import com.fh.utils.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MeetingAgendaDao extends BaseMapper<MeetingAgendaBean> {
    List<MeetingUnitBean> initMeetingUnit();

    List<MeetingNameBean> initMeetingName();

    void addMeeting(MeetingAgendaBean meetingAgenda);

    Long meetingPageCount(@Param("meeting") MeetingAgendaBean meetingAgendaBean);

    List<MeetingAgendaBean> meetingPage(@Param("page") PageBean<MeetingAgendaBean> page,@Param("meeting") MeetingAgendaBean meetingAgendaBean);
}
