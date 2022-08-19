package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zcrepay0Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ZcrepayServiceImpl implements Zcrepay0Service{

    private Zcrepay0Dao zcrepay0Dao;

    private List<Object> listOfColumnAndData = new ArrayList<>();

    @Value("#{${client.credits.columns}}")
    private List<String> listOfColumns;

    @Autowired
    public ZcrepayServiceImpl(Zcrepay0Dao zcrepay0Dao) {
        this.zcrepay0Dao = zcrepay0Dao;
    }

    @Override
    @Transactional
    // Méthode permettant de retourner les crédits d'un client selon le numéro de client
    public List<Object> getClientCredits(int clientId) {

        listOfColumnAndData.clear();
        listOfColumnAndData.add(listOfColumns);
        listOfColumnAndData.addAll(zcrepay0Dao.getClientCredits(clientId));

        return listOfColumnAndData;
    }

}
