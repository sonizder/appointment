package com.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.model.Views;
import com.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by soner.ustel on 01/05/2017.
 */

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @JsonView(Views.Public.class)
    @RequestMapping(value = "/town", method = RequestMethod.GET)
    public @ResponseBody List<String> getTown(@RequestParam(value = "city") String city){
        return addressService.getTown(city);
    }

    @JsonView(Views.Public.class)
    @RequestMapping(value = "/district", method = RequestMethod.GET)
    public @ResponseBody List<String> getDistrict(@RequestParam(value = "city") String city, @RequestParam(value = "town") String town){
        return addressService.getDistrict(city, town);
    }
}
