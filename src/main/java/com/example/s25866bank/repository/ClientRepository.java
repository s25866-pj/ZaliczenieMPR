package com.example.s25866bank.repository;

import com.example.s25866bank.model.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    private List<Client> clientList = new ArrayList<>();
    public void save(Client client){
        if(clientList.contains(client)){
//            throw new Exception();
        }
        clientList.add(client);
    }
     public Optional<Client> findById(int id){
        return clientList.stream().filter(it -> it.getId()==id).findFirst();
     }
     public void removeAll(){
        clientList = new ArrayList<>();
     }
     public void SetNewNoney(Client client, int  wyplata){
//         () -> clientList.stream()
//                 .filter(it -> it.equals(client))
//                 .forEach(it -> it.Account(wyplata))
     }

}
