package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zcliena0Dao;
import com.dzadvisory.bankapp.entity.Zcliena0;
import com.dzadvisory.bankapp.entity.Zclinta0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Zcliena0ServiceImpl implements Zcliena0Service {

    private Zcliena0Dao Zcliena0Dao;

    @Autowired
    public Zcliena0ServiceImpl(Zcliena0Dao Zcliena0Dao) {
        this.Zcliena0Dao = Zcliena0Dao;
    }

    @Override
    @Transactional
    public List<Zcliena0> getAllClients() {
        return Zcliena0Dao.getAllClients();
    }


    @Override
    @Transactional
    public Zcliena0 getClientByID(int theClientID) {
        return Zcliena0Dao.getClientByID(theClientID);
    }

    @Override
    @Transactional
    public List<Zclinta0> getAllContacts() {
        return Zcliena0Dao.getAllContacts();
    }

}
