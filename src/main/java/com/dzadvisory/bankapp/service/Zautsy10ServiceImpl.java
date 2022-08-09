package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zautsy10Dao;
import com.dzadvisory.bankapp.entity.Zautsy10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Zautsy10ServiceImpl implements Zautsy10Service{

    private Zautsy10Dao zautsy10Dao;

    @Autowired
    public Zautsy10ServiceImpl(Zautsy10Dao zautsy10Dao) {
        this.zautsy10Dao = zautsy10Dao;
    }


    @Override
    @Transactional
    public List<Zautsy10> getClientAutorization(String clientId) {
        return zautsy10Dao.getClientAutorization(clientId);
    }
}
