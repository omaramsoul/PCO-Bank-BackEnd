package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Client;
import com.dzadvisory.bankapp.entity.ClientContact;

import java.util.List;

public interface ClientDao {

    public List<Client> getAllClients();

    public Client getClientByID(int theClientId);

    public List<ClientContact> getAllContacts();

}
