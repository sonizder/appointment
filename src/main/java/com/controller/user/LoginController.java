package com.controller.user;

import com.model.User;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by soner.ustel on 25/03/2017.
 */

@Controller
@RequestMapping("/user")
public class LoginController {


    @Autowired
    IUserService userService;

    @RequestMapping(path="/login", method = RequestMethod.GET)
    public ModelAndView login(){
        User user = new User();
        ModelAndView mav = new ModelAndView("user/login");
        mav.addObject("loginForm", user);
        return mav;
    }


    @RequestMapping(path="/login", method = RequestMethod.POST)
    public ModelAndView validate(@ModelAttribute("loginForm") User user){
        ModelAndView mav = new ModelAndView("user/admin");
        return mav;
    }

    @RequestMapping(path="/logout", method = RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null){
            new SecurityContextLogoutHandler().logout(request, response, authentication);
        }
        return new ModelAndView("redirect:/home");
    }

    @RequestMapping(path = "/denied", method = RequestMethod.GET)
    public ModelAndView denied(){
        return new ModelAndView("404");
    }

}
