package com.example.s25866bank.controller;

import com.example.s25866bank.service.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Clientcontroller {
    private final ClientService clientService;

    public Clientcontroller(ClientService clientService) {
        this.clientService = clientService;
    }
}
