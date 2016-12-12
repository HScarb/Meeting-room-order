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

    private String parseString(String requestParam, HttpServletRequest request)
    {
        String result = request.getParameter(requestParam);
        if (result != null && result != "")
            return result;
        return "";
    }

    private Integer parseInteger(String requestParam, HttpServletRequest request)
    {
        Integer result = -1;
        String string = parseString(requestParam, request);
        try {
            result = Integer.parseInt(string);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @RequestMapping("/meeting")
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

    /**
     * 6.提交预定会议室表单，添加会议记录
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/addMeeting")
    public Dictionary<String, Object> addMeeting(HttpServletRequest request)
    {
        String theme, phone, contact, remind, participate, tip;
        Integer userid, starttime, endtime, mtrnumber, type;

        userid = parseInteger("userid", request);
        starttime = parseInteger("starttime", request);
        endtime = parseInteger("endtime", request);
        mtrnumber = parseInteger("mtrnumber", request);
        theme = parseString("theme", request);
        type = parseInteger("type", request);
        contact = parseString("contact", request);
        phone = parseString("phone", request);
        remind = parseString("remind", request);
        participate = parseString("participate", request);
        tip = parseString("tip", request);

        Meeting meeting = new Meeting();
        meeting.setBookedBy(userid);
        meeting.setStartTime(starttime);
        meeting.setEndTime(endtime);
        meeting.setMeetingRoom(mtrnumber);
        meeting.setTheme(theme);
        meeting.setType(type);
        meeting.setContracter(contact);
        meeting.setPhone(phone);
        meeting.setMember(remind);
        meeting.setParticipate(participate);
        meeting.setRemark(tip);
        meeting.setIsend(meetingService.isMeetingEnd(endtime));

        return meetingService.checkAddMeeting(meeting);
    }

    @ResponseBody
    @RequestMapping("/searchMeetingByMemberId")
    public List<Meeting> searchMeetingByMemberId(HttpServletRequest request)
    {
        String memberId = request.getParameter("memberid");

        return meetingService.selectByMemberId(memberId);
    }
}
