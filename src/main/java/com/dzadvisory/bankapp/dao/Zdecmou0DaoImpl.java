package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zdecmou0;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Zdecmou0DaoImpl implements Zdecmou0Dao{

    private EntityManager entityManager;

    @Value("${client.mea.query}")
    private String query;

    @Autowired
    public Zdecmou0DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    // Implémentation de la méthode retournant les MEA du client
    public List<Zdecmou0> getClientMEA(@PathVariable String clientCompte) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zdecmou0> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientCompte", clientCompte);
        List<Zdecmou0> clientMEA = theQuery.getResultList();

        return clientMEA;
    }
}
