package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zcliena0Dao;
import com.dzadvisory.bankapp.entity.Zcliena0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class Zcliena0ServiceImpl implements Zcliena0Service {

    private Zcliena0Dao zcliena0Dao;

    private List<Object> listOfColumnsAndData = new ArrayList<>();

    @Value("#{${client.informations.columns}}")
    private List<String> listOfColumns;

    @Value("#{${client.search.columns}}")
    private List<String> listOfSearchColumns;

    @Autowired
    public Zcliena0ServiceImpl(Zcliena0Dao zcliena0Dao) {
        this.zcliena0Dao = zcliena0Dao;
    }

    @Override
    @Transactional
    // Méthode permettant de retourner la liste de tous les clients avec toutes les colonnes
    public List<Zcliena0> getAllClients() {
        return zcliena0Dao.getAllClients();
    }


    @Override
    @Transactional
    // Méthode permettant de retourner un seul client selon le numéro de client saisi (theClientId)
    public List<Object> getClientByID(int theClientID) {

        listOfColumnsAndData.clear();
        listOfColumnsAndData.add(listOfColumns);
        listOfColumnsAndData.addAll(zcliena0Dao.getClientByID(theClientID));

        return listOfColumnsAndData;
    }


    @Override
    @Transactional
    // Méthode permettant de chercher un client selon le numéro de client (clientId)
    public List<Object> searchClientById(int clientId) {

        listOfColumnsAndData.clear();
        listOfColumnsAndData.add(listOfSearchColumns);
        listOfColumnsAndData.addAll(zcliena0Dao.searchClientById(clientId));

        return listOfColumnsAndData;
    }


}
