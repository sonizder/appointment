package com.controller;

import com.component.AuthenticationHelper;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by soner.ustel on 19/03/2017.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private AuthenticationHelper authenticationHelper;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("isLogin", authenticationHelper.isUserLogin());
        List<String> cityList =  new ArrayList<>();
        cityList.add("İstanbul");
        cityList.add("Ankara");
        cityList.add("Samsun");

        mav.addObject("cityList", cityList);

        List<String> townList =  new ArrayList<>();
        townList.add("Kadıköy");
        townList.add("Beşiktaş");
        townList.add("Taksim");

        mav.addObject("townList", townList);
        return mav;
    }

}
