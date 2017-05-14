package com.dao;

import com.model.IModel;
import org.hibernate.Criteria;
import org.hibernate.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by soner.ustel on 08/04/2017.
 */
public interface IBaseDao<T extends IModel> {

    void save(T model);

    List<T> getAll(Class<T> clazz);

    T getUniqueValue(String queryName, String paramName, String paramValue);

    List<T> getList(String namedQuery, Map<String, String> params);
}
