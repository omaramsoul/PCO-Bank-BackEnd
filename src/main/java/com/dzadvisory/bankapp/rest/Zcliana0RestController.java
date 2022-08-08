package com.dzadvisory.bankapp.rest;

import com.dzadvisory.bankapp.entity.Zcliena0;
import com.dzadvisory.bankapp.entity.Zclinta0;
import com.dzadvisory.bankapp.service.Zcliena0Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Zcliana0RestController {

    private Zcliena0Service ZCLIENA0Service;

    public Zcliana0RestController(Zcliena0Service ZCLIENA0Service) {
        this.ZCLIENA0Service = ZCLIENA0Service;
    }


    @GetMapping("/clients")
    public List<Zcliena0> getAllClients() {
        return ZCLIENA0Service.getAllClients();
    }


    @GetMapping("/clients/{theClientID}")
    public Zcliena0 getClientByID(@PathVariable int theClientID) {

        Zcliena0 theZcliena0 = ZCLIENA0Service.getClientByID(theClientID);

        return theZcliena0;
    }

    @GetMapping("/contacts")
    public List<Zclinta0> getAllContacts() {
        return ZCLIENA0Service.getAllContacts();
    }

}
