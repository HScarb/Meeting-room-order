package com.mtr.service.Impl;

import com.mtr.dao.MeetingRoomMapper;
import com.mtr.model.Meeting;
import com.mtr.model.MeetingExample;
import com.mtr.model.MeetingRoom;
import com.mtr.model.MeetingRoomExample;
import com.mtr.service.MeetingRoomService;
import com.mtr.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scarb's Surface on 11/28/2016.
 */
@Service
public class MeetingRoomServiceImpl implements MeetingRoomService {

    @Autowired
    private MeetingRoomMapper meetingRoomMapper;

    @Resource
    private MeetingService meetingService;

    @Override
    public MeetingRoom selectByMeetingRoomID(Integer meetingRoomID) {
        try {
            return meetingRoomMapper.selectByPrimaryKey(meetingRoomID);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MeetingRoom> selectByExample(MeetingRoomExample meetingRoomExample) {
        try {
            return meetingRoomMapper.selectByExample(meetingRoomExample);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean deleteByName(String meetingRoomName) {
        MeetingRoomExample meetingRoomExample = new MeetingRoomExample();
        MeetingRoomExample.Criteria cri = meetingRoomExample.createCriteria();

        cri.andNameEqualTo(meetingRoomName);
        try {
            meetingRoomMapper.deleteByExample(meetingRoomExample);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean deleteByID(Integer id) {
        try {
            meetingRoomMapper.deleteByPrimaryKey(id);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<MeetingRoom> selectFreeMeetingRoom(Integer startTime, Integer endTime) {
        List<MeetingRoom> meetingRooms = meetingRoomMapper.selectByExample(new MeetingRoomExample());
        // traverse all meeting rooms
        for (MeetingRoom mtr : meetingRooms)
        {
            // if this meeting room is conflict, drop this meeting room
            List<Meeting> meetings = meetingService.selectByMeetingRoomID(mtr.getId());
            if (meetingService.isMeetingConfilct(meetings, startTime, endTime))
            {
                meetingRooms.remove(mtr);
            }
        }
        return meetingRooms;
    }


}
