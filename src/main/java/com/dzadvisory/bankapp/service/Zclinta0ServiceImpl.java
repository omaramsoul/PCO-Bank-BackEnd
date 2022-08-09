package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zclinta0Dao;
import com.dzadvisory.bankapp.entity.Zclinta0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Zclinta0ServiceImpl implements Zclinta0Service{

    private Zclinta0Dao zclinta0Dao;

    @Autowired
    public Zclinta0ServiceImpl(Zclinta0Dao zclinta0Dao) {
        this.zclinta0Dao = zclinta0Dao;
    }


    @Override
    @Transactional
    public List<Zclinta0> getClientContactsById(int clientId) {
        return zclinta0Dao.getClientContactsById(clientId);
    }
}
