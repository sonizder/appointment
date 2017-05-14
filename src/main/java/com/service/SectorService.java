package com.service;

import com.dao.IBaseDao;
import com.model.Sector;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by soner.ustel on 13/05/2017.
 */
@Service
public class SectorService {

    @Autowired
    private IBaseDao baseDao;

    public List<Sector> getSectorList(){
        return (List<Sector>)baseDao.getAll(Sector.class);
    }
}
