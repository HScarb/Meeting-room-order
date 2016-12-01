package com.mtr.controller;

import com.mtr.model.MeetingRoom;
import com.mtr.model.MeetingRoomExample;
import com.mtr.service.MeetingRoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by Scarb's Surface on 11/28/2016.
 */
@Controller
public class MeetingRoomController {
    @Resource
    private MeetingRoomService meetingRoomService;

    @ResponseBody
    @RequestMapping("/meetingRoomProperties")
    public MeetingRoom meetingRoomProperties(HttpServletRequest request)
    {
        String meetingRoomID = request.getParameter("mtrnumber");
        Integer id = Integer.parseInt(meetingRoomID);

        MeetingRoomExample meetingRoomExample = new MeetingRoomExample();
        MeetingRoomExample.Criteria cri = meetingRoomExample.createCriteria();

        return meetingRoomService.selectByMeetingRoomID(id);
    }

    @ResponseBody
    @RequestMapping("/deleteMeetingRoom")
    public Dictionary<String, Boolean> deleteMeetingRoom(HttpServletRequest request)
    {
        String meetingRoomID = request.getParameter("mtrnumber");
        Integer ID = Integer.parseInt(meetingRoomID);

        Dictionary<String, Boolean> dict = new Hashtable<>();
        dict.put("Status", meetingRoomService.deleteByID(ID));
        return dict;
    }
}
