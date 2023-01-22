package com.example.s25866bank.controller;

import com.example.s25866bank.Exception.DatabaseException;
import com.example.s25866bank.model.Client;
import com.example.s25866bank.service.ClientService;
import jakarta.xml.bind.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Clientcontroller {
    private final ClientService clientService;

    public Clientcontroller(ClientService clientService) {
        this.clientService = clientService;
    }
    @PostMapping("/create")
    public ResponseEntity<Client> createClient(@RequestBody Client client){
//        try{
            clientService.create(client);
//        }
//        catch (ValidationException validationException){
//            return ResponseEntity.badRequest().build();
//        }
//        catch (DatabaseException databaseException){
//            return ResponseEntity.unprocessableEntity().build();
//        }
        ResponseEntity.ok().build();
        return null;
    }
}
