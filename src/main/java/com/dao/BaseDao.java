package com.dao;

import com.model.IModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by soner.ustel on 08/04/2017.
 */
@Repository
public class BaseDao<T extends IModel> implements IBaseDao {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void save(IModel model){
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(model);
        transaction.commit();
    }

    @Transactional
    public List<IModel> getAll(){
        Session session = getCurrentSession();
        session.beginTransaction();
        return session.createCriteria(IModel.class).list();
    }

    @Transactional
    public IModel getUniqueValue(String queryName, String paramName, String paramValue){
        Session session = getCurrentSession();
        session.beginTransaction();
        Query query = session.getNamedQuery(queryName);
        query.setString(paramName, paramValue);
        return (IModel)query.uniqueResult();

    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
