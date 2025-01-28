package com.jotacodes.hackacode2024.models;

import java.util.Date;

public class Person {

    protected String name;
    protected String lastname;
    protected String dni;
    protected Date birthDate;
    protected String email;
    protected String tlf;
    protected String direction;

    public Person(String name, String lastname, String dni, Date birthDate, String email, String tlf,
            String direction) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.birthDate = birthDate;
        this.email = email;
        this.tlf = tlf;
        this.direction = direction;
    } 
}
