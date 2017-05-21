package com.controller;

import com.model.Appointment;
import com.model.SearchModel;
import com.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by soner.ustel on 19/05/2017.
 */
@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private AppointmentService appointmentService;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView searchAppointment(@ModelAttribute("searchModel") SearchModel searchModel){

        List<Appointment> appointmentList = appointmentService.searchAppointment(searchModel);
//        ModelAndView mav = new ModelAndView("redirect:home?appointmentList=" + appointmentList);
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("appointmentList", appointmentList);
        return mav;
    }
}
