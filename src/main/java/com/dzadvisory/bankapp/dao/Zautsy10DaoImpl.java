package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zautsy10;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Zautsy10DaoImpl implements Zautsy10Dao{

    private EntityManager entityManager;

    @Value("${client.autorisation.query}")
    private String query;

    @Autowired
    public Zautsy10DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Zautsy10> getClientAutorization(@PathVariable String clientId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zautsy10> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientId", clientId);
        List<Zautsy10> clientAutorization = theQuery.getResultList();

        return clientAutorization;
    }
}
