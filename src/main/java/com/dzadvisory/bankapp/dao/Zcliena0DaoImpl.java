package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zcliena0;
import com.dzadvisory.bankapp.entity.Zclinta0;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Zcliena0DaoImpl implements Zcliena0Dao {

    private EntityManager entityManager;

    @Autowired
    public Zcliena0DaoImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Zcliena0> getAllClients() {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zcliena0> theQuery = currentSession.createQuery("from Zcliena0", Zcliena0.class);
        List<Zcliena0> Zcliena0s = theQuery.getResultList();

        return Zcliena0s;
    }

    @Override
    public Zcliena0 getClientByID(@PathVariable int theClientID) {

        Session currentSession = entityManager.unwrap(Session.class);
        Zcliena0 theZcliena0 = currentSession.get(Zcliena0.class, theClientID);

        return theZcliena0;
    }

    @Override
    public List<Zclinta0> getAllContacts() {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zclinta0> theQuery = currentSession.createQuery("from Zclinta0", Zclinta0.class);
        List<Zclinta0> contacts = theQuery.getResultList();

        return contacts;
    }


}