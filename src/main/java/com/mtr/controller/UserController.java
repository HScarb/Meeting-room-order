package com.mtr.controller;

import com.mtr.model.User;
import com.mtr.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    @ResponseBody
    @RequestMapping("/responseEntity")
    public Dictionary<String, String> responseEntityTest()
    {
        Dictionary<String, String> dictionary = new Hashtable<String, String>();
        dictionary.put("Status", "true");
        return dictionary;
    }
}
