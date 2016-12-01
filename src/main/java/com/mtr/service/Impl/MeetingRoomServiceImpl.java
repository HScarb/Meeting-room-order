package com.mtr.service.Impl;

import com.mtr.dao.MeetingRoomMapper;
import com.mtr.model.MeetingRoom;
import com.mtr.model.MeetingRoomExample;
import com.mtr.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Scarb's Surface on 11/28/2016.
 */
@Service
public class MeetingRoomServiceImpl implements MeetingRoomService {

    @Autowired
    private MeetingRoomMapper meetingRoomMapper;

    @Override
    public MeetingRoom selectByMeetingRoomID(Integer meetingRoomID) {
        return meetingRoomMapper.selectByPrimaryKey(meetingRoomID);
    }

    @Override
    public List<MeetingRoom> selectByExample(MeetingRoomExample meetingRoomExample) {
        return meetingRoomMapper.selectByExample(meetingRoomExample);
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


}
