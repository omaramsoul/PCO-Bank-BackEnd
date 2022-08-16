package com.dzadvisory.bankapp.dao;

import com.dzadvisory.bankapp.entity.Zcliena0;
import com.dzadvisory.bankapp.entity.Zclinta0;

import java.util.List;
import java.util.Optional;

public interface Zcliena0Dao {

    public List<Zcliena0> getAllClients();

    public List<Zcliena0> getClientByID(int theClientId);

    public List<Zcliena0> searchClientById(int clientId);

}
