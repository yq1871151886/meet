package com.fh.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class MeetingAgendaBean {

    private Integer planId;
    private Integer meetingId;
    private String planTopicName;
    private Integer unitId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minDate;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date maxDate;
    private Integer issueStatus;
    private String material;
    private String note;
    private String meetingName;
    private String unitName;

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public String getPlanTopicName() {
        return planTopicName;
    }

    public void setPlanTopicName(String planTopicName) {
        this.planTopicName = planTopicName;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Date getMinDate() {
        return minDate;
    }

    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }

    public Date getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public Integer getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(Integer issueStatus) {
        this.issueStatus = issueStatus;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
