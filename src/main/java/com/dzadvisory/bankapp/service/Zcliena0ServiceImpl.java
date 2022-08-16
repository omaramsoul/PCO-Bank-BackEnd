package com.dzadvisory.bankapp.service;

import com.dzadvisory.bankapp.dao.Zcliena0Dao;
import com.dzadvisory.bankapp.entity.Zcliena0;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class Zcliena0ServiceImpl implements Zcliena0Service {

    private Zcliena0Dao zcliena0Dao;
    private ModelMapper modelMapper;
    private List<Object> listOfColumnsAndData = new ArrayList<>();

    @Value("#{${client.informations.columns}}")
    private List<String> listOfColumns;

    @Value("#{${client.search.columns}}")
    private List<String> listOfSearchColumns;

    @Autowired
    public Zcliena0ServiceImpl(Zcliena0Dao zcliena0Dao,
                               ModelMapper modelMapper) {
        this.zcliena0Dao = zcliena0Dao;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public List<Zcliena0> getAllClients() {
        return zcliena0Dao.getAllClients();
    }


    @Override
    @Transactional
    public List<Object> getClientByID(int theClientID) {
        listOfColumnsAndData.clear();
        listOfColumnsAndData.add(listOfColumns);
        listOfColumnsAndData.addAll(zcliena0Dao.getClientByID(theClientID));
        return listOfColumnsAndData;
    }

    @Override
    @Transactional
    public List<Object> searchClientById(int clientId) {
        listOfColumnsAndData.clear();
        listOfColumnsAndData.add(listOfSearchColumns);
        listOfColumnsAndData.addAll(zcliena0Dao.searchClientById(clientId));
        return listOfColumnsAndData;
    }


}
