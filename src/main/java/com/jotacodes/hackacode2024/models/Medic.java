package com.jotacodes.hackacode2024.models;

import java.util.Date;

public class Medic extends Person{

    private String medicSpecialist;
    private String freeShift; // turno
    private Double salary;

    public Medic(String name, String lastname, String dni, Date birthDate,
     String email, String tlf, String direction, String specialist, String shift, Double salar) {
        super(name, lastname, dni, birthDate, email, tlf, direction);
        medicSpecialist = specialist;
        freeShift = shift;
        salar = salary;
    }   
}
