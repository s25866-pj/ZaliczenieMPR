package com.example.s25866bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private final int id;
    private final String name;
    private final String Secondname;
    private final int Account;
}