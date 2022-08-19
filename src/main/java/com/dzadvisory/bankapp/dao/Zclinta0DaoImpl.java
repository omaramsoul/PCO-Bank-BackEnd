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
    // Implémentation de la méthode retournant les contacts du client
    public List<Zclinta0> getClientContactsById(@PathVariable int clientId) {

        Session currentSession = entityManager.unwrap(Session.class);
        // Injecter la requête "query" dans currentSession
        Query<Zclinta0> theQuery = currentSession.createQuery(query);
        // set.parameter(name="variable dans la requête", variable de la méthode) vous permet d'associer la variable
        // clientId définie dans l'argument de la méthode avec la variable clientId définie dans la requête
        theQuery.setParameter("clientId", clientId);
        // les résultats vont être stockées dans la variable "clientContacts"
        List<Zclinta0> clientContacts = theQuery.getResultList();

        return clientContacts;
    }


}
