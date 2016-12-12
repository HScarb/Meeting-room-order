package com.mtr.service;

import com.mtr.model.User;
import com.mtr.model.UserExample;

import java.util.Dictionary;
import java.util.List;

/**
 * Created by Scarb's Surface on 11/22/2016.
 */
public interface UserService {
    User selectUserById(Integer userId);

    List<User> selectByExample(UserExample userExample);

    Boolean isUserNameExist(String userName);

    Dictionary<String, Object> UserLogin(String userName, String password);

    Dictionary<String, Object> checkUserName(String userName);

    Dictionary<String, Object> UserRegister(User user);

    Boolean changePassword(Integer userID, String oldpw, String newpw);

    List<User> selectAll();

    List<User> selectByName(String name);

    Boolean deleteByUserName(String userName);
}
