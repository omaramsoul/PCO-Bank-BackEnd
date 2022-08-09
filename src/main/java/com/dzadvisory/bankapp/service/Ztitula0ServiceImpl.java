package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Ztitula0Dao;
import com.dzadvisory.bankapp.entity.Ztitula0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Ztitula0ServiceImpl implements Ztitula0Service{

    private Ztitula0Dao ztitula0Dao;


    @Autowired
    public Ztitula0ServiceImpl(Ztitula0Dao ztitula0Dao) {
        this.ztitula0Dao = ztitula0Dao;
    }


    @Override
    @Transactional
    public List<Ztitula0> getClientComptes(String clientId) {
        return ztitula0Dao.getClientComptes(clientId);
    }
}
