package com.mtr.service.Impl;

import com.mtr.dao.UserMapper;
import com.mtr.model.User;
import com.mtr.model.UserExample;
import com.mtr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Boolean UserLogin(String userName, String password) {
        User user = userMapper.selectByUserName(userName);
        if (user != null)
            if (user.getPassword().equals(password))
                return true;
        return false;
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

    @Override
    public Boolean UserRegister(User user) {
        if (user.getUserName() != null
                && user.getPassword() != null
                && user.getName() != null
                && user.getCompany() != null
                && user.getEmail() != null
                && isUserNameExist(user.getUserName()) == false)
        {
            userMapper.insert(user);
            return true;
        }

        return false;
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
    public List<User> selectByExample(UserExample userExample) {
        return userMapper.selectByExample(userExample);
    }
}
