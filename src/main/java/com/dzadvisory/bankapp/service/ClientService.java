package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.entity.Client;
import com.dzadvisory.bankapp.entity.ClientContact;

import java.util.List;

public interface ClientService {

    public List<Client> getAllClients();

    public Client getClientByID(int theClientId);

    public List<ClientContact> getAllContacts();

}
