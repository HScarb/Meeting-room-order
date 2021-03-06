package com.mtr.model;

public class Meeting {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.ID
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.START_TIME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Integer startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.END_TIME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Integer endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.BOOKED_BY
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Integer bookedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.MEETING_ROOM
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Integer meetingRoom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.THEME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String theme;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.REMARK
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.TYPE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.CONTRACTER
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String contracter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.PHONE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.MEMBER
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String member;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.PARTICIPATE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String participate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.ISEND
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Boolean isend;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.ID
     *
     * @return the value of meeting.ID
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.ID
     *
     * @param id the value for meeting.ID
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.START_TIME
     *
     * @return the value of meeting.START_TIME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.START_TIME
     *
     * @param startTime the value for meeting.START_TIME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.END_TIME
     *
     * @return the value of meeting.END_TIME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.END_TIME
     *
     * @param endTime the value for meeting.END_TIME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.BOOKED_BY
     *
     * @return the value of meeting.BOOKED_BY
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Integer getBookedBy() {
        return bookedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.BOOKED_BY
     *
     * @param bookedBy the value for meeting.BOOKED_BY
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setBookedBy(Integer bookedBy) {
        this.bookedBy = bookedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.MEETING_ROOM
     *
     * @return the value of meeting.MEETING_ROOM
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Integer getMeetingRoom() {
        return meetingRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.MEETING_ROOM
     *
     * @param meetingRoom the value for meeting.MEETING_ROOM
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setMeetingRoom(Integer meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.THEME
     *
     * @return the value of meeting.THEME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getTheme() {
        return theme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.THEME
     *
     * @param theme the value for meeting.THEME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.REMARK
     *
     * @return the value of meeting.REMARK
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.REMARK
     *
     * @param remark the value for meeting.REMARK
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.TYPE
     *
     * @return the value of meeting.TYPE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.TYPE
     *
     * @param type the value for meeting.TYPE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.CONTRACTER
     *
     * @return the value of meeting.CONTRACTER
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getContracter() {
        return contracter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.CONTRACTER
     *
     * @param contracter the value for meeting.CONTRACTER
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setContracter(String contracter) {
        this.contracter = contracter == null ? null : contracter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.PHONE
     *
     * @return the value of meeting.PHONE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.PHONE
     *
     * @param phone the value for meeting.PHONE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.MEMBER
     *
     * @return the value of meeting.MEMBER
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getMember() {
        return member;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.MEMBER
     *
     * @param member the value for meeting.MEMBER
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.PARTICIPATE
     *
     * @return the value of meeting.PARTICIPATE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getParticipate() {
        return participate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.PARTICIPATE
     *
     * @param participate the value for meeting.PARTICIPATE
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setParticipate(String participate) {
        this.participate = participate == null ? null : participate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.ISEND
     *
     * @return the value of meeting.ISEND
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Boolean getIsend() {
        return isend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.ISEND
     *
     * @param isend the value for meeting.ISEND
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setIsend(Boolean isend) {
        this.isend = isend;
    }
}