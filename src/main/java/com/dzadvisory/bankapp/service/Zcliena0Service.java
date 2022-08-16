package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.entity.Zcliena0;
import com.dzadvisory.bankapp.entity.Zclinta0;

import java.util.List;
import java.util.Optional;

public interface Zcliena0Service {

    public List<Zcliena0> getAllClients();

    public List<Object> getClientByID(int theClientId);

    public List<Object> searchClientById(int clientId);

}
