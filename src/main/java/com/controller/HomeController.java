package com.controller;

import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by soner.ustel on 19/03/2017.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home");
        User user = new User();
        mav.addObject("loginForm", user);
        return mav;
    }
}
