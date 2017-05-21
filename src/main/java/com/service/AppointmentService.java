package com.service;

import com.dao.IBaseDao;
import com.model.Appointment;
import com.model.SearchModel;
import com.model.Sector;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by soner.ustel on 13/05/2017.
 */
@Service
public class AppointmentService {

    @Autowired
    private IBaseDao baseDao;

    public List<Appointment> getAppointmentList(){
        return (List<Appointment>)baseDao.getAll(Appointment.class);
    }

    public List<Appointment> searchAppointment(SearchModel searchModel){
        return baseDao.getList(Appointment.class, searchModel.getParams());
    }

}
