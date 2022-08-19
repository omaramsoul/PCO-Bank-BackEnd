package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zdecmou0Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class Zdecmou0ServiceImpl implements Zdecmou0Service{

    private Zdecmou0Dao zdecmou0Dao;

    private List<Object> listOfColumnsAndData = new ArrayList<>();

    @Value("#{${client.mea.columns}}")
    private List<String> listOfColumns;

    @Autowired
    public Zdecmou0ServiceImpl(Zdecmou0Dao zdecmou0Dao) {
        this.zdecmou0Dao = zdecmou0Dao;
    }

    @Override
    @Transactional
    // Méthode permettant de retourner les MEA d'un client selon le numéro de client
    public List<Object> getClientMEA(String clientCompte) {

        listOfColumnsAndData.clear();
        listOfColumnsAndData.add(listOfColumns);
        listOfColumnsAndData.addAll(zdecmou0Dao.getClientMEA(clientCompte));

        return listOfColumnsAndData;
    }

}
