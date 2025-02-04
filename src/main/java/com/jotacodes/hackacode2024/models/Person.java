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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    } 

    
}
