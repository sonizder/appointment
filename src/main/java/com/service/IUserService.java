package com.service;


import com.model.User;

import java.util.List;

/**
 * Created by soner.ustel on 26/03/2017.
 */
public interface IUserService {

    User authenticateUser(User user);
    List<User> getAllUsers();
    User getWithEmail(String email);
}
