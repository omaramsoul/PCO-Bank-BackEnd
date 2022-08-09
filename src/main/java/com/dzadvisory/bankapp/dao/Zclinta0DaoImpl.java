package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zclinta0;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Zclinta0DaoImpl implements Zclinta0Dao{

    private EntityManager entityManager;


    @Value("${client.contacts.query}")
    private String query;

    @Autowired
    public Zclinta0DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Zclinta0> getClientContactsById(@PathVariable int clientId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zclinta0> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientId", clientId);
        List<Zclinta0> clientContacts = theQuery.getResultList();

        return clientContacts;
    }


}
