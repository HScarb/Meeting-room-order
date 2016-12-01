package com.mtr.controller;

import com.mtr.model.User;
import com.mtr.model.UserExample;
import com.mtr.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Scarb's Surface on 11/22/2016.
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getIndex()
    {
        ModelAndView mav = new ModelAndView("index");
        User user = userService.selectUserById(1);
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("/login")
    public ModelAndView toLogin()
    {
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

    @ResponseBody
    @RequestMapping("/responseEntity")
    public Dictionary<String, Boolean> responseEntityTest()
    {
        Dictionary<String, Boolean> dictionary = new Hashtable<String, Boolean>();
        dictionary.put("Status", true);
        return dictionary;
    }

    @ResponseBody
    @RequestMapping("/checkLogin")
    public Dictionary<String, Boolean> checkLogin(HttpServletRequest request)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Dictionary<String, Boolean> dict = new Hashtable<>();
        dict.put("Status", userService.UserLogin(username, password));
        return dict;
    }

    @ResponseBody
    @RequestMapping("/checkUserName")
    public Dictionary<String, Boolean> checkUserName(HttpServletRequest request)
    {
        String username = request.getParameter("username");

        Dictionary<String, Boolean> dict = new Hashtable<>();
        // 检测用户名是否存在
        if (userService.isUserNameExist(username))
            // 用户名存在，则不可用，返回false
            dict.put("Status", false);
        else
            dict.put("Status", true);
        return dict;
    }

    @ResponseBody
    @RequestMapping("/checkRegister")
    public Dictionary<String, Boolean> checkRegister(HttpServletRequest request)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("password");
        String company = request.getParameter("unit");
        String email = request.getParameter("mail");

        User user = new User();
        user.setUserName(username);
        user.setCompany(password);
        user.setName(name);
        user.setCompany(company);
        user.setEmail(email);

        Dictionary<String, Boolean> dictionary = new Hashtable<String, Boolean>();
        dictionary.put("Status", userService.UserRegister(user));
        return dictionary;
    }

    @ResponseBody
    @RequestMapping("/searchUserByUnit")
    public List<User> searchByUnit(HttpServletRequest request)
    {
        String company = request.getParameter("unit");

        UserExample userExample = new UserExample();
        UserExample.Criteria cri = userExample.createCriteria();

        cri.andCompanyEqualTo(company);

        return userService.selectByExample(userExample);
    }

    @ResponseBody
    @RequestMapping("/changePassword")
    public Dictionary<String, Boolean> changePassword(HttpServletRequest request)
    {
        String userID = request.getParameter("userid");
        String oldpwd = request.getParameter("oldpassword");
        String newpwd = request.getParameter("newpassword");

        Integer ID = Integer.parseInt(userID);

        Dictionary<String, Boolean> dictionary = new Hashtable<String, Boolean>();
        dictionary.put("Status", userService.changePassword(ID, oldpwd, newpwd));
        return dictionary;
    }
}
