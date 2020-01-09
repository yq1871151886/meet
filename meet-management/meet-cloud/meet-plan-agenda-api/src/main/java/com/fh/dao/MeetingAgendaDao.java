package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.bean.MeetingAgendaBean;
import com.fh.bean.MeetingNameBean;
import com.fh.bean.MeetingUnitBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MeetingAgendaDao extends BaseMapper<MeetingAgendaBean> {
    List<MeetingUnitBean> initMeetingUnit();

    List<MeetingNameBean> initMeetingName();

    void addMeeting(MeetingAgendaBean meetingAgenda);
}
