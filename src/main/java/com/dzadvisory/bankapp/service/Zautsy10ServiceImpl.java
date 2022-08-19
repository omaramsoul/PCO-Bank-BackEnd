package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zautsy10Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class Zautsy10ServiceImpl implements Zautsy10Service{

    private Zautsy10Dao zautsy10Dao;

    // listOfColumnsAndData nous permet de stocker les données avec leurs colonnes
    private List<Object> listOfColumnsAndData = new ArrayList<>();

    // Initialisation du variable listOfColumns par les titres des colonnes à afficher
    // les colonnes doivent être déclarés dans applications.properties
    @Value("#{${client.autorisations.columns}}")
    private List<String> listOfColumns;


    @Autowired
    // Injection de l'interface Zautsy10Dao dans le constructeur
    public Zautsy10ServiceImpl(Zautsy10Dao zautsy10Dao) {
        this.zautsy10Dao = zautsy10Dao;
    }


    @Override
    @Transactional
    // Méthode permettant de retourner les autorisations d'un client selon le numéro de client
    public List<Object> getClientAutorization(String clientId) {

        // listOfColumnsAndData doit être vide pour stocker de nouvelles données
        listOfColumnsAndData.clear();
        // ajouter la liste des colonnes dans listOfColumnsAndData (indice 0)
        listOfColumnsAndData.add(listOfColumns);
        // ajouter la liste des résultats dans listOfColumnsAndData
        listOfColumnsAndData.addAll(zautsy10Dao.getClientAutorization(clientId));

        return listOfColumnsAndData;
    }
}
