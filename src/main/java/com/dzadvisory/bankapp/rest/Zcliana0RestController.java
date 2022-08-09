package com.dzadvisory.bankapp.rest;

import com.dzadvisory.bankapp.entity.*;
import com.dzadvisory.bankapp.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Zcliana0RestController {

    private Zcliena0Service zcliena0service;
    private Zclinta0Service zclinta0Service;
    private Zautsy10Service zautsy10Service;
    private Zincact0Service zincact0Service;
    private Ztitula0Service ztitula0Service;

    public Zcliana0RestController(Zcliena0Service zcliena0service,
                                  Zclinta0Service zclinta0Service,
                                  Zautsy10Service zautsy10Service,
                                  Zincact0Service zincact0Service,
                                  Ztitula0Service ztitula0Service) {
        this.zcliena0service = zcliena0service;
        this.zclinta0Service = zclinta0Service;
        this.zautsy10Service = zautsy10Service;
        this.zincact0Service = zincact0Service;
        this.ztitula0Service = ztitula0Service;
    }


    @GetMapping("/clients")
    public List<Zcliena0> getAllClients() {
        return zcliena0service.getAllClients();
    }


    //  ------- Client Informations API -------
    @GetMapping("/client/{theClientID}/info")
    public List<Zcliena0> getClientByID(@PathVariable int theClientID) {
        return zcliena0service.getClientByID(theClientID);
    }

    @GetMapping("/contacts")
    public List<Zclinta0> getAllContacts() {
        return zcliena0service.getAllContacts();
    }


    //  ------- Client Contacts API -------
    @GetMapping("/client/{clientId}/contacts")
    public List<Zclinta0> getClientContactById(@PathVariable int clientId) {
        return zclinta0Service.getClientContactsById(clientId);
    }


    //  ------- Client Aurizations API -------
    @GetMapping("/client/{clientId}/autorisations")
    public List<Zautsy10> getClientAutorization(@PathVariable String clientId) {
        return zautsy10Service.getClientAutorization(clientId);
    }


    //  ------- Client Impayes API -------
    @GetMapping("/client/{clientId}/impayes")
    public List<Zincact0> getClientImpayes(@PathVariable String clientId) {
        return zincact0Service.getClientImpayes(clientId);
    }


    //  ------- Client Comptes API -------
    @GetMapping("/client/{clientId}/comptes")
    public List<Ztitula0> getClientComptes(@PathVariable String clientId) {
        return ztitula0Service.getClientComptes(clientId);
    }


}
