package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zcliena0;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class Zcliena0DaoImpl implements Zcliena0Dao {

    private EntityManager entityManager;

    @Value("${client.informations.query}")
    private String query;

    @Value("${client.search.query}")
    private String searchQuery;

    @Autowired
    public Zcliena0DaoImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    // Implémentation de la méthode retournant tous les clients
    public List<Zcliena0> getAllClients() {

        Session currentSession = entityManager.unwrap(Session.class);
        // Dans ce cas la requête est définie dans la méthode createQuery()
        // "from Zcliena0" <=> "select * from Zcliena0"
        Query<Zcliena0> theQuery = currentSession.createQuery("from Zcliena0", Zcliena0.class);
        List<Zcliena0> clients = theQuery.getResultList();

        return clients;
    }

    @Override
    // Implémentation de la méthode retournant un seul client selon son ID
    public List<Zcliena0> getClientByID(@PathVariable int theClientID) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zcliena0> theQuery = currentSession.createQuery(query);
        theQuery.setParameter("clientId", theClientID);
        List<Zcliena0> clientInfos = theQuery.getResultList();

        return clientInfos;
    }

    @Override
    // Implémentation de la méthode retournant le résultat de la recherche d'un client
    public List<Zcliena0> searchClientById(@PathVariable int clientId) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Zcliena0> theQuery = currentSession.createQuery(searchQuery);
        theQuery.setParameter("clientId", clientId);
        List<Zcliena0> searchResult = theQuery.getResultList();

        return searchResult;
    }

}
