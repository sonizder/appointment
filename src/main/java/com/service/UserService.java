package com.service;


import com.dao.IBaseDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by soner.ustel on 02/04/2017.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    IBaseDao baseDao;

    public User authenticateUser(User user) {

        user.setPassword(String.valueOf(user.getEmail().hashCode()));
        user.setEmail(user.getEmail()+user.getEmail());
        user.setJob(user.getEmail()+user.getPassword());
        user.setRole("dede");
//        saveUser(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>)baseDao.getAll(User.class);
    }

    @Override
    public User getWithEmail(String email) {
        return (User)baseDao.getUniqueValue("GET_USERS_BY_EMAIL","email",email);
    }

    private void saveUser(User user) {
        baseDao.save(user);
    }
}
