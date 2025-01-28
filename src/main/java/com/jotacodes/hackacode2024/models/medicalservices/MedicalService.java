package com.jotacodes.hackacode2024.models.medicalservices;

public class MedicalService {

    protected Long id_service;
    protected String name;
    protected String description;
    protected Long price;

    public MedicalService(Long id_service, String name, String description, Long price) {
        this.id_service = id_service;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
