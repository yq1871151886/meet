package com.fh.controller;


import com.fh.bean.MeetingAgendaBean;
import com.fh.enumbean.ResponseServer;
import com.fh.service.IMeetingAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("meetingAgenda")
@CrossOrigin(value = "http://localhost:8080",maxAge = 3600)
public class MeetingAgendaController {

    @Autowired
    IMeetingAgendaService meetingAgendaService;

    /**
     * 查询下拉里面的属性
     * @return
     */
    @GetMapping
    public ResponseServer initMeeting(){

        return meetingAgendaService.initMeeting();
    }

    /**
     * 计划议题登记
     * @param meetingAgenda
     * @return
     *
     */
    @PostMapping
    public ResponseServer addMeeting(MeetingAgendaBean meetingAgenda){
        meetingAgendaService.addMeeting(meetingAgenda);

        return ResponseServer.success();
    }
}
