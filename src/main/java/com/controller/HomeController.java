package com.controller;

import com.component.AuthenticationHelper;
import com.model.Appointment;
import com.model.SearchModel;
import com.model.Sector;
import com.service.AddressService;
import com.service.AppointmentService;
import com.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;

/**
 * Created by soner.ustel on 19/03/2017.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private AuthenticationHelper authenticationHelper;

    @Autowired
    private AddressService addressService;

    @Autowired
    private SectorService sectorService;

    @Autowired
    private AppointmentService appointmentService;


//    @RequestMapping(value = "/searchAppointment/{searchValue}",method = RequestMethod.GET)
//    public ModelAndView search(@PathVariable("searchValue") String searchValue){
//        ModelAndView modelAndView = new ModelAndView("home");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/deneme", method = RequestMethod.GET)
//    public ModelAndView searchDeneme(){
//        ModelAndView modelAndView = new ModelAndView("home");
//        return modelAndView;
//    }

//    @ModelAttribute("sectorList")
//    public List<Sector> retrieveSector(){
//        return sectorService.getSectorList();
//    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(@ModelAttribute("searchModel") SearchModel searchModel){

        ModelAndView mav = new ModelAndView("home");
        mav.addObject("isLogin", authenticationHelper.isUserLogin());
        mav.addObject("cityList", addressService.getCity());

        List<Sector> sectorList = sectorService.getSectorList();
        mav.addObject("sectorList", sectorList);

//        List<Appointment> appointmentList = appointmentService.getAppointmentList();
        List<Appointment> appointmentList = appointmentService.searchAppointment(searchModel);
        mav.addObject("appointmentList", appointmentList);

        mav.addObject("searchModel", searchModel);

        return mav;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView searchAppointment(@ModelAttribute("searchModel") SearchModel searchModel, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("searchModel", searchModel);
        return new ModelAndView("redirect:home");
    }

}
