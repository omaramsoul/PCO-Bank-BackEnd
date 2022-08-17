package com.dzadvisory.bankapp.rest;

import com.dzadvisory.bankapp.entity.*;
import com.dzadvisory.bankapp.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Zcliana0RestController {

    private Zcliena0Service zcliena0service;
    private Zclinta0Service zclinta0Service;
    private Zautsy10Service zautsy10Service;
    private Zincact0Service zincact0Service;
    private Ztitula0Service ztitula0Service;
    private Zdecmou0Service zdecmou0Service;
    private Zcrepay0Service zcrepay0Service;

    public Zcliana0RestController(Zcliena0Service zcliena0service,
                                  Zclinta0Service zclinta0Service,
                                  Zautsy10Service zautsy10Service,
                                  Zincact0Service zincact0Service,
                                  Ztitula0Service ztitula0Service,
                                  Zdecmou0Service zdecmou0Service,
                                  Zcrepay0Service zcrepay0Service) {
        this.zcliena0service = zcliena0service;
        this.zclinta0Service = zclinta0Service;
        this.zautsy10Service = zautsy10Service;
        this.zincact0Service = zincact0Service;
        this.ztitula0Service = ztitula0Service;
        this.zdecmou0Service = zdecmou0Service;
        this.zcrepay0Service = zcrepay0Service;
    }

    @GetMapping("/clients")
    public List<Zcliena0> getAllClients() {
        return zcliena0service.getAllClients();
    }


    //------------------------------ Client Informations API ------------------------------
    @GetMapping("/client/{theClientID}/informations")
    public List<Object> getClientByID(@PathVariable int theClientID) {
        return zcliena0service.getClientByID(theClientID);
    }

    @GetMapping("/client/search/{clientId}")
    public List<Object> searchClientById(@PathVariable int clientId) {
        return zcliena0service.searchClientById(clientId);
    }


    //------------------------------ Client Contacts API ------------------------------
    @GetMapping("/client/{clientId}/contacts")
    public List<Object> getClientContactById(@PathVariable int clientId) {
        return zclinta0Service.getClientContactsById(clientId);
    }


    //------------------------------ Client Aurizations API ------------------------------
    @GetMapping("/client/{clientId}/autorisations")
    public List<Object> getClientAutorization(@PathVariable String clientId) {
        return zautsy10Service.getClientAutorization(clientId);
    }


    //------------------------------ Client Impayes API ------------------------------
    @GetMapping("/client/{clientId}/impayes")
    public List<Object> getClientImpayes(@PathVariable String clientId) {
        return zincact0Service.getClientImpayes(clientId);
    }


    //------------------------------ Client Comptes API ------------------------------
    @GetMapping("/client/{clientId}/comptes")
    public List<Object> getClientComptes(@PathVariable String clientId) {
        return ztitula0Service.getClientComptes(clientId);
    }


    //------------------------------ Client MEA API ------------------------------
    @GetMapping("/client/{clientId}/mea")
    public List<Object> getClientMEA(@PathVariable String clientId) {
        return zdecmou0Service.getClientMEA(clientId);
    }


    //------------------------------ Client Credits API ------------------------------
    @GetMapping("/client/{clientId}/credits")
    public List<Object> getClientCredits(@PathVariable int clientId) {
        return zcrepay0Service.getClientCredits(clientId);
    }



}
