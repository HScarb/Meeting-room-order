package com.mtr.controller;

import com.mtr.model.MeetingRoom;
import com.mtr.model.MeetingRoomExample;
import com.mtr.service.MeetingRoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Scarb's Surface on 11/28/2016.
 */
@Controller
public class MeetingRoomController {
    @Resource
    private MeetingRoomService meetingRoomService;

    @RequestMapping("/meetingroom")
    public ModelAndView toLogin()
    {
        ModelAndView mav = new ModelAndView("meetingroom");
        return mav;
    }

    /**
     * 7.根据会议室id得到会议室详细情况
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/meetingRoomProperties")
    public MeetingRoom meetingRoomProperties(HttpServletRequest request)
    {
        String meetingRoomID = request.getParameter("mtrnumber");
        try {
            Integer id = Integer.parseInt(meetingRoomID);

            return meetingRoomService.selectByMeetingRoomID(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

//        MeetingRoomExample meetingRoomExample = new MeetingRoomExample();
//        MeetingRoomExample.Criteria cri = meetingRoomExample.createCriteria();


    }

    /**
     * 12.删除会议室
     * @param request
     * @return
     */
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

    /**
     * 4.按时间查询空闲会议室
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/searchFreeMeetingRoom")
    public List<MeetingRoom> searchFreeMeetingRoom(HttpServletRequest request)
    {
        try {
            String starttime = request.getParameter("starttime");
            String endtime = request.getParameter("endtime");
            Integer startTime = Integer.parseInt(starttime);
            Integer endTime = Integer.parseInt(endtime);

            return meetingRoomService.selectFreeMeetingRoom(startTime, endTime);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
