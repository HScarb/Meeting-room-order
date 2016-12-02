package com.mtr.service;

import com.mtr.model.Meeting;

import java.util.List;

/**
 * Created by Scarb's Surface on 12/1/2016.
 */
public interface MeetingService {
    List<Meeting> selectByMeetingRoomID(Integer ID);

    Boolean isMeetingConfilct(List<Meeting> meetings, Integer startTime, Integer endTime);

    List<Meeting> selectByUserName(String userName);
}