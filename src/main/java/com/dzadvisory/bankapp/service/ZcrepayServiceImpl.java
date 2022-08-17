package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zcrepay0Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ZcrepayServiceImpl implements Zcrepay0Service{

    private Zcrepay0Dao zcrepay0Dao;

    @Autowired
    public ZcrepayServiceImpl(Zcrepay0Dao zcrepay0Dao) {
        this.zcrepay0Dao = zcrepay0Dao;
    }

    @Override
    @Transactional
    public List<Object> getClientCredits(int clientId) {
        return zcrepay0Dao.getClientCredits(clientId);
    }

}
