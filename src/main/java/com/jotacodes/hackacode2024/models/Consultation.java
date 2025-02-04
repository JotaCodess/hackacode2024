package com.jotacodes.hackacode2024.models;

import java.util.Date;

import com.jotacodes.hackacode2024.models.medicalservices.MedicPackage;

public class Consultation {

    private Long id;
    private Date consultDate;
    private Date hourDate;
    private Patient patient;
    private Medic medic;
    private MedicPackage medicPackage;
    private Double totalAmount;
    private Boolean hasPaid;
}
