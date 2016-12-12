package com.mtr.controller;

import com.mtr.model.Meeting;
import com.mtr.service.MeetingService;
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
 * Created by Scarb's Surface on 12/2/2016.
 */
@Controller
public class MeetingController {
    @Resource
    private MeetingService meetingService;

    @RequestMapping
    public ModelAndView toMeeting()
    {
        ModelAndView mav = new ModelAndView("meeting");
        return mav;
    }

    @ResponseBody
    @RequestMapping("/userMeeting")
    public List<Meeting> userMeeting(HttpServletRequest request)
    {
        String userName = request.getParameter("username");

        return meetingService.selectByUserName(userName);
    }

    @ResponseBody
    @RequestMapping("/addMeeting")
    public Dictionary<String, Boolean> addMeeting(HttpServletRequest request)
    {
        String starttime, endtime, mtrname, theme, type, phone, member, remark;
        Integer startTime, endTime, mtrID, typeID;
        if (request.getParameter("starttime") != null || request.getParameter("starttime") != ""){
            starttime = request.getParameter("starttime");
            startTime = Integer.parseInt(starttime);
        }
        else {
            starttime = null;
        }
//        if (request.getParameter())

        Dictionary<String, Boolean> dict = new Hashtable();
        dict.put("Status", true);
        return dict;
    }

    @ResponseBody
    @RequestMapping("/searchMeetingByMemberId")
    public List<Meeting> searchMeetingByMemberId(HttpServletRequest request)
    {
        String memberId = request.getParameter("memberid");

        return meetingService.selectByMemberId(memberId);
    }
}
