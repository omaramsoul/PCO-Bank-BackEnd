package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.entity.Zcliena0;
import com.dzadvisory.bankapp.entity.Zclinta0;

import java.util.List;

public interface Zcliena0Service {

    public List<Zcliena0> getAllClients();

    public Zcliena0 getClientByID(int theClientId);

    public List<Zclinta0> getAllContacts();

}
