package com.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by soner.ustel on 22/04/2017.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getPanel(){
        ModelAndView modelAndView =  new ModelAndView("user/admin");
        return modelAndView;
    }
}
