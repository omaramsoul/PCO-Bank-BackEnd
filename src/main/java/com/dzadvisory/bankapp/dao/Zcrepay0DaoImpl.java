package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zcrepay0;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Zcrepay0DaoImpl implements Zcrepay0Dao{

    private EntityManager entityManager;

    @Value("${client.credits.query}")
    private String query;

    @Autowired
    public Zcrepay0DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    // Implémentation de la méthode retournant les crédits du client
    public List<Object> getClientCredits(@PathVariable int clientId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Object> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientId", clientId);
        List<Object> clientCredits = theQuery.getResultList();

        return clientCredits;
    }

}
