package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zincact0Dao;
import com.dzadvisory.bankapp.entity.Zincact0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Zincact0ServiceImpl implements Zincact0Service{

    private Zincact0Dao zincact0Dao;

    @Autowired
    public Zincact0ServiceImpl(Zincact0Dao zincact0Dao) {
        this.zincact0Dao = zincact0Dao;
    }

    @Override
    public List<Zincact0> getClientImpayes(String clientId) {
        return zincact0Dao.getClientImpayes(clientId);
    }
}
