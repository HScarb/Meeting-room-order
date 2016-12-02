package com.mtr.service.Impl;

import com.mtr.dao.MeetingMapper;
import com.mtr.dao.UserMapper;
import com.mtr.model.Meeting;
import com.mtr.model.MeetingExample;
import com.mtr.model.User;
import com.mtr.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Scarb's Surface on 12/1/2016.
 */
@Service
public class MeetingServiceImpl implements MeetingService{
    @Autowired
    private MeetingMapper meetingMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<Meeting> selectByMeetingRoomID(Integer ID) {
        MeetingExample meetingExample = new MeetingExample();
        MeetingExample.Criteria criteria = meetingExample.createCriteria();

        criteria.andIdEqualTo(ID);
        return meetingMapper.selectByExample(meetingExample);
    }

    @Override
    public Boolean isMeetingConfilct(List<Meeting> meetings, Integer startTime, Integer endTime) {
        for(Meeting meeting : meetings)
        {
            // if one of the meetings is conflict with this pair of start time and end time
            // return true
            if ((meeting.getStartTime() <= startTime && meeting.getEndTime() >= startTime)
                    || meeting.getStartTime() <= endTime && meeting.getEndTime() >= endTime)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Meeting> selectByUserName(String userName) {
        MeetingExample meetingExample = new MeetingExample();
        MeetingExample.Criteria cri = meetingExample.createCriteria();

        try {
            User user = userMapper.selectByUserName(userName);
            cri.andBookedByEqualTo(user.getId());

            return meetingMapper.selectByExample(meetingExample);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
