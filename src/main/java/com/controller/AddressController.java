package com.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.model.Views;
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

    @JsonView(Views.Public.class)
    @RequestMapping(value = "/town", method = RequestMethod.GET)
    public @ResponseBody List<String> getTown(@RequestParam(value = "city") String city){
        List<String> townList = new ArrayList<>();
        townList.add("test");
        townList.add("test2");
        townList.add("test3");
        return townList;
    }

    @JsonView(Views.Public.class)
    @RequestMapping(value = "/district", method = RequestMethod.GET)
    public @ResponseBody List<String> getDistrict(@RequestParam(value = "town") String town){
        List<String> districtList = new ArrayList<>();
        districtList.add("test3");
        districtList.add("test4");
        districtList.add("test5");
        return districtList;
    }
}
