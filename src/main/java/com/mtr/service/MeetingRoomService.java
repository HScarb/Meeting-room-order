package com.mtr.service;

import com.mtr.model.MeetingRoom;
import com.mtr.model.MeetingRoomExample;

import java.util.Dictionary;
import java.util.List;

/**
 * Created by Scarb's Surface on 11/28/2016.
 */
public interface MeetingRoomService {

    MeetingRoom selectByMeetingRoomID(Integer meetingRoomID);

    List<MeetingRoom> selectByExample(MeetingRoomExample meetingRoomExample);

    Boolean deleteByName(String meetingRoomName);

    Boolean deleteByID(Integer id);

    List<MeetingRoom> selectFreeMeetingRoom(Integer startTime, Integer endTime);
}
