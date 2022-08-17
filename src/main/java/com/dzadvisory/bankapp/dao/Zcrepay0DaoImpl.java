package com.dzadvisory.bankapp.dao;

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
    private List<Object> listOfColumnAndData = new ArrayList<>();

    @Value("#{${client.credits.columns}}")
    private List<String> listOfColumns;

    @Value("${client.credits.query}")
    private String query;

    @Autowired
    public Zcrepay0DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Object> getClientCredits(@PathVariable int clientId) {

        listOfColumnAndData.clear();
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Object> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientId", clientId);
        listOfColumnAndData.add(listOfColumns);
        listOfColumnAndData.addAll(theQuery.getResultList());

        return listOfColumnAndData;
    }

}
