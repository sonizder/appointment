package com.controller;

import com.model.Appointment;
import com.model.SearchModel;
import com.service.AddressService;
import com.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by soner.ustel on 01/05/2017.
 */

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/town", method = RequestMethod.GET)
    public @ResponseBody List<String> getTown(@RequestParam(value = "city") String city){
        return addressService.getTown(city);
    }

    @RequestMapping(value = "/district", method = RequestMethod.GET)
    public @ResponseBody List<String> getDistrict(@RequestParam(value = "city") String city, @RequestParam(value = "town") String town){
        return addressService.getDistrict(city, town);
    }

}
