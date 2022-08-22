package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zcptslj0;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Zcptslj0DaoImpl implements Zcptslj0Dao {

    private EntityManager entityManager;

    @Value("${client.soldes.query}")
    private String query;

    @Autowired
    public Zcptslj0DaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    // methode qui retourne le solde du client (carte de type graphe)
    public List<Zcptslj0> getClientSolde(@PathVariable String clientCompte) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zcptslj0> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientCompte", clientCompte);
        List<Zcptslj0> clientSolde = theQuery.getResultList();

        return clientSolde;
    }

}
