package com.example.s25866bank.service;

import com.example.s25866bank.Exception.DatabaseException;
import com.example.s25866bank.model.Client;
import com.example.s25866bank.repository.ClientRepository;
import jakarta.xml.bind.ValidationException;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public void create(Client client){
        try{
            clientRepository.save(client);
        }catch(Exception e){
            throw new DatabaseException(" Error code: ",e);
        }

    }
    private boolean isInvalid (String attribute){
        return attribute == null || attribute.isBlank();
    }

}
