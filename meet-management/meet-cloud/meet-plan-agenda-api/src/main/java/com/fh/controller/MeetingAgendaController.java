package com.fh.controller;


import com.fh.bean.MeetingAgendaBean;
import com.fh.enumbean.ResponseServer;
import com.fh.service.IMeetingAgendaService;
import com.fh.utils.PageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@Api(value = "议题")
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
    @ApiOperation(value = "获取所有的议题列表")
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
    @ApiOperation(value = "新增一个议题")
    @PostMapping("addMeeting")
    public ResponseServer addMeeting(MeetingAgendaBean meetingAgenda){
        meetingAgendaService.addMeeting(meetingAgenda);

        return ResponseServer.success();
    }

    @ApiOperation(value = "审批议题")
    @PostMapping("meetingPage")
    public PageBean<MeetingAgendaBean> meetingPage(PageBean<MeetingAgendaBean> page,MeetingAgendaBean meetingAgenda){

        return meetingAgendaService.meetingPage(page,meetingAgenda);
    }
}
