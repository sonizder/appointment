package com.controller;

import com.model.User;
import com.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by soner.ustel on 25/03/2017.
 */

@Controller
@RequestMapping("/login")
public class UserController {


    @Autowired
    IUserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login(){
        User user = new User();
        ModelAndView mav = new ModelAndView("user/login");
        mav.addObject("loginForm", user);
        return mav;
    }


    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView validate(@ModelAttribute("loginForm") User user){
        ModelAndView mav = new ModelAndView("user/loginSuccess");
        mav.addObject("isValidate", true);

        User authenticateUser = userService.authenticateUser(user);
        authenticateUser.setJob("Dr");
        return mav;
    }

    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public ModelAndView getAllUsers(){
        ModelAndView mav = new ModelAndView("user/allUser");
        User user = userService.getAllUsers().get(0);
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping(value = "/searchUser", method = RequestMethod.POST)
    public ModelAndView getAllUsers(@ModelAttribute("login") User user){
        ModelAndView mav = new ModelAndView("user/userResult");
        user = userService.getWithEmail(user.getEmail());
        mav.addObject("user", user);
        return mav;
    }
}
