package com.fh.controller;


import com.fh.service.MeetQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController("meetQuery")
public class MeetQueryController {
    @Autowired
    private  MeetQueryService meetQueryService;


 }
