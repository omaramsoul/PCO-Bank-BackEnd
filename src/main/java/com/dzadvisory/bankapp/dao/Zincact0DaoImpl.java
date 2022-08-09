package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zincact0;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Zincact0DaoImpl implements Zincact0Dao{

    private EntityManager entityManager;

    @Value("${client.impayes.query}")
    private String query;


    @Autowired
    public Zincact0DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Zincact0> getClientImpayes(@PathVariable String clientId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zincact0> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientId", clientId);
        List<Zincact0> clientImpayes = theQuery.getResultList();

        return clientImpayes;
    }
}
