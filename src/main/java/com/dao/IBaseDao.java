package com.dao;

import com.model.IModel;
import org.hibernate.Criteria;
import org.hibernate.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by soner.ustel on 08/04/2017.
 */
public interface IBaseDao {

    void save(IModel model);

    List<? extends IModel> getAll();

    IModel getUniqueValue(String queryName, String paramName, String paramValue);

    List getList(String namedQuery, Map<String, String> params);
}
