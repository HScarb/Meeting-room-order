package com.mtr.service.Impl;

import com.mtr.dao.UserMapper;
import com.mtr.model.User;
import com.mtr.model.UserExample;
import com.mtr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Scarb's Surface on 11/22/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Dictionary<String, Object> UserLogin(String userName, String password) {
        Boolean status;
        Dictionary<String, Object> dict = new Hashtable<>();
        User user;

        try {
            user = userMapper.selectByUserName(userName);
        } catch (Exception e) {
            e.printStackTrace();
            user = null;
        }

        if (user != null) {
            if (user.getPassword().equals(password)) {
                dict.put("Status", false);
                dict.put("userName", user.getUserName());
                dict.put("name", user.getName());
                dict.put("company", user.getCompany());
                dict.put("email", user.getEmail());
                dict.put("department", user.getDepartment());
            }
        }
        else {
            dict.put("Status", false);
        }
        return dict;
    }

    @Override
    public Dictionary<String, Object> checkUserName(String userName) {
        Dictionary<String, Object> dict = new Hashtable<>();
        long num = 0;

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);

        try {
            num = userMapper.countByExample(userExample);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(num <= 0)
            dict.put("Status", true);
        else
            dict.put("Status", false);
        return dict;
    }

    @Override
    public Dictionary<String, Object> UserRegister(User user) {
        Dictionary<String, Object> dict = new Hashtable<>();

        if (user.getUserName() != null
                && user.getPassword() != null
                && user.getName() != null
                && user.getCompany() != null
                && user.getEmail() != null
                && isUserNameExist(user.getUserName()) == false)
        {
            userMapper.insert(user);
            dict.put("Status", true);
        } else {
            dict.put("Status", false);
        }

        return dict;
    }



    @Override
    public Boolean changePassword(Integer userID, String oldpw, String newpw) {
        User user = userMapper.selectByPrimaryKey(userID);
        if(!user.getPassword().equals(oldpw))
            return false;
        user.setPassword(newpw);
        return true;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public List<User> selectByName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria cri = userExample.createCriteria();

        cri.andNameEqualTo(name);

        try {
            return userMapper.selectByExample(userExample);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean deleteByUserName(String userName) {
        UserExample userExample = new UserExample();
        UserExample.Criteria cri = userExample.createCriteria();

        cri.andUserNameEqualTo(userName);

        try {
            userMapper.deleteByExample(userExample);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> selectByExample(UserExample userExample) {
        return userMapper.selectByExample(userExample);
    }

    @Override
    public Boolean isUserNameExist(String userName) {
        /*User user = userMapper.selectByUserName(userName);
        if(user == null)
            return false;
        else
            return true;*/
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        long num = userMapper.countByExample(userExample);
        if(num <= 0)
            return false;
        else
            return true;
    }
}
