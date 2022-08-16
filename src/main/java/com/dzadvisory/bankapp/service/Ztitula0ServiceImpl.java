package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Ztitula0Dao;
import com.dzadvisory.bankapp.entity.Ztitula0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class Ztitula0ServiceImpl implements Ztitula0Service{

    private Ztitula0Dao ztitula0Dao;
    private List<Object> listOfColumnsAndData = new ArrayList<>();

    @Value("#{${client.comptes.columns}}")
    private List<String> listOfColumns;


    @Autowired
    public Ztitula0ServiceImpl(Ztitula0Dao ztitula0Dao) {
        this.ztitula0Dao = ztitula0Dao;
    }


    @Override
    @Transactional
    public List<Object> getClientComptes(String clientId) {
        listOfColumnsAndData.clear();
        listOfColumnsAndData.add(listOfColumns);
        listOfColumnsAndData.addAll(ztitula0Dao.getClientComptes(clientId));
        return listOfColumnsAndData;
    }
}
