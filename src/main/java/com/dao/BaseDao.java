package com.dao;

import com.model.IModel;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by soner.ustel on 08/04/2017.
 */
@Repository
public class BaseDao<T extends IModel> implements IBaseDao<T> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void save(T model){
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(model);
        transaction.commit();
    }

    @Transactional
    public List<T> getAll(Class<T> clazz){
        Session session = getCurrentSession();
        session.beginTransaction();
        return session.createCriteria(clazz).list();
    }

    @Transactional
    public T getUniqueValue(String queryName, String paramName, String paramValue){
        Session session = getCurrentSession();
        session.beginTransaction();
        Query query = session.getNamedQuery(queryName);
        query.setString(paramName, paramValue);
        return (T)query.uniqueResult();

    }


    @Transactional
    public List<T> getList(String namedQuery, Map<String, String> params){

        Session session = null;
        List<T> list = new ArrayList();
        try {
            session = getCurrentSession();
            session.beginTransaction();
            Query query = session.getNamedQuery(namedQuery);
            params.forEach((key, value) -> {
                System.out.println(key+" : "+value);
                query.setString(key, value);
            });

            list = (List<T>) query.list();
        }catch (Exception e){
            //TODO logging
            e.printStackTrace();
        }finally {
            if(session != null && session.isOpen()){
                session.close();
            }
        }

        return list;
    }


    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
