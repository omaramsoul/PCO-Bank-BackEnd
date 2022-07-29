package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.ClientDao;
import com.dzadvisory.bankapp.entity.Client;
import com.dzadvisory.bankapp.entity.ClientContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private ClientDao clientDao;

    @Autowired
    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    @Transactional
    public List<Client> getAllClients() {
        return clientDao.getAllClients();
    }


    @Override
    @Transactional
    public Client getClientByID(int theClientID) {
        return clientDao.getClientByID(theClientID);
    }

    @Override
    @Transactional
    public List<ClientContact> getAllContacts() {
        return clientDao.getAllContacts();
    }

}
