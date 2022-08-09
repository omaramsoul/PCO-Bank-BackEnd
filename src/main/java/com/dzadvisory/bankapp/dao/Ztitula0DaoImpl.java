package com.dzadvisory.bankapp.dao;


import com.dzadvisory.bankapp.entity.Ztitula0;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Ztitula0DaoImpl implements Ztitula0Dao{

    private EntityManager entityManager;

    @Value("${client.comptes.query}")
    private String query;

    @Autowired
    public Ztitula0DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Ztitula0> getClientComptes(@PathVariable String clientId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Ztitula0> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientId", clientId);
        List<Ztitula0> clientComptes = theQuery.getResultList();

        return clientComptes;
    }
}
