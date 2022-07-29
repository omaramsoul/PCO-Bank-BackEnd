package com.dzadvisory.bankapp.rest;

import com.dzadvisory.bankapp.dao.ClientDao;
import com.dzadvisory.bankapp.entity.Client;
import com.dzadvisory.bankapp.entity.ClientContact;
import com.dzadvisory.bankapp.service.ClientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ClientRestController {

    private ClientService clientService;

    public ClientRestController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }


    @GetMapping("/clients/{theClientID}")
    public Client getClientByID(@PathVariable int theClientID) {

        Client theClient = clientService.getClientByID(theClientID);

        return theClient;
    }

    @GetMapping("/contacts")
    public List<ClientContact> getAllContacts() {
        return clientService.getAllContacts();
    }
}
