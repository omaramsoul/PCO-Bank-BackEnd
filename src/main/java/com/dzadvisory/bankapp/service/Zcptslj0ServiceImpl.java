package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zcptslj0Dao;
import com.dzadvisory.bankapp.dao.Zcptslj0DaoImpl;
import com.dzadvisory.bankapp.entity.Zcptslj0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Zcptslj0ServiceImpl implements Zcptslj0Service {

    private Zcptslj0Dao zcptslj0Dao;

    private List<Object> listOfColumnsANdData = new ArrayList<>();

    @Value("#{${client.soldes.columns}}")
    private List<String> listOfColumns;

    @Autowired
    public Zcptslj0ServiceImpl(Zcptslj0Dao zcptslj0Dao) {
        this.zcptslj0Dao = zcptslj0Dao;
    }

    @Override
    public List<Object> getClientSolde(String clientCompte) {

        listOfColumnsANdData.clear();
        listOfColumnsANdData.add(listOfColumns);
        listOfColumnsANdData.addAll(zcptslj0Dao.getClientSolde(clientCompte));

        return listOfColumnsANdData;
    }
}
