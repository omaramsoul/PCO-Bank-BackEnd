package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zincact0Dao;
import com.dzadvisory.bankapp.entity.Zincact0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class Zincact0ServiceImpl implements Zincact0Service{

    private Zincact0Dao zincact0Dao;
    private List<Object> listOfColumnsAndData = new ArrayList<>();

    @Value("#{${client.impayes.columns}}")
    private List<String> listOfColumns;

    @Autowired
    public Zincact0ServiceImpl(Zincact0Dao zincact0Dao) {
        this.zincact0Dao = zincact0Dao;
    }

    @Override
    @Transactional
    public List<Object> getClientImpayes(String clientId) {
        listOfColumnsAndData.clear();
        listOfColumnsAndData.add(listOfColumns);
        listOfColumnsAndData.addAll(zincact0Dao.getClientImpayes(clientId));
        return listOfColumnsAndData;
    }
}
