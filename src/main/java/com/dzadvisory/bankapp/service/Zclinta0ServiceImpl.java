package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zclinta0Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class Zclinta0ServiceImpl implements Zclinta0Service{

    private Zclinta0Dao zclinta0Dao;

    private List<Object> listOfColumnsAndData = new ArrayList<>();

    @Value("#{${client.contacts.columns}}")
    private List<String> listOfColumns;


    @Autowired
    public Zclinta0ServiceImpl(Zclinta0Dao zclinta0Dao) {
        this.zclinta0Dao = zclinta0Dao;
    }



    @Override
    @Transactional
    // Méthode permettant de retourner les contacts d'un client selon le numéro de client
    public List<Object> getClientContactsById(int clientId) {

        listOfColumnsAndData.clear();
        listOfColumnsAndData.add(listOfColumns);
        listOfColumnsAndData.addAll(zclinta0Dao.getClientContactsById(clientId));

        return listOfColumnsAndData;
    }
}
