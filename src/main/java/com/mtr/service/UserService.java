package com.mtr.service;

import com.mtr.model.User;
import com.mtr.model.UserExample;

import java.util.List;

/**
 * Created by Scarb's Surface on 11/22/2016.
 */
public interface UserService {
    User selectUserById(Integer userId);

    List<User> selectByExample(UserExample userExample);

    Boolean UserLogin(String userName, String password);

    Boolean isUserNameExist(String userName);

    Boolean UserRegister(User user);

    Boolean changePassword(Integer userID, String oldpw, String newpw);
}
