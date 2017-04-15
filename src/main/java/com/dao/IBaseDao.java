package com.dao;

import com.model.IModel;

import java.util.List;

/**
 * Created by soner.ustel on 08/04/2017.
 */
public interface IBaseDao {

    void save(IModel model);
    List<? extends IModel> getAll();
    IModel getUniqueValue(String queryName, String paramName, String paramValue);
}
