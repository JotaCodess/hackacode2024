package com.jotacodes.hackacode2024.models;

import java.util.Date;

public class Patient extends Person{

    private Integer id_patient;

    public Patient(String name, String lastname, String dni, Date birthDate, String email, String tlf,
            String direction, Integer id) {
        super(name, lastname, dni, birthDate, email, tlf, direction);
        id_patient = id;
    }  
}
