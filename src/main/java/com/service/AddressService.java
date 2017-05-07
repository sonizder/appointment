package com.service;

import com.dao.IBaseDao;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.util.object.StringUtils.*;

/**
 * Created by soner.ustel on 07/05/2017.
 */

@Service
public class AddressService {

    @Autowired
    IBaseDao baseDao;

    public List<String> getCity(){
        return ( List<String>)baseDao.getList("GET_CITY", new HashMap<>(1));
    }

    public List<String> getTown(String city){

        if(isEmpty(city)){
            return null;
        }

        Map<String, String> params = new HashMap<>(1);
        params.put("city", city);
        return ( List<String>)baseDao.getList("GET_TOWN", params);
    }

    public List<String> getDistrict(String city, String town){

        if(isEmpty(city) || isEmpty(town)){
            return null;
        }

        Map<String, String> params = new HashMap<>(2);
        params.put("city", city);
        params.put("town", town);
        return  ( List<String>)baseDao.getList("GET_DISTRICT", params);
    }
}
