package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Client;
import com.dzadvisory.bankapp.entity.ClientContact;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao{

    private EntityManager entityManager;

    @Autowired
    public ClientDaoImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Client> getAllClients() {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Client> theQuery = currentSession.createQuery("from Client", Client.class);
        List<Client> clients = theQuery.getResultList();

        return clients;
    }

    @Override
    public Client getClientByID(@PathVariable int theClientID) {

        Session currentSession = entityManager.unwrap(Session.class);
        Client theClient = currentSession.get(Client.class, theClientID);

        return theClient;
    }

    @Override
    public List<ClientContact> getAllContacts() {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<ClientContact> theQuery = currentSession.createQuery("from ClientContact", ClientContact.class);
        List<ClientContact> contacts = theQuery.getResultList();

        return contacts;
    }


}
