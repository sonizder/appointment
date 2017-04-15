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

        user.setPassword(String.valueOf(user.getName().hashCode()));
        user.setEmail(user.getName()+user.getLastName());
        user.setJob(user.getLastName()+user.getName());
        saveUser(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>)baseDao.getAll();
    }

    @Override
    public User getWithEmail(String email) {
        return (User)baseDao.getUniqueValue("GET_USERS_BY_EMAIL","email",email);
    }

    private void saveUser(User user) {
        baseDao.save(user);
    }
}
