package com.service;

import com.dao.IBaseDao;
import com.model.Appointment;
import com.model.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
