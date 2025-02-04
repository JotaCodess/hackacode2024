package com.jotacodes.hackacode2024.models.medicalservices;

public class MedicalService {

    protected Long id_service;
    protected String name;
    protected String description;
    protected Double price;

    public MedicalService(Long id_service, String name, String description, Double price) {
        this.id_service = id_service;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId_service() {
        return id_service;
    }

    public void setId_service(Long id_service) {
        this.id_service = id_service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
}
