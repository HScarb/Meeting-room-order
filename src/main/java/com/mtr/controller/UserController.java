package com.mtr.controller;

import com.mtr.model.User;
import com.mtr.model.UserExample;
import com.mtr.service.UserService;
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

    @RequestMapping("/user")
    public ModelAndView toLogin()
    {
        ModelAndView mav = new ModelAndView("user");
        return mav;
    }

    /**
     * 1.验证登录
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkLogin")
    public Dictionary<String, Object> checkLogin(HttpServletRequest request)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //Boolean flag = userService.U(username, password);


        return userService.UserLogin(username, password);
    }

    /**
     * 2.检查用户名是否重复
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkUserName")
    public Dictionary<String, Object> checkUserName(HttpServletRequest request)
    {
        String username = request.getParameter("username");

        return userService.checkUserName(username);
    }

    /**
     * 3.用户注册
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkRegister")
    public Dictionary<String, Object> checkRegister(HttpServletRequest request)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String company = request.getParameter("company");
        String email = request.getParameter("email");
        String department = request.getParameter("department");

        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setName(name);
        user.setCompany(company);
        user.setEmail(email);
        user.setDepartment(department);

        return userService.UserRegister(user);
    }

    /**
     * 5.根据单位搜索
     * @param request
     * @return
     */
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

    /**
     * 9.修改密码
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/changePassword")
    public Dictionary<String, Object> changePassword(HttpServletRequest request)
    {
        String userID = request.getParameter("userid");
        String oldpwd = request.getParameter("oldpassword");
        String newpwd = request.getParameter("newpassword");

        Integer ID = Integer.parseInt(userID);

        return userService.changePassword(ID, oldpwd, newpwd);
    }

    /**
     * 10.修改个人信息
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateUser")
    public Dictionary<String, Object> updateUser(HttpServletRequest request)
    {
        String username = request.getParameter("username");
        String type = request.getParameter("type");
        String value = request.getParameter("value");

        return userService.updateUser(username, type, value);
    }

    /**
     * 14.管理员搜索用户
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/adminSearchUser")
    public List<User> adminUpdateUser(HttpServletRequest request)
    {
        String name = request.getParameter("name");

        if (name.equals("all"))
            return userService.selectAll();
        else
            return userService.selectByName(name);
    }

    @ResponseBody
    @RequestMapping("/deleteUser")
    public Dictionary<String, Boolean> deleteUser(HttpServletRequest request)
    {
        String username = request.getParameter("username");

        Dictionary<String, Boolean> dictionary = new Hashtable<String, Boolean>();
        dictionary.put("Status", userService.deleteByUserName(username));

        return dictionary;
    }

    @ResponseBody
    @RequestMapping("/addUser")
    public void addUser(HttpServletRequest request)
    {
        return;
    }
}
