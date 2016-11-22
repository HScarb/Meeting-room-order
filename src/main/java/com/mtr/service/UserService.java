package com.mtr.service;

import com.mtr.model.User;

/**
 * Created by Scarb's Surface on 11/22/2016.
 */
public interface UserService {
    User selectUserById(Integer userId);
}
